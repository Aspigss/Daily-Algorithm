package lq;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Savepoint;
import java.util.Scanner;
import java.util.StringTokenizer;
//数组反转(只拿暴力分数
public class q5 {
	static void revese(int[] a ,int l,int r)
	{
		while(l<r)
		{
			int t = a[l];
			a[l] = a[r];
			a[r] = t;
			l++;
			r--;
		}
	}
public static void main(String[] args) throws IOException {
	//Scanner scanner = new Scanner(System.in);
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(bf.readLine());
	//int n = scanner.nextInt();
	int n = Integer.parseInt(st.nextToken());
	int[] a = new int[n+1];
	int[] b = new int[n+1];
	 st = new StringTokenizer(bf.readLine());
	for (int i = 1; i <=n; i++) {
		a[i] = Integer.parseInt(st.nextToken());
		b[i] = a[i];//储存a数组
	}
	long ans = 0;
	for (int l = 1; l <=n; l++) {
		for (int r =l; r <=n; r++) {
			revese(a,l,r);//翻转l-r
		int count = 1;//记录相等的连续数组
		long pre = a[1];
			
		for (int i = 2; i <=n; i++) {
			if(a[i]==a[i-1])//相同
			{
		    count++;		
			}
			else {//不同
				ans = Math.max((long)pre*count, ans);//求出之前相同的ans
				pre=a[i];//更新
				count = 1;//更新 以这个元素作为第一个连续
			}
			if(i==n)
			{
				ans = Math.max((long)pre*count, ans);
			}
		}
		for (int i = 1; i <=n; i++) {
			a[i] = b[i];//还原a数组
		}
		}
	}
	System.out.println(ans);
	
}
}
