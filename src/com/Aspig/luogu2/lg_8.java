package com.Aspig.luogu2;
import java.util.Scanner;

public class lg_8 {
    static void yourseat(boolean seats[],int p) 
    {
    	int start;
    	int end;
    	//找连续
    	for (int i = 0; i <20; i++) {
    		//求每一行的起始和终止 这样就知道每个位置的下标
		 start = i*5+1;
		 end = start+4;
		 //!!以j作为每次的起始点向后走!!
		 for (int j = start; j <=end-p+1; j++) {//end-p+1 是最大这里j能作为起始位置的下标了
		   boolean ok = true; 
			 for (int k = 0; k <p; k++) {
			 if(seats[j+k])//起始位置开始往后面找
			 {
				 ok=false;
				 break;
			 }
			 }
			 if(ok)
			 {
				 for (int k = 0; k<p; k++) {
					 seats[j+k]=true;//标记为占用
					 System.out.print((j+k)+" ");
				}
				 System.out.println();
				 return;
			 }
			 }
		
		} 
    	//连续的循环结束 说明能连续的座位已经全部找完  处理不能连续坐的情况 
		 int count = 0;
		 for (int j = 1; j<=100; j++) {//所有值遍历找空位
			if(!seats[j])//如果没被占用 
			{
				seats[j] = true;
				System.out.print(j+" ");
				count++;
			}
			if(count==p)
				break;
		}
		 System.out.println();
    }
	public static void main(String[] args) {
      Scanner scanner  = new Scanner(System.in);
      int n = scanner.nextInt();
      int[] order = new int[n];
      boolean[] seats = new boolean[101];//从一开始记录座位占用情况 占用为true
      for (int i = 0; i <n; i++) {
    	  order[i] = scanner.nextInt();
	}
      
      for(int p : order)
      {
         yourseat(seats,p);	   
      }
      
    }
}