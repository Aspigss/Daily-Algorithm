package lq2;

import java.util.Scanner;
//分布式队列
public class q3 {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
      int[] count = new int[n];//因为这题可以不用储存对应的数 而可以用判断这个节点有几个数的方法去做
	while(scanner.hasNext())//只要有输入就一直继续
	{
		String op = scanner.next();
		
		if(op.equals("add"))
		{
			int x =scanner.nextInt();
			count[0]++;//主节点总数++
		}
		else if(op.equals("sync")) {
			int x = scanner.nextInt();
			 count[x] = Math.min(count[x] + 1,count[0]);//sync输入的x 刚好可以对应几号节点  而一次刚好又是同步一个 所以只要x节点的count++就可以了 (不超过主节点个数)
//			if(count[x]<count[0])
//			{
//				count[x]++;
//			}
		}
		
		else {
			int min = count[0];
			//查询主节点和其他节点里的最小值 就是共同拥有的个数 就是答案!
			for (int i = 0; i <n; i++) {
				min = Math.min(min,count[i]);
			}
			System.out.println(min);
		}
		
	}
   }
}
