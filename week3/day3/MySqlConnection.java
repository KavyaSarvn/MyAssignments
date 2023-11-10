package week3.day3;

public abstract class MySqlConnection implements DatabaseConnection {

	public void executeQuery() {
		
		System.out.println("Execute the query");
	};
	
	
	  public void connect() { // TODO Auto-generated method stub
	  System.out.println("Database connected"); }
	  
	  public void disconnect() { // TODO Auto-generated method stub
	  System.out.println("Database disconnected"); }
	  
	  public void executeUpdate() { // TODO Auto-generated method stub
	  System.out.println("Database updated"); }
	 
	
/*	
	public static void main(String[] args) {
		MySqlConnection Msql =new MySqlConnection();}*/
	
	/*note:
		We cannot call an object or instantiate in abstract class*/
		
	
}
