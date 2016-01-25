package tree;

import java.lang.ref.WeakReference;

/*
 * 引用分类 ：强，软，弱，虚
 * 强与弱
 */
public class RefDemo {
	public static void main(String[] args) {
		
		//字符串常量，new String 不共享
		String str=new String("Ruoyun is very handsome");
		//弱引用，管理对象
		WeakReference<String> wr=new WeakReference<String>(str);
		System.out.println("gc运行前:"+wr.get());
		
		//断开引用
		str=null;
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后:"+wr.get());
		//对象已被回收
	}
	
	public static void testStrong(){
		
		//字符串常量，强引用，不能回收
		String str="Ruoyun is very handsome";
		//弱引用，管理对象
		WeakReference<String> wr=new WeakReference<String>(str);
		System.out.println("gc运行前:"+wr.get());
		
		//断开引用
		str=null;
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后:"+wr.get());

	}
}
