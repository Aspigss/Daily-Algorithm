package com.Aspig.luogu3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
// [GESP202409 四级] 黑白方块
public class lg_2 {


	static boolean pan(int a[][],int x,int y)
	{       //第一行
		if(a[x][y]!=0||a[x][y+1]!=0||a[x][y+2]!=0||a[x][y+3]!=0)
			return false;
		  //第二行
		if(a[x+1][y]!=0||a[x+1][y+1]!=1||a[x+1][y+2]!=1||a[x+1][y+3]!=0)
			return false;
		  //第三行
		if(a[x+2][y]!=0||a[x+2][y+1]!=1||a[x+2][y+2]!=1||a[x+2][y+3]!=0)
			return false;
		  //第四行
		if(a[x+3][y]!=0||a[x+3][y+1]!=0||a[x+3][y+2]!=0||a[x+3][y+3]!=0)
			return false;
		return true;
	}
	public static void main(String[] args) {
		int t;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		int h,l;
		for (int i = 0; i <t; i++) {
			
			h  = scanner.nextInt();
			l = scanner.nextInt();
			//scanner.nextLine();
			int[][] kuai = new int[h][l];//输入黑白块
			for (int j = 0; j <h; j++) {
				String line = scanner.next();
				for (int k = 0; k <l; k++) {
					kuai[j][k] = line.charAt(k)-'0';//字符转化为数字
				}
			}
			//找左上角的方块可以在哪里取
			boolean flag;//判断是否存在符合题意的
			int ok = 0;
				for (int j = 0; j <=h-4; j++) {
				for (int k = 0; k <=l-4; k++) {
					 flag = pan(kuai, j, k);
					if(flag)
					{
						ok = 1;
					}
				}
			}
			
			if(ok==1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
		}
	}
}


