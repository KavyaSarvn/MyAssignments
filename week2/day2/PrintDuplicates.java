package week2.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 2, 5, 7, 7, 5, 9, 2, 3 };
		int i;
		int j;
		Arrays.sort(num);
		// 2,2,3,5,5,7,7,9
		int length = num.length;

		for (i = 0; i < length; i++) {  //for (i = 0; i < length-1; i++) 
			for (j =i+1; j < length; j++) {

			if (num[i] == num[j]) 
			{
				System.out.println("The value " + num[i]  +" is Duplicate" );

			}

		}

	}
		
		
	
		
}
}
