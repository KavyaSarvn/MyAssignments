package week3.day2;

public class Edge extends Browser{

	public void takeSnap()
	{System.out.println("takeSnap");}
	public void clearCookies()
	{System.out.println("clearCookies");}

	
	public static void main(String[] args) {
		Edge edge= new Edge();
		edge.closeBrowser();
		edge.browserName= "Edge";
		System.out.println(edge.browserName);
		
	}
}
