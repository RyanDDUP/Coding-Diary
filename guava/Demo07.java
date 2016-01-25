package guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/*
 * HashMap 键唯一,值可以重复
 * BiMap:双向Map, 键值都不可以重复(Unique valued map)
 * bimap.inverse().get();
 */
public class Demo07 {
	public static void main(String[] args) {
		
		BiMap<String, String> bimap=HashBiMap.create();
		bimap.put("北京尚学堂"	, "bjsxt@sina.com");
		bimap.put("good", "good@qq.com");
		
		//通过邮箱找客户
		System.out.println(bimap.inverse().get("good@qq.com"));
		System.out.println(bimap.inverse().inverse()==bimap);
	}
}
