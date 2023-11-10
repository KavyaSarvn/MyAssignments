package week3.day3;

public class SuperClass {
	
	public void Students()
	{System.out.println("Total No.of students 300");}
	
	public void StudentsPresent(int a)
	{System.out.println("No.of students Present in Super class "+ a );}
	
	public void StudentsAbsent()
	{System.out.println("No.of students Absent 22");}

public static void main(String[] args) {
		
		SuperClass Sub= new SuperClass();
		Sub.Students();
		Sub.StudentsPresent(278);
}
}