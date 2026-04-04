package com.Aspig.luogu5;

import java.util.Scanner;
// [蓝桥杯 2025 省 A/Python B 第二场] 消消乐
public class lg_4 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 String s = scanner.next();
	 int l = 0;
	 int r= s.length()-1;
	 int sum = 0;
	 while(l<r)
	 {
		 if(s.charAt(l)!='A')//如果第一个没找到A l++
		 {
			 l++;
		 }
		 else if(s.charAt(r)!='B'){//找到A 但是想从最后找B r--
			r--;
		}
		if(s.charAt(l)=='A'&&s.charAt(r)=='B')
		{
			sum+=2;
			l++;
			r--;
		}
	 }
	 System.out.println(s.length()-sum);
}
}
