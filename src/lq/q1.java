package lq;
import java.util.Scanner;

public class  q1 {
	
  public static void main(String[] args) {
   int n;
   long ans =0;
   int sum = 0;
   for (int i = 1; i <=2025; i++) {
	  ans = (long)i*i*i;
    if(ans%10==3)
    {
      sum++;
    }
   }
    System.out.println(sum);
}
}
