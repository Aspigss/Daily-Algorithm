package com.Aspig.luogu5;

import java.util.Arrays;
import java.util.Scanner;
//±¶œ‰
public class lg_5 {
  public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	int n = scanner.nextInt();
	int k = scanner.nextInt();
	int[] a = new int[n+1];
	for (int i = 1; i <=n; i++) {
		a[i] = scanner.nextInt();
	}
	Arrays.sort(a);
	int sum =0;
	int max =0;
	for (int l = 1,r=0; l <=n; l++) {
		while(r<n)
		{
			r++;
			sum+=a[r];
			if(a[r]-a[l]>k)
			{
				sum-=a[r];
				r--;
				break;
			}
		}
	   max = Math.max(max,sum);
		sum-=a[l];
	}
	System.out.println(max);
}
}
