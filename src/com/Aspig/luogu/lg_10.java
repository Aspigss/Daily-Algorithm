package com.Aspig.luogu;

import java.util.Iterator;
import java.util.Scanner;

public class lg_10 {
	 static final int N = 40001;
	 static int[] primes = new int[N];
	 static boolean[] st = new boolean[N];
	 static void count_prime()
	 {
			int count = 0;
		   	for (int i = 2; i <=20007; i++) {
				if(st[i]) continue;
				primes[++count] = i;
				for (int j = i+i; j <=20007; j=j+i) {
				st[j] = true;	
				}
			}
	
	 }
      public static void main(String[] args) {
    	  //筛选质数
    	  count_prime();
	    	Scanner scanner = new Scanner(System.in);
		   	
	    	int n = scanner.nextInt();
		   	int m =  scanner.nextInt();
	    	int sum = 0;
	    	int ans = 0;
	     	int[] a = new int[n];
	     	int[] b = new int[m];
		   	int[] t = new int[N];//判断sum是否重复
		   	for (int i = 0; i <n; i++) {
				a[i] = scanner.nextInt();
			}
		  	for (int i = 0; i <m; i++) {
				b[i] = scanner.nextInt();
			}
		
		  	for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					sum = a[i]+b[j];
					if(sum<=n+m&&!st[sum]&&t[sum]==0)
					{
						t[sum] = 1;
						ans++;
					}
				}
			}
		  	System.out.println(ans);
	}
}
