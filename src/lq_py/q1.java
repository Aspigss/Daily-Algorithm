package lq_py;

public class q1 {
    //一回合用三个英雄攻击  
	public static void main(String[] args) {
		int blood = 2025;
		int count =1;//回合数
		while(blood>0)
		{
			//1
			blood-=5;
			//2
			if(count%2==0)
			{
				blood-=2;
			}
			else {
				blood-=15;
    	         }
			//3
			if(count%3==1)
			{
               blood-=2;				
           }
			else if(count%3==2){
				blood-=10;
			}
			else if(count%3==0) {
				blood-=7;
			}
//        if(blood<=0)
//        {
//        	System.out.println(count);
//        }
			count++;
		}
		System.out.println(count);
	}
}
