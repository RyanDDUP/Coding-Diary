package guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

/*
 * 只读设置
 */
public class Demo01 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		//对原有list包装，相当于一个视图
		List<String> readList=Collections.unmodifiableList(list);
		//readList.add("speed");
		list.add("d"); //readList也一起改变！！
		//不够安全！
		
		//guava只读设置
		List<String> immutableList=ImmutableList.of("aa","bb","cc","dd");
		
		//immutableList.add("e");不能改变
		//guava只读设置安全可靠，相对简单
		
	}
}
