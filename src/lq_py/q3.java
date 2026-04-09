package lq_py;

import java.awt.Checkbox;
import java.util.Arrays;
import java.util.Scanner;

public class q3 {
	static boolean check(char a,char b,char c)
	{
		char[] v = {a,b,c};
		Arrays.sort(v);
		if(v[0]=='b'&&v[1]=='l'&&v[2]=='q')
		{
			return true;
		}
		else {
			return false;
		}
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String string  = scanner.next();
	char c[]  =  string.toCharArray();
	int ans =0;
	for (int i = 0; i <string.length()-2;) {
		if(check(c[i],c[i+1],c[i+2]))
		{
			ans++;
			i+=3;
		}
		else {
			i++;
		}
	}
System.out.println(ans);
}
}
