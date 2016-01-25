package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 分拣存储，解决一对多的关系
 * 统计单词出现的次数
 * 
 * 思路
 * 分割字符串 
 * 分拣存储
 * 按要求查看单词出现的次数
 */
public class MapDemo01 {
	public static void main(String[] args) {
		//分割.split(" ")
		String[] arr="there is a cat and that is a mice and where is the food?".split(" ");
		//分拣存储
		Map<String,Integer>/*键值=单词，值=次数*/ map=new HashMap<String,Integer>();
		for(String key:arr){
			//System.out.println(key); 每个单词
			if (!map.containsKey(key)) {//查看是否存在 map.containsKey(key)
				
				map.put(key, 1);
			}else {//存在
				map.put(key, map.get(key)+1);//在原键值上+1
			}
		}
		//查看每个单词出现的次数,查看键map.keySet();
		Set<String> keySet=map.keySet();
		//获取对象
		Iterator<String> iter=keySet.iterator();
		while(iter.hasNext()){//判断
			String key=iter.next();
			Integer value=map.get(key);
			System.out.println(key+"-->"+value);
		}
	}
}
