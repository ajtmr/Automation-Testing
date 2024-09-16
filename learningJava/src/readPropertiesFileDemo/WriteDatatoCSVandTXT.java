package readPropertiesFileDemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoCSVandTXT {

	public static void main(String[] args) throws IOException {
	//	File f=new File("C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\propertiesFile\\testDataNew.txt");
		
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\propertiesFile\\testDataNew.csv");
        FileWriter fr=new FileWriter(f,true);
        BufferedWriter br=new BufferedWriter(fr);
        br.write("RCV academy online"+",");
        System.out.println("Written successfully");
        br.close();
	}

}
