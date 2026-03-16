package com.Aspig.luogu;

import java.util.Scanner;
//P10424 [À¶ÇÅ±­ 2024 Ê¡ B] ºÃÊı
public class lg_15 {
	static boolean get(int n )
	{
		int count = 1;
		while(n>0)
		{
			int num = n%10;
			n/=10;
			if(((num%2==0)&&(count%2!=0))||((num%2!=0)&&(count%2==0)))
			{
				return false;
			}
			count++;
		}
		return true;
	}
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int count = 0;
	for (int i = 1; i <=n; i++) {
		if(get(i))
		{
			count++;
		}
	}
	System.out.println(count);
}
}
