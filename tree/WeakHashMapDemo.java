package tree;

import java.util.WeakHashMap;

/*
 * 键为弱类型，gc立即回收
 */
public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap<String, String> map=new WeakHashMap<String,String>();
		//测试数据
		map.put("abc", "a");
		map.put("d", "test");
		map.put(new String("Ruoyun"), "c");
		map.put(new String("is Handsome"), "d");
		
		//通知回收
		System.gc();
		System.runFinalization();
		
		System.out.println(map.size());
		//只有两个对象，前两个是常量池不会回收，后两个已被回收
		
	}
}
