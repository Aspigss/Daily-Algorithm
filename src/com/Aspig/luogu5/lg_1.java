package com.Aspig.luogu5;
import java.util.Scanner;

public class lg_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x =sc.nextInt();
	int[] a = new int[n+1];
	for (int i = 1; i<=n; i++) {
		a[i] = sc.nextInt();
	}
	int l = 0;
	int r = n;
	int ans = 0;
	while(l<r)
	{
		if(a[l]+a[r]>x)
		{
			r--;
		}
		else if(a[l]+a[r]==x) {
			ans++;
			l++;
		}
		else
		{
			l++;
		}
	}
	System.out.println(ans);
}

}
