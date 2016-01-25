package pro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * 使用properties读取资源配置文件
 * 使用load
 * loadFromXML
 */
public class Demo03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro =new Properties();
		//pro.load(new FileReader("/Users/RZ/Documents/workspace/others/db.properties"));
		//读取绝对路径
		//System.out.println(pro.getProperty("user","test"));
		//读取相对路径
		pro.load(new FileReader("src/pro/db1.properties"));
		System.out.println(pro.getProperty("user","test"));
		
	}
}
