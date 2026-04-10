	package lq2_c;
	
	public class q1 {
		public static void main(String[] args) {
			int ans  = 0;
		for (int i = 1; i <=50; i++) {
			for (int j = i+1; j <=50; j++) {
			   if(j>=8)
			   {
				   ans++;
			   }
			}
		}
		System.out.println(ans);
	}
	
	}
