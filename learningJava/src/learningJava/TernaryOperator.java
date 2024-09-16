package learningJava;

public class TernaryOperator {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		/*
		 * if (number1 > number2) { System.out.println("Num1>Num2"); } else {
		 * System.out.println("Num1<Num2"); }
		 */
		String result= (number1>number2)? "Num1>Num2":"Num1<Num2";
		System.out.println(result);
	}
}
