package com.Aspig.luogu5;

import java.util.Scanner;
//Éî»ù7.Àı7¡¿¼ÆËã½×³Ë
public class lg_6 {
	static int get(int num)
	{
		if(num==1) return 1;
		return num*(get(num-1));
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
    System.out.println(get(n));
}
}
