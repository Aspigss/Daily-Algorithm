package lq2_c;

import java.util.Scanner;

import javax.security.auth.Subject;

public class q3 {
          public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n=scanner.nextInt();
			double d = scanner.nextDouble();
			double num = Math.pow(2, n)*d;
			long ans = Math.round(num);
			System.out.println(ans);
          }
}
