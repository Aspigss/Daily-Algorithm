package com.Aspig.luogu3;
import java.util.*;
//进制转换
public class lg_3 {
     //k->十可以用到两个函数
	static int c(char c) {
	    if (c <= '9' & c >= 0) {
	      return c - '0';
	    }
	    return c - 'A' + 10;
	  }
	  static long c1(String a, int k) // k->十
	      {
	    long ans = 0;
	    for (int i = 0; i < a.length(); i++) {
	      ans = ans * k + c(a.charAt(i));
	    }
	    return ans;
	  }

	  static String c2(long num, int k) // 十->k
	      {
	    if (num == 0) return "0";
	    String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String ans = "";//初始化为空字符串
	    while (num > 0) {
	      ans = s.charAt((int) num % k) + ans;//直接把新的拼到旧的的前头
	      num /= k;
	    }
	    return ans;
	  }

	  public static void main(String[] args) {
	    String s;
	    Scanner sc = new Scanner(System.in);
	    int k1;
	    k1 = sc.nextInt();
	    s = sc.next();
	    int k2 = sc.nextInt();
	    long num = c1(s, k1);
	    String s2 = c2(num, k2);
	    System.out.println(s2);
	  }
	}
