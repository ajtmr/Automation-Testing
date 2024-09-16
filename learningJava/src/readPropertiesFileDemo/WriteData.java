package readPropertiesFileDemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteData {
	public static void main(String[] args) throws IOException {
		/*
		 * FileWriter fw = new FileWriter(
		 * "C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\propertiesFile\\testDataNew.properties",
		 * true);
		 */
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\propertiesFile\\testDataNew.properties", true);
		Properties p = new Properties();

		p.setProperty("url", "www.google.com");
		p.store(fos, "sample comments");

	}
}
