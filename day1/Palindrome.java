package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=126;
		int output=0;
		
		for(int i=input;i>0;i=i/10) //divide will give quotient
		{
			 int remainder=input%10;// mod will give remainder
			// System.out.println("Remainder = "+remainder);
			 output =(output *10 )+ remainder;
			 //System.out.println("Output = "+output);
		}
			
			if (input==output)
			{
				System.out.print("Given input "+ input +" is a Palindrome");
			}else 
				
			{System.out.println("Given input "+ input +" is not a Palindrome");}
		}
	}


