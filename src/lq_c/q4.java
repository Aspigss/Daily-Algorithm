package lq_c;

import java.util.Scanner;

public class q4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int T = scanner.nextInt();
	long A,B,C,K;
	for (int i = 0; i <T; i++) {
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
	   K  = scanner.nextInt();
	 while(K-->0)
	 {                
		long  tA = (B+C)/2;
		long  tB = (A+C)/2;
		long tC = (B+A)/2;		
		A =tA;
		B=tB;
		C=tC;
		if(A==B&&B==C) break;
	 }
	 System.out.println(A+" "+B+" "+C);
	}
}
}
