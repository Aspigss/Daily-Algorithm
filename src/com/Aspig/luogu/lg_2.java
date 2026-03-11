package com.Aspig.luogu;

import java.util.Scanner;
//求正整数 2 和 n 之间的完全数
public class lg_2 {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n ; 
	n = scanner.nextInt();
	for (int j = 2; j <=n; j++) {
		int sum = 0;
		   for (int i = 1; i < j ; i++) {
	         if(j%i == 0 )
	         {
	        	 sum = sum + i;
	        
	         }
	   	}
		   if(sum==j)
		   {
			   System.out.println(j);
		   }
	}

}
}
