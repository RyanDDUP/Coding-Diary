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
 * 加入面向对象
 */
public class MapDemo02 {
	public static void main(String[] args) {
		//分割.split(" ")
		String[] arr="there is a cat and that is a mice and where is the food?".split(" ");
		//分拣存储
		Map<String,Letter>/*键值=单词，值=次数*/ map=new HashMap<String,Letter>();
		for(String key:arr){
			//第一次查看
			if (!map.containsKey(key)) {//不存在
				map.put(key, new Letter(key));//准备袋子
			}
			//获取袋子
			Letter value=map.get(key);
			value.setCount(value.getCount()+1);//装东西
			
		}
		//查看每个单词出现的次数,查看键map.keySet();
		for (String key : map.keySet()) {
			Letter value=map.get(key);
			System.out.println(key+"-->"+value.getCount());
		}
	}
}
