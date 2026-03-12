package com.Aspig.luogu;

import java.util.Scanner;

//埃氏筛选法
public class LG_9 {
   static final int N = 1000007;
   static int[] primes = new int[N];
   static boolean[] st = new boolean[N];//标记  如果st[i]是false i就是素数
public static void main(String[] args) {
	Scanner scanner = new Scanner( System.in);
	int n = scanner.nextInt();
int count = 0;
	for (int i = 2; i <=n; i++) {
		if(st[i])
		{
			continue;
		}
		primes[++count] =i;
		for (int j = i+i; j <=n; j= j +i) {
						st[j] = true;
		}
	}
	System.out.println(count);
}
}
