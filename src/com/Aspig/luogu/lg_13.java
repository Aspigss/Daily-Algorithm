package com.Aspig.luogu;

import java.util.Arrays;
import java.util.Scanner;
//[蓝桥杯 2019 省 B] 等差数列
public class lg_13 {
     static long gcd(long a, long b) {//求最大公约数    最小公倍数 就是 a*b/gcd(a,b);
		if(b==0) return a;
    	 return gcd(b, a%b);
	}
    public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	int n = scanner.nextInt();
        	int[] arr = new int[n];
        	for (int i = 0; i <n; i++) {
			   arr[i]  = scanner.nextInt();	
			}
        	Arrays.sort(arr);//将输入的数字排序
        	long mind = 0;
	       for (int i = 0; i <n-1; i++) {
			int d = arr[i+1]-arr[i];//求每个相邻数字的差
		      mind = gcd(mind, d);//求最大公约数差 的最小值   进而知道了公差
	       }
	       if(mind==0)//如果公差是零 说明题目给的已经是等差 直接返回题目给的
	       {
	    	   System.out.println(n);
	       }
	       else
	       {
	    	   long x = (arr[n-1]-arr[0])/mind+1;     //等差数列的项数 ＝ (最大项-最小)/公差+1;
	       System.out.println(x);
	       }
	       
    }
}
