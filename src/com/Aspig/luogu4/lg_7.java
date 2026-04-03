package com.Aspig.luogu4;

import java.util.Scanner;
//最大正方形
public class lg_7 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
      int n,m;
      n = scanner.nextInt();
      m  = scanner.nextInt();
      int[][] arr = new int[n+1][m+1];
     int[][] S = new int[n+1][m+1];
      for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=m; j++) {
			arr[i][j] = scanner.nextInt();
		}
	}
    //前缀和初始化  
      for (int i = 1; i <=n; i++) {
  		for (int j = 1; j <=m; j++) {
  		S[i][j] = S[i][j-1]+S[i-1][j]-S[i-1][j-1]+arr[i][j];
  		}
  	}
      int max=0;
      for (int i = 1; i <=n; i++) {
    		for (int j = 1; j <=m; j++) {
           int maxb = Math.min(n-i+1, m-j+1);//以(i,j)为起点 最多能向右/下延申的长度取最小 就是正方形的最大边长
         for (int k =1; k <=maxb; k++) {//遍历所有合理的边
        	 int x2 = i+k-1;
        	 int y2 = j+k-1;
        	 int sum = S[x2][y2]-S[x2][j-1]-S[i-1][y2]+S[i-1][j-1];			        	 
        	 if(sum==k*k)//说明边长是k的正方形里sum都是1
        	 {
        		 max = Math.max(k, max);//求所有符合题意的最大边长
        	 }        	 
		}
    		}
    	}
      System.out.println(max);
}
}
