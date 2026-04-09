package lq_c;

import java.util.Scanner;
//2->-1 0 1 2
//3->-2 -1 0 1 2 3
//4->-3 -2 -1 0 1 2 3 4
//除了1以外每个数字都可以用前面的连续和为0加本身来表示 
public class    q3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] a = new int[n];
	for (int i = 0; i <n; i++) {
		a[i] = scanner.nextInt();
}
	int count = 0;
	for (int i = 0; i <n; i++) {
		if(a[i]!=1)
			count++;
	}
	System.out.println(count);
}
}
