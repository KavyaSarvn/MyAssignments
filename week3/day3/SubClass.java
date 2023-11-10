package week3.day3;

public class SubClass extends SuperClass{

	public void StudentsAbsent()
	{System.out.println("No.of students Absent 27");}
	
	public void StudentsPresent()
	{System.out.println("No.of students Present in Sub class 278");}
	
	public static void main(String[] args) {
		
		SubClass Sub= new SubClass();
		Sub.Students();
		Sub.StudentsPresent(223);
		Sub.StudentsPresent();
		Sub.StudentsAbsent();		
		
	}
}
