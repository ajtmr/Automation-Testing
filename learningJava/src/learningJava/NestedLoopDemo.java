package learningJava;

public class NestedLoopDemo {
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <= 4; i++) {
			int j = 1;
			
			while (j <= 5) {
				
				for (int k = 1; k <=2; k++) {
					System.out.println("Value of i is: " + i + "Value of j is:" + j+"Value of j is:" + k);
					count++; 
				}
				j++;
				
			}

		}
		System.out.println(count);
	}
}
