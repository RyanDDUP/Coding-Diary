package synread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/*
 * 只读设置
 * 1.emptyXxx()	空的不可变的集合 避免空指针异常
 * emptyMap() emptyList() emptySet()
 * 
 * 2.singletonXxx()	一个元素不可变的集合
 * 
 * 3.unmodifiableXxx()	不可变容器
 * 
 */
public class Demo02 {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("test", "test");
		map.put("test1", "test1");
		
		Map<String, String> map1=Collections.unmodifiableMap(map);
		//map1.put("test2", "test2"); 不能操作
		System.out.println(map1.size());
		
		//一个元素的容器测试
		List<String> list=Collections.singletonList(new String());
		//list.add("abc");
		//list.add("abcd");只能包含一个元素的容器
		
		
	}
	
	public static Set<String> oper(Set<String> set){
		if (null==set) {
			return Collections.emptySet();
		}
		
		//操作
		return set;
	}
}
