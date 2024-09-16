package learningJava;

public class MethodsDemo {
public static void main(String[] args) {
	MethodsDemo md=new MethodsDemo();
	md.diffParameters("This is string.", 7, 5);
	System.out.println(md.addNumbers(5, 8));
	md.doLogout();
	MethodsDemo.doLogin();
	
}
public static void doLogin() {
	System.out.println("Login successful.");
}
public void doLogout() {
	System.out.println("Logout successful.");
}
public int addNumbers(int x, int y) {
	return(x+y);
	
}
public void diffParameters(String s, int i, float f) {
	System.out.println(s);
	System.out.println(i);
	System.out.println(f);
	
}
}
