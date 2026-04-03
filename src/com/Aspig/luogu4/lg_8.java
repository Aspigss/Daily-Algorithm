package com.Aspig.luogu4;

import java.util.Scanner;

public class lg_8 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
    int n,m;
    n = scanner.nextInt();
    m  = scanner.nextInt();
    int[][] arr = new int[n+1][n+1];
   int[][] D = new int[n+2][n+2];
    for (int i = 1; i <=m; i++) {
	int x1 = scanner.nextInt();
	int y1 = scanner.nextInt();
	int x2 = scanner.nextInt();
	int y2 = scanner.nextInt();
	D[x1][y1]+=1;
	D[x1][y2+1]-=1;
	D[x2+1][y1]-=1;
	D[x2+1][y2+1]+=1;
    }
    for (int i = 1; i <=n; i++) {
		for (int j =1; j <=n; j++) {
			D[i][j] = D[i-1][j]+D[i][j-1]-D[i-1][j-1]+D[i][j];
		}
	}
    for (int i = 1; i <=n; i++) {
  		for (int j =1; j <=n; j++) {
  			System.out.print(D[i][j]+" ");
  			if(j==n)
  				System.out.println();
  		}
  	}
    
}
}
