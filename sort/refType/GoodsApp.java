package sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> goods=new ArrayList<Goods>();
		goods.add(new Goods("老裴视频",1000,0));
		goods.add(new Goods("老马视频",2000,100));
		goods.add(new Goods("老高视频",2000,50));
		
		System.out.println(goods);
		Collections.sort(goods,new GoodsPriceCom());
		
		System.out.println("价格排序后："+goods);
		
		Collections.sort(goods,new GoodsFavCom());
		System.out.println("收藏排序后："+goods);
		
		
		
	}
}
