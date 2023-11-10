package week3.day3;

public interface DatabaseConnection {
	public void connect();
	
	public void disconnect();
	
	public void executeUpdate();
	
	
	//Interface can have unimplemented methods
	//cannot call obj or instantiate within interface

}
