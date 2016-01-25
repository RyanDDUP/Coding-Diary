package pro;
/*
 * 使用类相对路径读取配置文件
 * 	bin
 */

import java.io.IOException;
import java.util.Properties;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		
		//类相对路径	/表示bin目录
		pro.load(Demo04.class.getResourceAsStream(""));
		
	}
}
