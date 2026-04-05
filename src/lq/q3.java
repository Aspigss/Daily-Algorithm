package lq;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class q3 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
    int n  = scanner.nextInt(); 
    while(n-->0)
    {
    	int m = scanner.nextInt();
    	int[] a = new int[m];
    	for (int i = 0; i < m; i++) {
			a[i] = scanner.nextInt();
			
		}
    	int ans = 0;
    	for (int i = 0; i < m; i++) {
			ans = ans^a[i];
		}
    	if(ans==0)
    	{
             System.out.println("YES");    		
    	}
    	else
    		
    	System.out.println("NO");
    }
}
}
