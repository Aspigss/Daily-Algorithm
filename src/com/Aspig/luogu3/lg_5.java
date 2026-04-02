package com.Aspig.luogu3;
import java.util.*;
//二转十
public class lg_5 {

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

	  public static void main(String[] args) {
	    String s;
	    Scanner sc = new Scanner(System.in);
	    s = sc.next();
	    int num = c1(s, 2);
	    System.out.println(num);
	  }
	}
