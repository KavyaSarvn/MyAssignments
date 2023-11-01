package week2.day2;

import java.util.Arrays;

public class FindMissingElement {
public static void main(String[] args) {
	
	int input []= {1,4,3,2,8,6,7};
	Arrays.sort(input); //1,2,3,4,6,7,8
	for(int i=0;i<input.length-1;i++)
		
	if(input[i+1]-input[i]==1)	
	{ 
		
		//System.out.println(input[i]+"  " +input[i+1] +"  "+ (input[i+1]-input[i])) ;
	}else 
	{
		System.out.println("Missing Element : "+ (input[i]+1));
	}
}
	
}
