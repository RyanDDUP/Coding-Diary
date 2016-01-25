package pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 使用Properties输出到文件
 * 资源配置文件：切换数据库
 * 
 * store /.properties
 * storeToXML /.xml
 */
public class Demo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		//存储
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		//pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		//存储到/Users/RZ/Documents/workspace/others 绝对路径
		pro.store(new FileOutputStream(new File("/Users/RZ/Documents/workspace/others/db.properties")), "db配置");
		pro.storeToXML(new FileOutputStream(new File("/Users/RZ/Documents/workspace/others/db.xml")), "db配置");
		
		//使用相对路径
		//pro.store(new FileOutputStream(new File("db1.properties")), "db配置");
		//pro.store(new FileOutputStream(new File("src/db1.properties")), "db配置");
		pro.store(new FileOutputStream(new File("src/pro/db1.properties")), "db配置");
		
		
	
	}
}
