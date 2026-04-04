package com.Aspig.luogu5;

import java.util.Scanner;
// °¢¿ËÂü£¨Ackermann£©º¯Êı
public class lg_8 {
	static int f(int m,int n)
	{
		if(m==0) return n+1;
		if(n==0) return f(m-1, 1);
		return f(m-1, f(m, n-1));
	}
public static void main(String[] args) {
	int m,n;
	Scanner scanner = new Scanner(System.in);
	m = scanner.nextInt();
	n =scanner.nextInt();
   System.out.println(f(m, n));
}
}
