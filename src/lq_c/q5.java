package lq_c;

import java.util.Arrays;
import java.util.Scanner;

public class q5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int m = scanner.nextInt();
	int[] b = new int[n+1];
	for (int i = 1; i <=n; i++) {
		b[i] = scanner.nextInt();
	}
	Arrays.sort(b);//1 2 4 5
		long min = Long.MAX_VALUE;
		
		System.out.println(min);
	for (int l = 1; l+m-1<=n; l++) {
		long sum = 0;//求每次的和
		int r = l+m-1;
		sum+=Math.abs((long)b[r]*b[r]-(long)b[l]*b[l]);
	    min  = Math.min(min, sum);//记录比较每次的和和最小 谁更小
	}
	System.out.println(min);
}
}
