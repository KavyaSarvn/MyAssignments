package week3.day2;

public class Chrome extends Browser{

	

		public void openIncognito()
		{System.out.println("Open incognito " + browserName + " "+browserVersion );}
		public void clearCashe()
		{System.out.println("clearCashe");}
	
public static void main(String[] args) {
	Chrome chrome= new Chrome();
	chrome.openURL();
	chrome.browserName= "Chrome";
	chrome.browserVersion= "2.0";
	chrome.openIncognito();
	
}

}