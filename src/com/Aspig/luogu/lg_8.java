package com.Aspig.luogu;

import java.util.Scanner;

//分解质因数
public class lg_8 {
	static int[] a = new int[40];
	static void divide(int x)
	{
		
		int len = 0;	
		System.out.print(x+"=");
		for(int i = 2;i*i<=x;i++)
		{
			while(x%i==0)
			{
			
				a[++len]  = i;
				x/=i;
			}
		}
		if(x>1)
		{
			a[++len] = x;
		}
		for (int i = 1; i <len; i++) {
			System.out.print(a[i]+"*");
		}
		System.out.println(a[len]);
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int m = scanner.nextInt();
	int n = scanner.nextInt();
	for (int i = m; i <= n; i++) {
		divide(i);
	}
	
}
}
