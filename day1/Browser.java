package week1.day1;

public class Browser {

	public static void main(String[] args) {
		
		System.out.println("This is my Browser");
		
		Chrome chrome = new Chrome();
		chrome.printName();
		chrome.getName();
		
		Browser browser=new Browser();
	//	System.out.println(browser.launchBrowser("Google"));
		browser.launchBrowser("Google");
		browser.loadUrl();

	}

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		//System.out.println(browserName);
		return browserName;
		
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
}
