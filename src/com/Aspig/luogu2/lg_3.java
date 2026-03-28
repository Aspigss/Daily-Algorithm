package com.Aspig.luogu2;



import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//成绩排序
public class lg_3{
	static class Stu{//成绩类
		String name;
		int score;
		public Stu(){}
		public Stu(String name, int score) {
			super();
			this.name = name;
			this.score = score;
		}
	}
   public static void main(String[] args) {
	int n;
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	Stu[] students = new Stu[n];//对象数组 用来储存多个不同学生
	for (int i = 0; i < n; i++) {
     		String name;
     		int score;
     		name = scanner.next();
     		score = scanner.nextInt();
     		students[i] = new Stu(name,score);
	}
	Arrays.sort(students,(a,b)->{//Arrays.sort(要操作的数组,进行的操作) 
		if(a.score==b.score)//a,b分别代表从student[0]开始往后递增
		{
			return a.name.compareTo(b.name);//compatrTo是Array.sort的默认方法 平时默认省略
		}
		return b.score-a.score; 
	});
	for (int j = 0; j < n; j++) {
		System.out.println(students[j].name+" "+students[j].score);
	}
	
}
}
