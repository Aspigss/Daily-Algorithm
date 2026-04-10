package lq2;

import java.util.Scanner;

public class lg_4 {
	static int []parent;
static int find(int num)
{
	if(parent[num]!=num) return find(parent[num]);
	return parent[num];
}
	static void union(int a,int b)
{
      int x = find(a);
      int y = find(b);
      if(x!=y) 
      {
    	  parent[y] = x;
      }
}
	public static void main(String[] args) {
      int n,m,Q;
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();
      m = scanner.nextInt();
      Q = scanner.nextInt();
      parent = new int[n];
      for (int i = 0; i < n; i++) {
		parent[i] = i;
	}
      for (int i = 0; i < m; i++) {
		int a  =scanner.nextInt();
		int b = scanner.nextInt();
	       union(a,b);
      }
      double ans=0;
      int sum = 0;
      for (int i = 0; i <Q; i++) {
		int start = scanner.nextInt();
		int need = scanner.nextInt();
		int count =0;
		for(int j =0;j<n;j++)
		{
			int p1= find(start);
			if(start!=j)
			{
				int p2 = find(j);				
			if(p1==p2)
			{
				count++;
			}
			if(count==need)
			{
				sum+=count;
				break;
			}
			}
			
		}
	}
      ans = sum/Q;
      
}
}
