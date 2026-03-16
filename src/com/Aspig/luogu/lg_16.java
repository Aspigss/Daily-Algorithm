package com.Aspig.luogu;

import java.util.Scanner;

//小蓝的漆房
public class lg_16 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int t = scanner.nextInt();
	int n;
	int k;
	
	
	for (int i = 0; i <t; i++) {
		n = scanner.nextInt();
		k = scanner.nextInt();
		int[] a = new int[n];
	    
	      for (int j = 0; j <n; j++) {
                 a[j] = scanner.nextInt();			
		}
	     int ans = Integer.MAX_VALUE;
	for (int color = 1; color <=60; color++) { //看房子是不是color 是的话不刷 下次循环 不是的刷
		int count = 0;
		for (int j2 = 0; j2 < a.length; j2++) {
			if(color!=a[j2])
			{
				count++;
				j2 = j2+k-1;//因为循环结束还有j2++ 所以要-1
			}
		}
		ans = Math.min(ans, count);
	}
	System.out.println(ans);
	}
	
}
}
