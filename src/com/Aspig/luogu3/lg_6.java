package com.Aspig.luogu3;
//进制判断
import java.util.Scanner;

public class lg_6 {
   //k->十
	static int ctoi (char c)
	{
		if(c>='0'&&c<='9') return c-'0';
		return c-'A'+10;
	}
	static long c1(String s,int k)
	{
		
		long ans =0;
		long maxB = 1000000000L; 
		for (int i = 0; i < s.length(); i++) {
			if(ctoi(s.charAt(i))<k)
			{
				ans = ans*k+ctoi(s.charAt(i));
			   if(ans>maxB)//防止溢出!!!
				return -1;
			}
		    else {
				return -1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		int n;
		n = scanner.nextInt();
		String[] A = new String[n];
		long[] B = new long[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.next();
			B[i] = scanner.nextInt();
		}
		int karr[] = {2,4,8,16};
		for(int j = 0;j<n;j++) {
			int count = 0;//记录有几个合法
			long ans =0;
		for (int i = 0; i < karr.length; i++) {
		long num = c1(A[j], karr[i]);
			 if(num!=-1&&num<=B[j])
			{
				 ans =num;
			     count++;
			}
			 
		    }	
			if(count==1)//只能有一个合法       有多个合法或者没有合法都是输出-1
			{
				System.out.println(ans);
			}
			else {
				System.out.println(-1);
			}
		}
	}
}
