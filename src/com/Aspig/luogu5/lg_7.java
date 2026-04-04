package com.Aspig.luogu5;

import java.util.Scanner;
//斐波那契
public class lg_7 {
	static int fb(int a)
	{
		if(a==1||a==2) return 1;//定界
		return fb(a-1)+fb(a-2);//递归公式
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	for (int i = 0; i <n; i++) {
		int a = scanner.nextInt();
		System.out.println(fb(a));
	}
}
}
