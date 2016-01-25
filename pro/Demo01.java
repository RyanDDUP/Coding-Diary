package pro;

import java.util.Properties;

/*
 * properties 资源配置文件的读写
 * 只能存储字符串，key value
 * setProperty getProperty
 */
public class Demo01 {

	public static void main(String[] args) {
		
		Properties pro=new Properties();
		//存储
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		//pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		//获取
		String url=pro.getProperty("url","test");
		System.out.println(url);
		
	}
}
