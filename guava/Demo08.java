package guava;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.common.collect.Table.Cell;

/*
 * 双键的Map--Table--row key+column key +value
 * 
 * row column value
 * 学生+	课程+	分数
 * a	数学		80
 * 		语文		90
 * b
 * c	...		...
 * 1.方法
 * 所有的行数据:cellSet()
 * 所有的学生:rowKeySet()
 * 所有的课程:columnKeySet()
 * 所有的成绩:values()
 * 学生对应的课程:rowMap().get()/row(学生)
 * 课程对应的学生:columnMap().get()/column(课程)
 */
public class Demo08 {

	public static void main(String[] args) {
		Table<String, String, Integer> tables=HashBasedTable.create();
		//添加测试数据
		tables.put("a", "javase", 80);
		tables.put("b", "javase", 90);
		tables.put("a", "oracle", 100);
		tables.put("b", "oracle", 89);
		
		//所有的行数据 
		Set<Cell<String, String, Integer>> cells=tables.cellSet();
		for (Cell<String, String, Integer> cell : cells) {
			System.out.println(cell.getRowKey()+"-->"+cell.getColumnKey()+"-->"+cell.getValue());
		
		
		}
		
		System.out.println("**********学生查看成绩************");
	
		System.out.print("学生\t");
		Set<String> cours=tables.columnKeySet();
		for (String string : cours) {
			System.out.print(string+"\t");
		}
		System.out.println();
		Set<String> stus=tables.rowKeySet();
		for (String stu : stus) {
			System.out.print(stu+"\t");
			Map<String, Integer> map=tables.row(stu);
			for (String c : cours) {
				System.out.print(map.get(c)+"\t");
			}

			System.out.println();
		}
		System.out.println("**********课程查学生************");
		System.out.print("课程\t");
		Set<String> stus1=tables.rowKeySet();
		for (String string : stus1) {
			System.out.print(string+"\t");
		}
		System.out.println();
		Set<String> courses=tables.columnKeySet();
		for (String cor : courses) {
			System.out.print(cor+"\t");
			Map<String, Integer> map=tables.column(cor);
			for (String c : stus1) {
				System.out.print(map.get(c)+"\t");
			}

			System.out.println();
		}
		System.out.println("**********转换************");
		Table<String, String, Integer> tables2=Tables.transpose(tables);
		//所有的行数据 
				Set<Cell<String, String, Integer>> cells2=tables2.cellSet();
				for (Cell<String, String, Integer> cell : cells2) {
					System.out.println(cell.getRowKey()+"-->"+cell.getColumnKey()+"-->"+cell.getValue());
				}
		
	}
}
