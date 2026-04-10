package lq2_c;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.Source;

public class q5 {
       static long gys(long a,long b)
       {
    	   if(b==0) return a;
    	   return gys(b, a%b);
       }
       static long lcm(long a,long b)
       {
    	   return ((long)(a*b)/gys(a, b));
       }
       public static void main(String[] args) {

    	   Scanner scanner = new Scanner(System.in);
	   int n = scanner.nextInt();
	   int a[] = new int[n];
	   for (int i = 0; i <n; i++) {
		a[i] = scanner.nextInt();
	}
	   double max = 0;
	   int mi = 0,mj = 0,mk = 0;
	   for (int i = 0; i <n; i++) {
		for (int j = i+1; j <n; j++) {
			for (int k = j+1; k <n; k++) {
				 double x1 = lcm(lcm(a[i], a[j]), a[k]);
				   double x2 = lcm(a[i], a[j]);
				   double x3 = lcm(a[i], a[k]);
				   double x4 = lcm(a[j], a[k]);
				   double s = a[0]*a[1]*a[2]*(x1/(x2*x3*x4));	
				   if(max<s)
				   {
					   max = s;
				       mi = i;
				       mj = j;
				       mk = k;
				   }
			}
		}
	}
	   System.out.println(a[mi]+" "+a[mj]+" "+a[mk]);
	  
	}
}
