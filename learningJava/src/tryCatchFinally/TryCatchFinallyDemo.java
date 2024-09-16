package tryCatchFinally;

public class TryCatchFinallyDemo {
public static void main(String[] args) {
	int i = 10;
	System.out.println("Before Division");
	
	try {
		System.out.println(i/0);
	} catch (Throwable t) {
		System.out.println(t.getMessage());
		System.out.println(t.getCause());
		System.out.println(t.getStackTrace());
		t.printStackTrace();
	}
	finally {
		System.out.println("This block executed");
	} 
System.out.println("After Division");

}
}
