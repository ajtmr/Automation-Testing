package learningJava;

public class MultiDimeArray {
	public static void main(String[] args) {
		
		/*
		 * int[][] myMultiDimenArray = new int[2][3]; myMultiDimenArray[0][0] = 2;
		 * myMultiDimenArray[0][1] = 3; myMultiDimenArray[0][2] = 5;
		 * myMultiDimenArray[1][0] = 6; myMultiDimenArray[1][1] = 8;
		 * myMultiDimenArray[1][2] = 9; System.out.println(myMultiDimenArray[1][0]);
		 */
		 
		/*
		 * for (int i = 0; i < myMultiDimenArray.length; i++) {
		 * 
		 * for (int j = 0; j < myMultiDimenArray[i].length; j++) {
		 * System.out.println(myMultiDimenArray[i][j]); }
		 * 
		 * }
		 */

		/*
		 * int[][] myMultiDimenArray1= {{2, 3, 5},{6, 8, 9}}; for (int i = 0; i <
		 * myMultiDimenArray1.length; i++) {
		 * 
		 * for (int j = 0; j < myMultiDimenArray1[i].length; j++) {
		 * System.out.println(myMultiDimenArray1[i][j]); }
		 * 
		 * }
		 */

		
		  int[][][] multiDimenArray = { { { 3, 4, 5, 6 }, { 7, 8, 9, 10 }, { 11, 12,
		  13, 14 } }, { { 21, 22, 34, 35 }, { 54, 23, 98, 56 }, { 45, 34, 78, 87 } } };
		  System.out.println(multiDimenArray[0][0][1]);
		  System.out.println(multiDimenArray[1][2][3]);
			
			  int count=0; for (int i = 0; i < multiDimenArray.length; i++) 
			  { 
				  for (int j =0; j < multiDimenArray[i].length; j++) 
			  
			       { 
	  					  for (int j2 = 0; j2 <multiDimenArray[i][j].length; j2++) 
				             {
			  System.out.println(multiDimenArray[i][j][j2]); 
			  count++;
			  
			  }
			  
			  }
			  
			  } System.out.println(count);
			 

	}
}
