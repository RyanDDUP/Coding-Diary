package gen01;
/*
 * 理解迭代器的原理，深入研究迭代器
 * 遍历使用 hashnext 
 */

import java.awt.List;
import java.security.PublicKey;

public class TestIterator {
	private String[] elem={"a","b","c"};
	private int size=elem.length;
	
	public int size(){
		return this.size;
	}
	// 计数器 指针，游标
	private int coursor=-1;
	//判断是否存在下一个
	public boolean hashNext(){
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
		System.arraycopy(elem, coursor+1, elem, coursor, this.size-(coursor+1));
		this.size--;
		coursor--;
	}
	
	public static void main(String[] args) {
		TestIterator iter=new TestIterator();
		if (iter.hashNext()) {
			System.out.println(iter.next());
			iter.remove();
		}
		if (iter.hashNext()) {
			System.out.println(iter.next());
			iter.remove();
		}		if (iter.hashNext()) {
			System.out.println(iter.next());
			iter.remove();
		}		if (iter.hashNext()) {
			System.out.println(iter.next());
			iter.remove();
		}
		System.out.println(iter.size());
	}
}
