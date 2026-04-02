package com.Aspig.luogu3;
//[蓝桥杯 2025 省 Java B] 电池分组
import java.util.Scanner;

import javax.xml.transform.Source;

public class lg_8 {
public static void main(String[] args) {
	int T;
	Scanner scanner = new Scanner(System.in);
	T = scanner.nextInt();
	int n;
	for (int i = 0; i <T; i++) {
	
		int total = 0;
		n = scanner.nextInt();
	int[] arr = new int[n];
	for (int j = 0; j <n; j++) {
		arr[j] = scanner.nextInt();
		//因为分组之后分别异或对比的结果 和直接异或是一样的效果
		//分组异或如果相等 直接异或就是0 不等就是1  所以直接异或来实现相同的对比效果
		//直接异或=0 分组可以相等 如果!= 分组就不可能相等
		total = total^arr[j];
	}	
	if(total==0)
	{
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	
	}
}
}
