package others.que;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 使用队列模拟银行存款业务
 */
public class Bank {
	public static void main(String[] args) {
		
		Queue<Request> que=new ArrayDeque<Request>();
		//模拟排队情况
		for (int i = 1; i < 11; i++) {
			final int num=i;
			que.offer(new Request() {
				
				@Override
				public void deposit() {
					System.out.println("第"+num+"个人的存款为:"+Math.random()*1000);
					
				}
			});
		}			
		dealWith(que);
	}
	
	
	public static void dealWith(Queue<Request> que){
		Request req=null;
		while (null!=(req=que.poll())) {
			req.deposit();
		}
		
	}
}


	interface Request{
		
		void deposit();
	}