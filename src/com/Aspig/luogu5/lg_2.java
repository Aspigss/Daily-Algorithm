package com.Aspig.luogu5;

import java.util.Scanner;
//判断字符串是否为回文
public class lg_2 {
    static boolean check(String s)
    {
    	char[] c = s.toCharArray();
    	int l = 0;
         int r = s.length()-1;
         while(l<r)
         {
             if(c[l]!=c[r])  return false;  	 
        	 l++;
        	 r--;
         }
         return true;
    }
	public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
	String s = scanner.next();
	if(check(s))
	{
		System.out.println("yes");
	}
	else
		System.out.println("no");
}
}
