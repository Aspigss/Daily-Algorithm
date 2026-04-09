package lq_py;

import java.util.Arrays;
import java.util.Scanner;

public class q5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n =scanner.nextInt();
	int a[] = new int[n+1];
	for (int i = 1; i<=n; i++) {
		a[i] = scanner.nextInt();
	}
	int count = 0;
	for (int i = 1; i <=n; i++) {
		if(a[i]==i) continue;//如果书本==编号 不换
		for (int j = i; j <=n; j++) {
            if(a[j]==i)
            {
            	int t = a[i];
            	a[i] = a[j];
            	a[j] = t;
            	count++;
            }
		}
	}
	System.out.println(count);
}
}
