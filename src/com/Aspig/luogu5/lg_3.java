package com.Aspig.luogu5;

import java.util.Arrays;
import java.util.Scanner;

//蓝桥杯 2023 国 Java B] 玩具
public class lg_3 {
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);	
	  int n = scanner.nextInt();
	  int[] w = new int[2*n];
	  for (int i = 0; i <2*n; i++) {
		w[i] = scanner.nextInt();
	}
	  long sum = 0;
	  int l =0;
	  int r = 2*n-1;
	  Arrays.sort(w);
     //贪心->排序之后让最小*最大 次小*次大  得到的和一定比大*大+小*小来的更小
	  while(l<r)
	  {
		  sum+=(long)w[l]*w[r];
		  l++;
		  r--;
	  }
         System.out.println(sum);
     
}
}
