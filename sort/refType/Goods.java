package sort.refType;
/*
 * javabean
 */
public class Goods {
	private int fav;
	
	private double price;
	
	private String name;
	
	
	
	
	

	public Goods() {
		super();
	}
	
	
	

	public Goods(String name,int fav, double price ) {
		super();
		this.fav = fav;
		this.price = price;
		this.name = name;
	}




	public int getFav() {
		return fav;
	}

	public void setFav(int fav) {
		this.fav = fav;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "商品名:"+name+",价格:"+price+",收藏量:"+fav+"\n";
	}
	
	
}
