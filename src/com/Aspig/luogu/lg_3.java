package com.Aspig.luogu;

import java.util.Scanner;
//ËØÊı¸öÊı
public class lg_3 {
	static boolean check(int n)
	{
		if(n==1)
		{
			return false;
		}
		for (int i = 2; i*i<= n; i++) {
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	int count = 0 ;
	Scanner scanner = new Scanner(System.in);
	int n  = scanner.nextInt();
	for (int i = 2; i <=n; i++) {
		if (check(i)) {
			count++;
		}
	}
	System.out.println(count);
}
}
