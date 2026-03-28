package com.Aspig.luogu2;

import java.util.Arrays;
import java.util.Scanner;
//绝对值排序
public class lg_4 {
public static void main(String[] args) {
	int n;
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	Integer[] a = new Integer[n];
	for (int i = 0; i <n; i++) {
		a[i] = scanner.nextInt();
	}
	Arrays.sort(a,(x,y)->{
		return Math.abs(x)-Math.abs(y);//绝对值更大的那个升序排列
	});
	for(int b:a)
	{
		System.out.print(b+" ");
	}
}
}
