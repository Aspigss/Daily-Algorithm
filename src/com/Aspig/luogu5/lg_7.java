package com.Aspig.luogu5;

import java.util.Scanner;

public class lg_7 {
	static int fb(int a)
	{
		if(a==1||a==2) return 1;
		return fb(a-1)+fb(a-2);
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
