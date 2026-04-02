package com.Aspig.luogu3;
//[蓝桥杯 2024 省 Python B] 穿越时空之门
public class lg_7 {
//十进制->k
static String c(int num,int k) {
	if(num==0) return "0";
       	String ans="";
       	String d = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       	while(num>0)
       	{
       		ans = d.charAt(num%k)+ans;
       	    num/=k;
       	}
       	return ans;
}
static int sum(String s)
{
	char[] c = s.toCharArray();
	int sum = 0;
	for (int i = 0; i <s.length(); i++) {
		 sum = sum + c[i]-'0';
	}
	return sum;
}
    public static void main(String[] args) {
int count = 0;
    	for (int i = 1; i <=2024; i++) {
		String two = c(i, 2);
		String four = c(i, 4);
		int sumt = sum(two);
		int sumf = sum(four);
		if(sumf==sumt)
			count++;
	}
    	System.out.println(count);
    }
}
