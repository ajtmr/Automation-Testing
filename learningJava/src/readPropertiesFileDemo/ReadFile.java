package readPropertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		//step 1:- Create an object of FileReader class
		FileReader rf=new FileReader("C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\propertiesFile\\testData.properties");
        //FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\propertiesFile\\testData.properties");
		
		//step 2:- Create and object of properties class
		Properties p = new Properties();
		
		//step 3:- 
		p.load(rf);
		
		//step 4:- Use get property method to get property
		System.out.println(p.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));
		
		
	}

}
