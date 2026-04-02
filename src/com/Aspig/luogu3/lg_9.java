	package com.Aspig.luogu3;
	//[传智杯 #4 初赛] 小卡和质数
	import java.util.Scanner;
	
	public class lg_9 {
	   public static void main(String[] args) {
		
		   int n;
		   Scanner scanner=new Scanner(System.in);
	       n = scanner.nextInt();
		   while(n-->0)
		   {
			   int x = scanner.nextInt();
			   int y = scanner.nextInt();
	//因为两个数异或=1 ->只有两个数第一位数是不同的 其他位数都相同的时候 异或结果为1->两个数差值为1的时候出现->必定一奇一偶->质数又只有第一个2是偶数 ->所以只可能是x=1 y=2 ||x=2 y=1 
			   
			   if(x==1&&y==2||x==2&&y==1)
			   {
				   System.out.println("Yes");
			   }
			   else {
				System.out.println("No");
			}
		   }
		   
		   
	}
	}
