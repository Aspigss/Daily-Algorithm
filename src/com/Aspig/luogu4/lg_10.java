package com.Aspig.luogu4;

import java.util.Scanner;
//和不超过S的最长序列
public class lg_10 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n =scanner.nextInt();
	int target= scanner.nextInt();
	int[] a = new int[n+1];
	for (int i = 1; i <=n; i++) {
        a[i] = scanner.nextInt();		
 	}
	int sum = 0;
	int ans =0;
	for (int l = 1,r=0; l<=n; l++) {
		while(r<n)
		{
			r++;
			sum +=a[r];
			if(sum>target)//不符合题意
			{
				sum-=a[r];
				r--;
	            break;//已经不符合题意没必要往下了
			}
			
		}
		int length = r-l+1;
		ans =Math.max(ans, length);//求最大长
		sum-=a[l];
	}
System.out.println(ans);
}

}
