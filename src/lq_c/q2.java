package lq_c;

public class q2 {
	//dfs
public static void main(String[] args) {
	int[] A = new int[2026];
	for (int i = 1; i <=2025; i++) {
		A[i] = i;
	}
	long count =0;
	for (int i = 1; i <=2025; i++) {
		for (int j =i; j <=2025; j++) {
			if(((long)i*j)+2025>=(long)A[i]*A[j])
			{
		      count++;		
			}
		}
	}
	System.out.println(count);
}
}
