package com.Aspig.luogu;

import java.util.Scanner;
//区间内的真素数
public class lg_5 {
	static boolean check(int n)//寻找素数
	{
		if(n==1)
		{
			return false;
		}
		for (int i = 2; i*i <= n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int num(int x)//调换数字顺序
	{
		int num = 0;
		while(x!=0)
		{
			num = num*10+x%10;
			x/=10;
		}
		return num;
	}
public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int m,n;
         m = scanner.nextInt();
         n = scanner.nextInt();
        int num = 0;
        int flag = 0;
         for (int i = m; i <=n; i++) {
			if(check(i))
			{
			     int t = num(i);
			     if(check(t))
			     {
			    	 if(flag==0)
			    	 {
			    		 System.out.print(i);
			    	 }
			    	 else {
						System.out.print(","+i);
					} 
			    	 flag =1;
			     }
			}
		}
         if(flag == 0)
        	 System.out.println("No");
}
}
