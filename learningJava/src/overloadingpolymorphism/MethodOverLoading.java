package overloadingpolymorphism;

public class MethodOverLoading {
public static void main(String[] args) {
	MethodOverLoading mo=new MethodOverLoading();
	mo.logIn("ajay", "ajay");
	mo.logIn(893889, "ajay");
	mo.logIn(93849834, 9384, "ljalsjdf");
	
}
public void logIn(String u, String p) {
	System.out.println("Login successful using username and password.");
}
public void logIn(int n, String p) {
	System.out.println("Login successful using phonenumber and password.");
}
public void logIn(int n, int m, String p) {
System.out.println("Login successful using Phonenumber/pin and password");	
}
}
