package sort.refType;
/*
 * 自定义实体类排序
 * 新闻条目类
 */

import java.text.SimpleDateFormat;
import java.util.Date;


public class NewsItem implements Comparable<NewsItem> {
	
	private String title;
	
	private int hit;
	
	private Date putTime;
	
	
	public NewsItem() {
		super();
	}

	public NewsItem(String title, int hit, Date putTime) {
		super();
		this.title = title;
		this.hit = hit;
		this.putTime = putTime;
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getPutTime() {
		return putTime;
	}

	public void setPutTime(Date putTime) {
		this.putTime = putTime;
	}
	
	//时间降序+点击量升序+标题降序；
	@Override
    public int compareTo(NewsItem o){
	int result =0;
	result=-this.putTime.compareTo(o.putTime); //时间降序
	if (0==result) {
		//时间相同看点击量
		result=this.hit-o.hit;//升序
		if (0==result) {
			//点击量相同看标题
			result =this.title.compareTo(o.title);//降序
			
		}
	}
	return result;
    }

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("标题：").append(this.title);
		sb.append("时间：").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.putTime));
		sb.append("点击量：").append(this.hit).append("\n");
		
		return sb.toString();
	}
	
	
	
}
	
