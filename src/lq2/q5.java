package lq2;

import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;
//[蓝桥杯 2024 省 Java B] 最优分组   数学概率
public class q5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	double p = scanner.nextDouble();
	int mink=Integer.MAX_VALUE;
	double minneed = Double.MAX_VALUE;
	double need;
	double P;
	for (int k = 1; k <=n; k++) {
		if(n%k==0)//k个人可以分组
		{
			if(k==1)
			{
				need = n;
			}
		else {
			P =Math.pow(1-p, k);//k个人 为阴性的概率
		      need = (P+(1-P)*(k+1))*(n/k); // n/k组的人需要的试剂的期望
		}
			if(need<=minneed)//满足有更小的需要的试剂 更新
			{
				minneed = need;
				mink = k;
			}
		}
	}
	System.out.println(mink);
}
}
