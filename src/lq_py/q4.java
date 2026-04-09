package lq_py;

import java.util.Scanner;

public class q4 {
public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	int n = scanner.nextInt();
	int ans=0;
	for (int i = 1; i <=n; i++) {
		if(i>n) break;
		for (int j = 1; j <=n; j++) {
			if(i*j>n) break;
			for (int j2 = 1; j2 <=n; j2++) {
				if(i*j+j2>n) break;
				for (int k = 1; k <=n; k++) {
					if((i*j+j2*k)<=n)
					{
						ans++;
					}
					else {
						break;
					}
				}
			}
		}
	}
	System.out.println(ans);

}
}
