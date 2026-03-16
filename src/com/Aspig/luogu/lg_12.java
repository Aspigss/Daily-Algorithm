package com.Aspig.luogu;

import java.util.Scanner;

public class lg_12 {
     //[蓝桥杯青少年组省赛 2023] 质因数的个数
    public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	int n = scanner.nextInt();
        	int m = scanner.nextInt();
        	int maxcnt = 0;
        	int[] a = new int[m+1];//用埃氏筛     先把全部都看作素数 是0
        	for (int i = 2; i <=m; i++) {
				if(a[i]==0)//如果是素数 进行分解
				{
					for (int j = i; j <=m; j=j+i) {//分解质因数      (这时候已经确定了i是质数
						int k = j;
						while(k%i==0)
						{
							a[j]++;//找j的质因数个数   进行一次说明 i是j的一个质因数 就加一
							k/=i;
						}
					}
				}//不是素数 继续循环
			}
			for (int i = n; i <=m; i++) {
				maxcnt = Math.max(maxcnt, a[i]);
			}
			System.out.println(maxcnt);
		}
}
