package lq_py;

import java.util.Scanner;
//LQ图形    (我是傻逼我是傻逼
public class q2 {
     public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int w,h,v;
		w = scanner.nextInt();
		h= scanner.nextInt();
		v = scanner.nextInt();
		int zh = w+h;
		int zl = v+w;
		int count = 0;
		for (int i = 0; i <h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print("Q");
			}
			System.out.println();
		}
		for (int i = 0; i <w; i++) {
			for (int j = 0; j < zl; j++) {
				System.out.print("Q");
			}
			System.out.println();
		}
	}
}
