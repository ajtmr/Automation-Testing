package readPropertiesFileDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDatatoCSVandtxt {
public static void main(String[] args) throws IOException {
	File f= new File("C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\propertiesFile\\testDataNew.csv");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	System.out.println("Read successfully");
	br.close();
}
}
