package com.Aspig.luogu3;
//十转二
	import java.util.*;

	public class lg_4 {
	  static int c(char c) {
	    if (c <= '9' & c >= 0) {
	      return c - '0';
	    }
	    return c - 'A' + 10;
	  }

	  static int c1(String a, int k) // k->十
	      {
	    int ans = 0;
	    for (int i = 0; i < a.length(); i++) {
	      ans = ans * k + c(a.charAt(i));
	    }
	    return ans;
	  }

	  static String c2(int num, int k) // 十->k
	      {
	    if (num == 0) return "0";
	    String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String ans = "";
	    while (num > 0) {
	      ans = s.charAt(num % k) + ans;
	      num /= k;
	    }
	    return ans;
	  }

	  public static void main(String[] args) {
	    String s;
	    int num;
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    String s2 = c2(num, 2);//十转二
	    System.out.println(s2);
	  }
	}
