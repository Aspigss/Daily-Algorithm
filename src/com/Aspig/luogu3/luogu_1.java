package com.Aspig.luogu3;
import java.util.*;
// [GESP202312 四级] 田忌赛马
public class luogu_1 {
	  static int search(int[] a, int target) {//二分查找
	    int l = -1;
	    int r = a.length;
	    while (l + 1 < r) {
	      int mid = (l + r) / 2;
	      if (a[mid] >= target) {
	        r = mid;
	      } else {
	        l = mid;
	      }
	    }
	    return r;
	  }
	  //search(a,t),找>=t的a的第一个index
	  //search(a,t+1) 找>t的a的第一个index
      //search(a,t)-1 找<t的a的第一个index
	  //search(a,t+1)-1 找<=	t的a的第一个index
	  public static void main(String[]  args) {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int[] me = new int[n];
	    int[] tian = new int[n];
	    boolean use[] = new boolean[n]; // 记录用过的马的下标
	    for (int i = 0; i < n; i++) {
	      me[i] = sc.nextInt();
	    }
	    for (int i = 0; i < n; i++) {
	      tian[i] = sc.nextInt();
	    }
	    Arrays.sort(me);
	    // 用田去一个个对比我的马
	    int count = 0;

	    for (int i = 0; i < n; i++) {

	      int target = tian[i];
	      int index = search(me, target + 1);//找第一个>target的index         
	      while (index < n && use[index]) {
	        index++;
	      }
	      if (index < n) {
	        count++;
	        use[index] = true;
	      }
	      /* if ((tian[i] < me[j]) && use[me[j]] == true) {
	        count++;
	        use[me[j]] = false;
	        break;
	      }*/
	      //  if(count==n)//如果我每个马都能跑的比田鸡的快

	    }

	    System.out.println(count);
	  }
	}
