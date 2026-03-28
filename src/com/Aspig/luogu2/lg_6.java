package com.Aspig.luogu2;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
//最高分 真尼玛难啊cnm
public class lg_6 {
	
       public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m= sc.nextInt();
         int[] score = new int[n];
         for (int i = 0; i <n; i++) {
			score[i]=  sc.nextInt();
		}
         boolean[] isDouble = new boolean[n];
       //标记所有可以翻倍的题
         for (int i = 0; i <m; i++) {
		int index = sc.nextInt()-1;
		isDouble[index] = true;
	}
         long absum=0;
         ArrayList<Integer> doubleList = new ArrayList<>();//用集合去把翻倍的题目分数存起来
         for (int i = 0; i <n; i++) {
        	 if(isDouble[i])
        	 {
        		 doubleList.add(score[i]);
        	 }
        	 else {
				
        		 absum+=score[i];//全部普通题目的分数
			}
		}
         int doubleCount = doubleList.size();
        
         Collections.sort(doubleList);//排序列表
        long[] desert = new long[m+1];
        for (int i = 0; i <doubleCount; i++) {
			desert[i+1] = desert[i]+doubleList.get(i);//丢弃几个翻倍的题目的总分数
		}
        long dousum = desert[doubleCount];
        long ans=0;
        for (int i = 0; i <=doubleCount; i++) {
	             long t1  = desert[doubleCount]-desert[i];//舍弃i个翻倍题后的翻倍题总分
	             long t2 = t1+absum;//能加起来的所有题目分数
	             long current =  t2*(long)Math.pow(2, i);
	             ans = Math.max(ans,current);
		}
        System.out.println(ans);
       }
       }
