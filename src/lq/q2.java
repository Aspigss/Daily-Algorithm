package lq;

public class q2 {
public static void main(String[] args) {
	int n;
	long a = 20250412L;
	long b = 20240413L;
	/*
	 * n+a =kb
	 * n+b%a==0
	 */
	int i =0;
     while(true)
      {
    	 long N = i*b-a;
    	 if((N+b)%a==0)
    	 {
    		 System.out.println(N);
    		 break;
    	 }
//       	  if((i*b-a+b)%a==0)
//       	  {
//       		  System.out.println(i*b-a);
//           	  break;
//       	  }
      	  i++;
       }
}
}
