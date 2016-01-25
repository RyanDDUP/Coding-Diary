package guava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/*
 * 分析查看教师教授的每门课程
 * Multimap:key-value key可以重复
 */
public class Demo06 {
	public static void main(String[] args) {
		Map<String, String> course=new HashMap<String,String>();
		//加入测试数据
		course.put("改革开放", "邓小平");
		course.put("三个代表", "江小平");
		course.put("和谐社会", "胡锦涛");
		course.put("科学发展观	", "胡锦涛");
		course.put("八荣八耻", "胡锦涛");
		course.put("...", "习近平");
		
		//multimap
		Multimap<String, String> teachers =ArrayListMultimap.create();
		
		//迭代器
		Iterator<Map.Entry<String,String>> it=course.entrySet().iterator();
		while(it.hasNext()){
			
			Map.Entry<String, String> entry=it.next();
			String key=entry.getKey();//课程
			String value=entry.getValue();//教师
			//教师-->课程
			teachers.put(value, key);
		}
		
		Set<String> keyset =teachers.keySet();
		for (String temp : keyset) {
			Collection<String> col =teachers.get(temp);
			System.out.println(temp+"--->"+col);
		}	
	}
}
