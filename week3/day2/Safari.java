package week3.day2;

public class Safari extends Browser{

	public void readerMode()
	{System.out.println("readerMode");}
	public void fullScreenMode()
	{System.out.println("fullScreenMode");}
	
	
	public static void main(String[] args) {
		Safari saf= new Safari();
		saf.navigateBack();
		saf.browserName= "Safari";
		System.out.println(saf.browserName);
		
		
	}
}
