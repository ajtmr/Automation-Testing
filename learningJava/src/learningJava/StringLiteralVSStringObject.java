package learningJava;

public class StringLiteralVSStringObject {
public static void main(String[] args) {
	
	String str="Ajay";
	String str1=new String("Ajay");
	String str3="Ajay";
	System.out.println(str==str3);
		System.out.println(str==str1);
	System.out.println(str.equals(str1));
	
}
}
