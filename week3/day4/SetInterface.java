package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public String check(String companyName) {

		char[] charArray = companyName.toCharArray();
		Set<Character> name = new LinkedHashSet<Character>();

		for (char n : charArray) {
			name.add(n);
		}

		String text = "";
		for (char n : name) {
			text = text + n;

		}
		return text;
		// "gole"}

	}

	public static void main(String[] args) 
	{
		SetInterface obj = new SetInterface();
		System.out.println(obj.check("google"));
	}

}