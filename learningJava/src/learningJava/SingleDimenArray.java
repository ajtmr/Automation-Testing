package learningJava;

public class SingleDimenArray {
	public static void main(String[] args) {
		int[] myintArray = new int[10];
		myintArray[0] = 10;
		myintArray[1] = 20;
		myintArray[2] = 30;
		myintArray[3] = 40;

		System.out.println(myintArray.length);
		System.out.println(myintArray[3]);
		/*
		 * for (int i = 0; i < myintArray.length; i++) {
		 * System.out.println(myintArray[i]);
		 * 
		 * }
		 */

		int[] myintArray1 = { 10, 20, 30, 40 };
		System.out.println(myintArray1[1]);
		System.out.println(myintArray1.length);
		/*
		 * for (int i = 0; i < myintArray1.length; i++) {
		 * System.out.println(myintArray1[i]);
		 * 
		 * }
		 */
		/*
		 * int i = 0; while (i < myintArray1.length) {
		 * System.out.println(myintArray1[i]); i++;
		 * 
		 * }
		 */
		
		/*
		 * int i=0; do { System.out.println(myintArray1[i]); i++; } while
		 * (i<myintArray1.length);
		 */
		
		
		
		
        
	}
}
