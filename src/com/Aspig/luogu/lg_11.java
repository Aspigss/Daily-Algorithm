package com.Aspig.luogu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//哥德巴赫猜想（升级版）
public class lg_11 {
 static final int N = 20007;
 static int[] primes = new int[N];
 static boolean[] st = new boolean[N];

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	int count = 0;		 
	 for (int i = 2; i <=n; i++) {//先筛选质数
				if(st[i])
				{
					continue;
				}
				primes[++count] = i;
				for (int j = i+i; j <= n; j= i+j) {
					st[j] = true;
				}
			}
	 //用先判断前两个是不是质数(刚好一定是最小)  再用n-前两个 得到的是不是质数判断
	 for (int i = 2; i <=n; i++) {
		if(st[i]) continue;
		for (int j = i; j <=n; j++) {
			if (st[j]) continue;
			int p3 = n-i-j;
			if(p3>=2&&!st[p3])
			{
				System.out.println(i+" "+j+" "+(n-i-j));
			return;
			}
			
		}
	}
        /* 暴力
         * int[] num = new int[3];
         outerLoop:
	for (int i = 1; i <=count; i++) {
		for (int j = 1; j <=count; j++) {
			for (int k = 1; k <=count; k++) {
				num[0] = primes[i];
				num[1] = primes[j];
				num[2] = primes[k];
				if(primes[i]+primes[j]+primes[k]==n)
				{
                         Arrays.sort(num);
					System.out.println(num[0]+" "+num[1]+" "+num[2]);
					break outerLoop;
				}
			}
		}
	}*/
}
}

