package lq;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lg_6 {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
    int n  = scanner.nextInt();
    int m =scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i <n; i++) {
         a[i] = scanner.nextInt();		
	}
    
    for (int i = 0; i <n; i++) {
    	for (int num = 0; num <=100; num++) {
			int x = a[i]+num;					
		}
		for (int j = 0; j <n; j++) {
			for (int num = 0; num <=100; num++) {
				int x = a[i]+num;					
			}
			for (int k = 0; k <n; k++) {
				for (int num = 0; num <=100; num++) {
					int x = a[i]+num;
					int y = a[j]+num;
					int z = a[k]+num;					
				}
			}
		}
	}
}
}
