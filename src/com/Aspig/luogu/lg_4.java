package com.Aspig.luogu;

import java.util.Scanner;
//ËØÊı¶Ô
public class lg_4 {
	static boolean check(int n)
	{
		if(n==1)
		{
			return false;
		}
		for (int i = 2; i *i<= n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
public static void main(String[] args) {
	int n;
	Scanner scanner = new Scanner(System.in);
	n= scanner.nextInt();
	int flag =0;
	for (int i = 1; i <=n-2; i++) {
		 if(check(i)&&check((i+2)))
		 {
			 System.out.println(i+" "+(i+2));
			 flag=1;
		 }
	}
	if(flag==0)
	{
		System.out.println("empty");
	}
}
}
