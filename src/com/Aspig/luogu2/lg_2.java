package com.Aspig.luogu2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
//递增三元组
public class lg_2 {
	static int lower(int[] a,int target)
	{
		int left = -1;
		int right = a.length;
		while(left+1<right)
		{
			int mid = left+(right-left)/2;
			if(a[mid]<target)
			{
				left = mid;
			}
			else {
				right = mid;
			}
		}
		return right;
	}
	static int upper(int[] a,int target)
	{
		int left = -1;
		int right = a.length;
		while(left+1<right)
		{
			int mid = left+(right-left)/2;
			if(a[mid]<=target)
			{
				left = mid;
			}
			else {
				right = mid;
			}
		}
		return right;
	}
public static void main(String[] args) {
	int n;
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	int[] a = new int[n];
	int[] b = new int[n];
	int[] c = new int[n];
	for (int i = 0; i < n; i++) {
		a[i] = scanner.nextInt();
	}
	for (int i = 0; i < n; i++) {
		b[i] = scanner.nextInt();
	}
	for (int i = 0; i < n; i++) {
		c[i] = scanner.nextInt();
	}
	Arrays.sort(a);
	Arrays.sort(c);
   int da=0;
   int xiao =0;
   long sum = 0;
	for(int num:b)
	{
		xiao = lower(a,num);//比num小的下标 刚好是总共的个数
		da = c.length-upper(c, num);
		sum+= xiao*da;
	}
	System.out.println(sum);
}
}
