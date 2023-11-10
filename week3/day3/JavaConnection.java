package week3.day3;

public class JavaConnection implements DatabaseConnection  //demonstrating interface assignment

//public class JavaConnection extends MySqlConnection // demonstrating abstract assignment

{
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();

		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	//	jc.executeQuery(); // calling from MySqlConnection- use it for demonstrating Abstract assignment

		
	
	}
	
	  public void connect() { // TODO Auto-generated method stub
	  System.out.println("Database connected"); }
	  
	  public void disconnect() { // TODO Auto-generated method stub
	  System.out.println("Database disconnected"); }
	  
	  public void executeUpdate() { // TODO Auto-generated method stub
	  System.out.println("Database updated"); }
	 
}


