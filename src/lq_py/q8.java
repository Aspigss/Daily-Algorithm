package lq_py;

import java.util.Scanner;

public class q8 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int a[] = new int[n+1];
	for (int i = 1; i <=n; i++) {
		a[i] = scanner.nextInt();
	}
	int sum = 0;
	for (int i = 1; i <=n; i++) {
		for (int j = i+1; j <=n; j++) {
			sum+=(a[i]^a[j])*(j-i);
		}
	}
	System.out.println(sum);
}
}
