package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 面向对象+分拣存储
 * 一对多的问题
 */
public class MapDemo03 {
	
	public static void main(String[] args) {
		//考试
		List<Student> stuList=exam();
		//分析成绩
		Map<String, Classroom> map=count(stuList);
		//查看成绩
		view(map);
		
		
	}
	/*
	 * 遍历map 查看总分平均分
	 */
	public static void view(Map<String,Classroom> map){
		Set<String> keys=map.keySet();
		Iterator<String> keysIt=keys.iterator();
		while (keysIt.hasNext()) {
			String no = (String) keysIt.next();
			Classroom room=map.get(no);
			//查看总分，计算平均分
			double total=room.getTotal();
			double avg=total/room.getStuList().size();
			System.out.println(no+"-->"+total+"-->"+avg);
		}
	}
	
	/*
	 * 统计分析
	 * 面向对象
	 * 分拣存储
	 */
	
	public static Map<String,Classroom> count(List<Student> list){
		Map<String, Classroom> map=new HashMap<String, Classroom>();
		//遍历list
		for (Student stu : list) {
			//分拣 查看是否存在该编号的班级

			String no =stu.getNo();//班级编号
			double score=stu.getScore();//学号
			Classroom room=map.get(no);
			if (null==room) {
				room=new Classroom(no);
				map.put(no, room);
			}
			
			room.getStuList().add(stu);//放入学生
			room.setTotal(room.getTotal()+score);
		}
		return map;
	}
	
	public static List<Student> exam(){
		List<Student> list=new ArrayList<Student>();
		//存放学生成绩
		list.add(new Student("老裴","a",85));
		list.add(new Student("老鱼","b",86));
		list.add(new Student("老徐","c",88));
		list.add(new Student("老王","b",89));
		list.add(new Student("老章","a",100));
		return list;
		
	}
}
