package com.Aspig.luogu4;

import java.util.Scanner;

//Ç°×ºÒì»òºÍ
public class lg_3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int m = scanner.nextInt();
	int[] arr = new int[n+1];
	int[] S = new int[n+1];
	for (int i = 1; i <=n; i++) {
		arr[i] = scanner.nextInt();
	}
	for (int i = 1; i <=n; i++) {
		S[i] = S[i-1]^arr[i];
	}
	while(m-->0)
	{
		int l = scanner.nextInt();
		int r = scanner.nextInt();
	   	System.out.println(S[r]^S[l-1]);
	}
}
}
