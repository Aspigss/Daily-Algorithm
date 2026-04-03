package com.Aspig.luogu4;

import java.util.Scanner;
//水壶
public class lg_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int d = scanner.nextInt();
	int[] water = new int[n+1];
     int[] S = new int[n+1];//前缀和	
	for (int i = 1; i <=n; i++) {
		water[i] = scanner.nextInt();
	}
	for (int i = 1; i <=n; i++) {
		S[i] = S[i-1]+water[i];
	}
	int ans =0;
	int r = d+1;
	int l = 1;
     for (int i = 0; i <n-d; i++) {
    	int sum = S[r]-S[l-1];
    	l++;
    	r++;
    	//for (int j = 1; j <=d+1; j++) { 暴力!
    			//sum = sum+water[j];
    		//}
    		
    		ans = Math.max(ans, sum);
	}
     System.out.println(ans);
}
}
