package com.Aspig.luogu4;

import java.util.Scanner;
//[yLCPC2024] A. dx 分计算
public class lg_1 {
	static int eachScore(char c) {
	if(c=='P')    return 3;
	else if(c=='p')    return 2;
	else if(c=='G')    return 1;
	else   return 0;
	
		}
	
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  while(n-->0)
	  {
			String get;
			get = scanner.next();
		char[] c = (" "+get).toCharArray();
		int length = get.length();		
			int[] S = new int[length+1];//前缀和
		for (int i =1; i <=length; i++) {
			S[i] = S[i-1]+eachScore(c[i]);
		}
			int ask = scanner.nextInt();
			for (int i = 0; i <ask; i++) {
				int l,r;
				l = scanner.nextInt();
				r = scanner.nextInt();
			  int ans  = S[r]-S[l-1];
			   System.out.println(ans);
			}

	  }
  }
}
