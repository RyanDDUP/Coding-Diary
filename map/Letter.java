package map;
/*
 * javabean 存储数据 po bo vo包含setter与getter访问器的类
 */
public class Letter {
	private String name;
	private int count;
	
	public Letter() {//mac command+option+s
		super();
	}
	
	public Letter(String name) {
		super();
		this.name = name;;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
