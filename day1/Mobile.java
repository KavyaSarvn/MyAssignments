package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Mobile mobile =new Mobile();
		
	     mobile.makeCall();
		 mobile.sendMsg();
		 System.out.println("This is my Mobile");
	}
	public void makeCall() {
		String mobileModel1="Apple";
		float mobileWeight=200.00f ;
		System.out.println("The weight of the "+ mobileModel1+" mobile is "+mobileWeight + " gram" );
	}
	public void sendMsg() {
		boolean isFullCharged =true;
		int mobileCost=50000;
		System.out.println("The Cost of the mobile is "+mobileCost );
		if (isFullCharged) {
			System.out.println("The mobile is fully charged" );
		} else {
			System.out.println("The mobile is not fully charged" );
		}
	}

}
