package com.Aspig.luogu;

import java.util.Scanner;
//阶乘数码
public class lg_7 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    //末尾的零只能由 2*5 产生，而阶乘中 2的数量远多于 5,只需要计算所有数中包含的 5的因子总数
    long sum = 0;
    int count = 0;
    for (long i = 1; i <=n; i++) {//从1!到n!
	    long now = i;
    	while(now%5==0)
    	{
    		count++;
    		now/=5;
    	}
		sum+=count;//注意这里count 不清零 则 5!到9!每次都算一个5....以此类推
	}
    System.out.println(sum);
}
}
