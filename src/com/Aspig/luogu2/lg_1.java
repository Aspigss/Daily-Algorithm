package com.Aspig.luogu2;

import java.util.Scanner;

public class lg_1 {
	static boolean check(String s)//ÅĞ¶Ï»ØÎÄÊı
	{
		char[] c = s.toCharArray();
		int l = 0;
		int r = s.length()-1;
		while(l<=r)
		{
			if(c[l]==c[r])
			{
				l++;
				r--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	int n;
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	scanner.nextLine();
	for (int i = 0; i <n; i++) {
		String s = scanner.nextLine();
		String s1,s2;
		int found = 0;
		for (int j = 1; j <s.length(); j++) {
			 s1 = s.substring(0, j);
			 s2  = s.substring(j);
			// System.out.println(s1+" "+s2);
			if(check(s2)&&check(s1)&&s1.length()>=2&&s2.length()>=2)
			{
				found=1;
			}
			
		}
		if(found==1)
			System.out.println("Yes");
		else {
			System.out.println("No");
		}
		
	}
}
}
