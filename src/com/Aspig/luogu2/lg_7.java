package com.Aspig.luogu2;

import java.util.Scanner;

public class lg_7 {
public static void main(String[] args) {
      int n,m;
      Scanner scanner = new Scanner(System.in);
      n=scanner.nextInt();
      m=scanner.nextInt();
      int[][] arr= new int[n][m];
      boolean[][] del = new boolean[n][m];
      for (int i = 0; i <n; i++) {
		for (int j = 0; j <m; j++) {
			arr[i][j]  = scanner.nextInt();
		}
	}
      //标记行
      for (int i = 0; i <n; i++) {
  	   int len =1;
    	  for (int j = 1; j <m; j++) {
  			if(arr[i][j-1]==arr[i][j])
  			{
  				len++;
  			}
  			else
  			{
  				if(len>=3)
  				{
  					for (int k = j-len; k<j; k++) {
						del[i][k]=true;
					}
  				}
  				len=1;//重新定义长度 因为可能在从j开始又有不同数字的连续
  			}			
  		}
    	  if(len>=3)//如果一直连续到结束 单独判断
    	  {
    		  for (int k = m-len; k <m; k++) {
				del[i][k] = true;
			}
    	  }
  	}
      //标记列
     
      for (int j = 0; j <m; j++) {
  	   int len =1;
    	  for (int i = 1; i <n; i++) {
  			if(arr[i-1][j]==arr[i][j])
  			{
  				len++;
  			}
  			else
  			{
  				if(len>=3)
  				{
  					for (int k = i-len; k<i; k++) {
						del[k][j]=true;
					}
  				}
  				len=1;//重新定义长度 因为可能在从j开始又有不同数字的连续
  			}			
  		}
    	  if(len>=3)//如果一直连续到结束 单独判断
    	  {
    		  for (int k = n-len; k <n; k++) {
				del[k][j] = true;
			}
    	  }
  	}
      for (int i = 0; i <n; i++) {
	for (int j = 0; j <m; j++) {
		if(del[i][j]==true)
		{
			arr[i][j]=0;
		}
	
	}
}
      for (int i = 0; i <n; i++) {
    		for (int j = 0; j <m; j++) {
    		System.out.print(arr[i][j]+" ");
    		if(j==m-1) {
			System.out.println();}
    		}
    	}
}
}
