package gen01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.sql.rowset.JdbcRowSet;

/*
 * 深入
 * 一个容器可以创建多个迭代器对象
 * 使用了内部类，匿名内部类，方法里return new Iterator(){};
 * 使用iterable接口使用for each迭代
 * 加入末尾添加元素的方法 elem=ArrayscopyOf(elem,elem+5);
 * 
 */
public class DeepIterator implements java.lang.Iterable{
	private String[] elem=new String[5];
	//实际大小是0
	private int size=0;
	

	public Iterator iterator(){
		return new Iterator(){

			
	public int size(){
				return /*DeepIterator.this.*/size;
			}
			

			// 计数器 指针，游标
	private int coursor=-1;
			//判断是否存在下一个
			public boolean hasNext(){
				return coursor+1<size;
			}
			//获取下一个
	public String next(){
				coursor++;
				return elem[coursor];
			}
			//删除下一个
	public void remove(){
				//移动数组元素
				System.arraycopy(elem, coursor+1, elem, coursor, /*DeepIterator.this.*/size-(coursor+1));
				/*DeepIterator.this.*/size--;
				coursor--;
			}


		};
	
	}
	public void add(String ele){
		if (this.size==elem.length) {//扩容
			elem=Arrays.copyOf(elem, elem.length+5);
		}
		
		elem[size]=ele;
		size++;
		
	}
	public static void main(String[] args) {
		DeepIterator iter=new DeepIterator();
		iter.add("a");
		iter.add("b");
		iter.add("c");
		iter.add("c2");
		iter.add("c3");
		iter.add("c4");
		iter.add("c5");
		
		Iterator it=iter.iterator();
		System.out.println(iter.size);
		
		ArrayList list2=new ArrayList<>();
		list2.add("a");
		list2.add("a");
		list2.add("a");
		for(Object obj:list2){//增强FOR循环
			System.out.println(obj);
		}
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

		
		
		System.out.println("------------");
		for(Object str:iter){
			System.out.println(str);
		}
	}

}
