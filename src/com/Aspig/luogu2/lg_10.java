package com.Aspig.luogu2;

import java.util.Scanner;

import javax.security.auth.Subject;

//[蓝桥杯 2023 国 Java B] 不完整的算式
public class lg_10 {
public static void main(String[] args) {
	String suan;
	Scanner scanner = new Scanner(System.in);
	suan = scanner.next();
    char[] s = suan.toCharArray();
    
    	//找到=的位置
        int isden = -1;
		for (int j = 0; j < suan.length(); j++) {
			 if(s[j]=='=')
			   {
				isden = j;
          		break;
			   }
		}
		
		char op = 0;	
		//先找到op不是?的位置	
		int isop = -1;
		for (int j = 0; j < suan.length(); j++) {
		if(s[j]=='+'||s[j]=='-'||s[j]=='*'||s[j]=='/')
		{
			 isop = j;
			 break;
		}
		}
		int a ;
		int b ;
		int c ;
	
	   for (int i = 1; i <suan.length(); i++) {
		//如果A是?
		if(s[0]=='?')
		{
		// a = "?";
		 op= s[isop];
	     b = Integer.parseInt(suan.substring(isop+1,isden));
	     c = Integer.parseInt(suan.substring(isden+1));
	     if(op=='+') System.out.println(c-b);
	     else if(op=='-') System.out.println(c+b);
	     else if(op=='*')  System.out.println(c/b);
	     else if(op=='/') System.out.println(c*b);
	     return;
		}
		//如果op是?
		else if((isop==-1)&& s[0]!='?'&&s[i]=='?')//第一个出现的s[i]=?就是op位置
		{          
			 a = Integer.parseInt(suan.substring(0,i));
			 //op = '?';
			 b = Integer.parseInt(suan.substring(i+1,isden));
			 c = Integer.parseInt(suan.substring(isden+1));
			  if(c==a+b) System.out.println("+");
			 else if(c==a-b) System.out.println("-");
			 else if(c==a*b) System.out.println("*");
			 else if(c==a/b) System.out.println("/");
			  return;
		}
		//如果B是?
		else if(isop!=-1&&s[isop+1]=='?')
		{
			a = Integer.parseInt(suan.substring(0,isop));
			op = s[isop];
			//b = "?";
			c = Integer.parseInt(suan.substring(isden+1));
			 if(op=='+') System.out.println(c-a);
			else  if(op=='-')  System.out.println(a-c);
			else if(op=='*')   System.out.println(c/a);
			else if(op=='/')  System.out.println(a/c);
			 return;
		    
		}
			//如果C是?
		else if(isop!=-1&&s[i]=='?'&&s[i-1]=='=')
		{
			a = Integer.parseInt(suan.substring(0,isop));
			op = s[isop];
			b = Integer.parseInt(suan.substring(isop+1,isden));
		   // c = "?";
			 if(op=='+') System.out.println(a+b);
			 else  if(op=='-')	 System.out.println(a-b);
			 else if(op=='*')  System.out.println(a*b);
			 else if(op=='/') System.out.println(a/b);
			 return;
		}
	}
}
}