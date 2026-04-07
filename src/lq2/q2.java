package lq2;

import java.awt.Checkbox;
import java.util.Arrays;

public class q2 {
	public static void main(String[] args) {
		for (int i = 10000000; i>0; i--) {
			if(check(i))
			{
				System.out.println(i);
	          break;
			}
		}
	}
	static boolean check(int num)
	{
          String string = num+"";
          int l  = string.length();
          int[] a = new int[l];//规定长度l的数组
          for (int i = 0; i <l; i++) {//把num每个单独的数组存进a数组
			a[i] = string.charAt(i)-'0';
		}
          int sum = 0;
          for (int i = l; ; i++) {
			sum = Arrays.stream(a).sum();//一行代码实现a数组的全部元素求和
			if(sum>=num)//找到符合条件的sum
				break;
			else {
				a[i%l] = sum;//每次都是求前l个数的和   直接用数组来把不用的那个给替换成新的				
			}
			
		}
          return sum==num;
	}
}

