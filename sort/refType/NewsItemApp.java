package sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/*
 * 使用Collections
 */

public class NewsItemApp {
	public static void main(String[] args) {
		
		List<NewsItem> news=new ArrayList<NewsItem>();
		news.add(new NewsItem("美国后怕逃跑了，悲剧",50, new Date()));
		news.add(new NewsItem("中国登上钓鱼岛了，全国欢呼!",100, new Date(System.currentTimeMillis()-3000*3600)));
		news.add(new NewsItem("小日本终于听话了，笑了!",60, new Date(System.currentTimeMillis()-2000*3600)));
		
		
		
		System.out.println("排序前:"+news);
		
		
		Collections.sort(news);
		System.out.println("排序后:"+news);
		

	
	
	}
}
