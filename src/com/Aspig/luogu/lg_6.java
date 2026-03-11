package com.Aspig.luogu;

import java.util.Scanner;
//¸çµÂ°ÍºÕ²ÂÏë
public class lg_6 {
	static boolean check(int n)//Ñ°ÕÒËØÊı
	{
		if(n==1)
		{
			return false;
		}
		for (int i = 2; i*i <= n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int n ; 
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 4; i <=n; ) {
			for (int j = 2; j <=i; j++) {
				if(check(j)&&check(i-j))
				{
					System.out.println(i+"="+j+"+"+(i-j));
                     break;
				}
			}
			i = i+2;
		}
	}
}
