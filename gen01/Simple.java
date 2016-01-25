package gen01;

import java.util.List;

import javax.jws.soap.SOAPBinding;

import java.util.ArrayList;

/*
 * 泛型的入门
 * 1标签，泛化类型
 * 作用：方便使用，省心，安全
 */
public class Simple {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		//安全！类型检查	list.add(1);
		list.add("so easy!");
		String ele=list.get(0);
		System.out.println(ele);
		
		//jdk1.4以前
		
		List list1=new ArrayList();
		list1.add(1);
		list1.add("abc");
		
		//取出数据,麻烦，还可能转错了
		Object obj=list1.get(0);

		String str1=(String)list1.get(1);

		System.out.println(str1);
		
		if (list1.get(0) instanceof Integer) {
			Integer num=(Integer)obj;
			System.out.println(num);
		}
	}
}
