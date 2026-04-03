package com.Aspig.luogu4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//[蓝桥杯 2023 省 Java A] 棋盘
public class lg_9{
public static void main(String[] args) throws IOException {
	Scanner scanner =new Scanner(System.in);
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//要用快写不然会TLE!
    int n,m;
    n = scanner.nextInt();
    m  = scanner.nextInt();
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
  			if(D[i][j]%2==0)
  			{
  				bw.write("0");
  			}
  			else
  			{
  				bw.write("1");
  			}
  			
  		}
  		bw.write("\n");
  	}
bw.flush();
bw.close();
}
}
