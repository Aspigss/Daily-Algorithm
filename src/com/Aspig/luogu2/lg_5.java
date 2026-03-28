package com.Aspig.luogu2;

import java.util.Arrays;
import java.util.Scanner;
//ºÏ≤‚µ„≤È—Ø
public class lg_5 {
	static class Zuo{
		int x;
		int y;
		int count;
		public Zuo() {
			// TODO Auto-generated constructor stub
		}
		public Zuo(int x, int y,int count) {
			super();
			this.x = x;
			this.y = y;
			this.count = count;
		}
		
	}
     public static void main(String[] args) {
		int n,x,y;
		Scanner scanner = new Scanner(System.in);
       n = scanner.nextInt();
       x= scanner.nextInt();
       y = scanner.nextInt();
       Zuo[] zuos = new Zuo[n+1];
       for (int i = 1; i <=n; i++) {
        		int cx  = scanner.nextInt();
        		int cy  = scanner.nextInt();
	                zuos[i] = new Zuo(cx,cy,i);
       }
      
       Arrays.sort(zuos,1,n+1,(a,b)->{
    	
    	   double num=(a.x-x)*(a.x-x)+(a.y-y)*(a.y-y);
    	   double num2 =(b.x-x)*(b.x-x)+(b.y-y)*(b.y-y);
    	   
    	   double t1  =Math.sqrt(num);
    	  double t2= Math.sqrt(num2);
        if(t1>t2)
        {
        	return 1;
        }
        else if(t2>t1)
        	return -1;
        else {
			return a.count-b.count;
		}
       });
       int j =1;
       for (int i = 1; i <=n; i++) {
      		System.out.println(zuos[i].count);
      	    j++;
      	    if(j==4)
      	    	break;
       }
     }
}
