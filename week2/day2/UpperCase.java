package week2.day2;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="changegame";//cHaNgEgAmE
		char[] charArray = test.toCharArray();
		for (int a=0;a<=charArray.length-1;a++)
		{
			if(a%2!=0)
			{
				String uCase=test.toUpperCase();
				char[] charArray1=uCase.toCharArray();
				System.out.print(charArray1[a]);
				
			}else {
			System.out.print(charArray[a]);
			}
			
		}
		

	}

}
