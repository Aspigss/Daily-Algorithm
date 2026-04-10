package lq2_c;

import java.util.Arrays;
import java.util.Scanner;

public class q6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	int a[] = new int[n+1];
	int s[] = new int[n+1];
	for (int i = 1; i <=n; i++) {
		a[i]= sc.nextInt();
	    s[i] = s[i-1]+a[i];//初始化前缀和
	}
	
	long cha = Long.MAX_VALUE;
	long min = Long.MAX_VALUE;
	int s1 = 0;
	int s2 = 0;
	for (int l1 = 1; l1 < n; l1++) {
		for (int r1 = l1; r1 <n; r1++) {
			s1 = s[r1]-s[l1-1];	
			for (int l2 = r1+1; l2 <=n; l2++) {
				for (int r2 = l2; r2 <=n; r2++) {
					s2 = s[r2]-s[l2-1];
					min = Math.min(min, Math.abs(s1-s2));
					
				}
			}
		}
	}
	System.out.println(min);
}
}
