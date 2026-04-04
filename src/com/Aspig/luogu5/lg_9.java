package com.Aspig.luogu5;

import java.util.Scanner;

public class lg_9 {
	static int f(int n,int x)
	{
		if(n==0) return 1;
		if(n==1) return 2*x;
		else return 2*x*f(n-1, x)-2*(n-1)*f(n-2, x);	
	}
public static void main(String[] args) {
	int n,x;
	Scanner  scanner = new Scanner(System.in);
	n = scanner.nextInt();
	x= scanner.nextInt();
	System.out.println(f(n, x));
}
}
