package com.Aspig.luogu;

import java.util.Scanner;
//求回文数

public class lg_14 {
	static boolean get(int num)
	{
		String a = Integer.toString(num);
		int left = 0 ; 
		int right = a.length()-1;
		while(left<right)
		{
			if(a.charAt(left)==a.charAt(right))
			{
				left++;
				right--;
			}
			else
				return false;
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
