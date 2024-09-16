package tests;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {
public static void main(String[] args) throws IOException {
	
	Properties prop = new Properties();
	 FileInputStream input = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\readFile\\src\\test\\resources\\properties\\testdata.properties");
	 prop.load(input);
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	
	FileOutputStream output = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\readFile\\src\\test\\resources\\properties\\testdata.properties");
	
	prop.setProperty("testdata", "9870948599");
    prop.store(output, "This is customer data from testcase2");
}
}
