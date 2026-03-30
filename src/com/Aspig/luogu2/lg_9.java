package com.Aspig.luogu2;
//日期相加
import java.time.DayOfWeek;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class lg_9 {
	static int fsum(int num) {
	    while (num >= 10) { // 关键：不是一位数就一直加!!!!!!!
	        int ans = 0;
	        while(num != 0) {
	            ans += num % 10;
	            num /= 10;
	        }
	        num = ans;
	    }
	    return num;
	}
public static void main(String[] args) {
	int day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	int ans = 0;
	int n;
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	int count = 0;
for (int year = 2000; year <=2023; year++) {
	day[2] = 28;
	if(year%400==0||(year%4==0&&year%100!=0))//是闰年
				{
					day[2] = 29;
				}		
			
	for (int month = 1; month <=12; month++) {		
		for (int days = 1; days <=day[month]; days++) {
			if(year==2023&&month==4&&days==21)
			{
				System.out.println(count);
				return;
			}
			int sum = 0;
			int ysum = fsum(year);
			int msum = fsum(month);
			int dsum = fsum(days);
			sum = ysum+msum+dsum;
			ans = fsum(sum);
			if(ans==n)
			{
				count++;
			}
			
		}
	}
}

System.out.println(count);
}
}
