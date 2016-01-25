package tree;

import java.util.IdentityHashMap;

/*
 * 键比较地址去重
 */
public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap<String, String> map=new IdentityHashMap<String,String>();
		//a是常量池
		map.put("a", "a1");
		map.put("a", "a2");
		
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		//两个a的地址不同，IdentityHashMap只比较地址
		System.out.println(map.size());
		
		//答案是3
		
	}
}
