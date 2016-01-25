package guava;

import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/*
 * 统计单词出现的次数
 *1.HashMap分拣存储+面向对象思维
 *2.Multiset---guava：无序，可重复 .count 增强了可读性，方便
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String str="this is a cat and that is a mouse where is the food";
	    //分割字符串
		String [] strArray= str.split(" ");
	    //存储到Multiset中，
		Multiset<String> set=HashMultiset.create();
		for (String string : strArray) {
			set.add(string);
		}
		//获取所有的单词
		
		Set<String> letters=set.elementSet();
		for (String temp : letters) {
			System.out.println(temp+"-->"+set.count(temp));
		}
		
	}
}
