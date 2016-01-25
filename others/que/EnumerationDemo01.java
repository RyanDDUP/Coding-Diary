package others.que;
/*
 * Enumertation子类
 * StringTokenizer： String split() 字符串分割
 */

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EnumerationDemo01{
	
	public static void main(String[] args) {
		String emailStr="www@baidu.com;www@sina.com;www@google.com";
		StringTokenizer token=new StringTokenizer(emailStr, ";");
		
		//遍历获取
		while (token.hasMoreElements()) {
			System.out.println(token.nextElement());
		}
	
	}
	
	
	
	
	
}