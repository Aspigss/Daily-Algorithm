package com.Aspig.luogu4;
//[NOIP 2018 提高组] 铺设道路
import java.util.Scanner;

public class lg_6 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] arr = new int[n+1];
	int[] D = new int[n+2];
	for (int i = 1; i <=n; i++) {
		arr[i] = scanner.nextInt();
	}
	for (int i = 1; i <=n; i++) {//初始化差分数组
         D[i] = arr[i]-arr[i-1];		
	}
	//要想得到全为0的答案   差分数组也必须全为0
     int ans =0;
	for (int i = 1; i <=n; i++) {
		if(D[i]>0)//只要差分数组存在>0的数字 大小是x 就+x天 
//至于-x天->因为题目说了"需要保证，区间内的每块区域在填充前下陷深度均不为 0" 所以原数组不会出现0和1  也就是说只要考虑差分数组是正数的情况 -x的天数最终会和正数抵消或者正数更多
	      ans = ans+D[i];
	}
	System.out.println(ans);
}
}
