package com.Aspig.luogu6;

import java.util.Scanner;
import java.util.Stack;
// 合法括号序列
public class lg_1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n  = scanner.nextInt();
	if(n%2!=0)
	{
		System.out.println("No");
		return;
	}
	String s=scanner.next();
    Stack<Character> stack = new Stack<>();
    char[] c = s.toCharArray();
    for (int i = 0; i <n; i++) {
		if(c[i]=='(')
		{
			stack.push(c[i]);
		}
		else//遇到右括号
		{
			if(stack.isEmpty())
			{
				System.out.println("No");
				return;
			}
			else
			{
				stack.pop();
			}
		}
	}
    if(stack.isEmpty())//如果循环结束了 栈是空 说明已经全部匹配完了
    {
    	System.out.println("Yes");
    }
    else {
		System.out.println("No");
	}
}
}
