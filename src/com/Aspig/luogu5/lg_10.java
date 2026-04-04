package com.Aspig.luogu5;

import java.util.Scanner;
//魔法水晶
public class lg_10 {
    static long f(int l,int r,int a[])
    {
    	int mid = (l+r)/2;
    	if(l==r) return 0; //区间相等 不分裂直接结束
    	//计算左边最大数值
    	int max = 0;
    	for (int i = l; i <=mid; i++) {
			max = Math.max(max,a[i]);
		}
    	//计算右边最小值
    	int min = Integer.MAX_VALUE;
    	for (int i = mid+1; i <=r; i++) {
			min = Math.min(min, a[i]);
		}
    	//dfs往下递归
         return (long)max*min+f(l,mid,a)+f(mid+1, r, a);//往左右分裂
    }
	public static void main(String[] args) {
        	 Scanner scanner = new Scanner(System.in);
			 int n = scanner.nextInt();
			int[] A = new int[n+1];
			for (int i = 1; i <= n; i++) {
				A[i] = scanner.nextInt();
			}
			int l = 1;
	    	int r = A.length-1;
			System.out.println(f(l, r, A));
		}
}
