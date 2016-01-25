package others.que;
/*
 * 测试自定义方法
 */

public class DemoStack {
	
	
	public static void main(String[] args) {
		MyStack<String> backHistory=new MyStack<String>(3);
		backHistory.push("www.baidu.com");
		backHistory.push("www.google.com");
		backHistory.push("www.sina.com");
		backHistory.push("www.nyu.edu");
		
		System.err.println(backHistory.size());
		
		String item=null;
		while (null!=(item=backHistory.pop())) {
			System.out.println(item);
		}
		
		
		
	}
}
