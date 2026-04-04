package com.Aspig.luogu5;

import java.util.Scanner;

public class lg_9 {
	static long f(int n,int x)//·ÀÖ¹Òç³ö
	{
		if(n==0) return 1L;
		if(n==1) return 2L*x;
		else return 2L*x*f(n-1, x)-2L*(n-1)*f(n-2, x);	
	}
public static void main(String[] args) {
	int n,x;
	Scanner  scanner = new Scanner(System.in);
	n = scanner.nextInt();
	x= scanner.nextInt();
	System.out.println(f(n, x));
}
}
