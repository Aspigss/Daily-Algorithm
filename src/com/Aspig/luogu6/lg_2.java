package com.Aspig.luogu6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class lg_2 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int n = scanner.nextInt();
	int[] count = new int[1001];
	int num;
	for (int i = 0; i < n; i++) {
		num = scanner.nextInt();
		count[num]++;
	}
	for (int times = 1000; times>=1; times--) {
		for (num = 0; num<=1000; num++) {//相同次数的情况下遍历每个num 
			//直接输出count[num]==times的
			if(count[num]==times)
			{
				System.out.println(num+" "+count[num]);
			}
		}
	}
	/*
	//用哈希表
	HashMap<Integer, Integer> hashMap = new HashMap<>();
	for (int i = 0; i <n; i++) {
		num  = scanner.nextInt();
	    hashMap.put(num, hashMap.getOrDefault(num,0)+1);//给num设值	
	}
	ArrayList<int[]> arrayList = new ArrayList<>();
	for (int k:hashMap.keySet()) {
		arrayList.add(new int[]{k,hashMap.get(k)});
	}
	Collections.sort(arrayList,(a,b)->{
		if(a[1]==b[1])//value相同 正序
		{
			return a[0]-b[0];
		}
		else
		{
			return b[1]-a[1];
		}
	});
	for(int[] t :arrayList)
	{
		System.out.println(t[0]+" "+t[1]);
	}
*/
}
}
