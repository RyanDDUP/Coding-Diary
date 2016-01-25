package others.que;

import java.util.ArrayDeque;
import  java.util.Deque;

/*
 * 使用队列实现自定义对战
 * 弹
 * 压
 * 获取
 */
public class MyStack<E> {

	private Deque<E> container=new ArrayDeque<E>();
	
	private int cap;
	
	

	public MyStack() {
		super();
	}

	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
	
	//压栈
	
	public boolean push(E e){
		if (container.size()+1>cap) {
			return false;
		}
		return container.offerLast(e);
	}
	
	//弹栈
	public E pop(){
		return container.pollLast();
		
		
	}
	
	//获取
	public E peak(){
		return container.peekLast();

	}
	
	public int size(){
		return container.size();
	}
}
