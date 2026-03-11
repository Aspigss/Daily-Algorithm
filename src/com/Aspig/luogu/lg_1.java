package com.Aspig.luogu;

import java.util.Scanner;
//ÇóÔ¼Êý
public class lg_1 {
       public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
       int a  =scanner.nextInt();
		 for (int i = 1; i <= a; i++) {
			if(a%i==0 )
			{
				System.out.println(i);
			}
		}
	}
}
