package com.Aspig.luogu;

import java.util.Scanner;

public class lg_20 {
	static boolean check(String[] s,int x,int y)
	{
		if(s[x].charAt(y)!='0'||s[x].charAt(y+1)!='0'||s[x].charAt(y+2)!='0'||s[x].charAt(y+3)!='0')
		{
         			return false;
		}
		if(s[x+1].charAt(y)!='0'||s[x+1].charAt(y+1)!='1'||s[x+1].charAt(y+2)!='1'||s[x+1].charAt(y+3)!='0')
		{
         			return false;
		}
		if(s[x+2].charAt(y)!='0'||s[x+2].charAt(y+1)!='1'||s[x+2].charAt(y+2)!='1'||s[x+2].charAt(y+3)!='0')
		{
         			return false;
		}
		if(s[x+3].charAt(y)!='0'||s[x+3].charAt(y+1)!='0'||s[x+3].charAt(y+2)!='0'||s[x+3].charAt(y+3)!='0')
		{
         			return false;
		}
		return true;
	}
 public static void main(String[] args) {
	int t;
	Scanner scanner = new Scanner(System.in);
	t = scanner.nextInt();
	for (int i = 0; i <t; i++) {
		
		int n,m;
		n=scanner.nextInt();
		m=scanner.nextInt();
		scanner.nextLine();
		String[] s = new String[n];
		for (int j = 0; j <n; j++) {//把每一行都存进s[i]
			s[j] = scanner.next();
		}
		int found =0;
		//遍历每个4*4的满足条件左上角 
	    for (int j = 0; j <=n-4&&found==0; j++) {//要满足n-4条件 才能构成4*4 且j只取满足条件的左上角
			for (int k = 0; k <=m-4&&found==0; k++) {
				if(check(s, j, k))
				{
					found=1;
				}
			}
		}
		if(found==1)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
}
