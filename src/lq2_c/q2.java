package lq2_c;

import java.util.Scanner;
import java.util.function.IntConsumer;
//用字符串接收 转化为char 然后char[i]
//24 c[1]=2 c[2] = 4????   c[1] = 4  c[2] = 2 
public class q2 {
	static boolean check(int i)
	{
	  int count = 1;//奇偶数位
		while(i>0)
		{
			int t = i%10;//数字
			if(count%2!=0)//奇数位数
			{
				if(t%2==0) return false;
			}
			else {
				if(t%2!=0) return false;
			}
			i/=10;
			count++;
		}
		return true;
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	   int n  = scanner.nextInt();
	int ans = 0;
	   for (int i = 1; i <=n; i++) {
		if(check(i))
		{
			
			 ans++;
		}
	}
	   System.out.println(ans);
}
}
