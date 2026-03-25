//涂条纹
package com.Aspig.luogu;

import java.util.Scanner;

public class lg_19 {
public static void main(String[] args) {
	int n,m;
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	m = scanner.nextInt();
	scanner.nextLine();
	int[][] arr = new int[n+1][3];//每一行都对W B R 计数
	
	for (int i = 1; i <=n; i++) {
	  String   s = scanner.nextLine();//用字符串接收一行
         int w=0,b=0,r=0;//初始化计数器
      for(char c : s.toCharArray())//把s转为字符数组然后存给c 每次一下 直到s结束
      {
    	  if(c!='W')
    	  {
    		  w++;
    	  }
    	  if(c!='B')//不用else if!
    	  {
    		  b++;
    	  }
    	  if(c!='R')
    	  {
    		  r++;
    	  }
      }
       //更新每一行的wbr数
        arr[i][0] = w;
        arr[i][1] = b;
        arr[i][2] = r;
	}
	int min = Integer.MAX_VALUE;
	for (int i = 1; i <=n-2; i++) {//至少留两行涂蓝和红
		for (int j = i+1; j <=n-1 ; j++) {//至少剩下一行涂红色
			int total = 0;
			for (int k = 1; k<=i; k++) {//从1到i全部涂白
					total+=arr[k][0];//总共要涂几个白色
			}
			for (int k = i+1; k <=j; k++) {
				total+=arr[k][1];//总共的蓝色加之前的
			}
			for (int k = j+1; k <=n; k++) {
				total+=arr[k][2];//总共的红色加之前的
				
			}
			min = Math.min(min, total);
		}
	}
	System.out.println(min);
}
}
