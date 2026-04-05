package lq;

import java.awt.Shape;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class q4 {
//	static boolean isz(int num)
//	{
//		if(num==1) return false;
//		for (int i = 2; i <=num/2; i++) {
//			if(num%i==0)
//				return false;
//		}
//		return true;
//	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int m = scanner.nextInt();
	int[] a = new int[n];
	int[] b = new int[m];
	for (int i = 0; i <n; i++) {
		a[i] =scanner.nextInt();
	}
	for (int i = 0; i <m; i++) {
		b[i]  =scanner.nextInt();
	}
	Arrays.sort(a);
	Arrays.sort(b);
	boolean[] isPrime = new boolean[n+m+1];//质数筛
	for (int i = 2; i<n+m+1; i++) {
		isPrime[i] = true;//假设从2开始所有数字都是质数
	}
	for (int i = 2; i*i <n+m+1; i++) {//遍历
		if(isPrime[i])
		{
			for (int j =i*i; j <n+m+1; j=j+i) {
				isPrime[j] = false;
			}
		}
	}
   HashSet<Integer> hashSet = new HashSet<>();
	for (int i = 0; i <n; i++) {
		int s = 0;
		for (int j = 0; j <m; j++) {
			s = a[i]+b[j];   
			if(s>n+m)
			{
				break;
			}
			else if(s<=n+m&&isPrime[s]){
				hashSet.add(s);
			}
		}
	}
	System.out.println(hashSet.size());
	
}
}
