package others.que;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Enumeration的使用
 * 1。hasMoreElement()
 * 2. nextElement()
 * 
 * Vector的elements()方法
 */
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("javase");
		vector.add("html");
		vector.add("oracle");
		
		//遍历
		Enumeration<String> en=vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
