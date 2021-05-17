package SeleniumSessions;

public class LoginPage {

	public static void main(String[] args) {
	
		BrowserUtil br = new BrowserUtil();
		br.init_driver("chrome");
		br.launchUrl("http://www.google.com");
		String title = br.getPageTitle();
		System.out.println("Page title is :: "+ title);
		
		if(title.equals("Google"))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		
		
		br.quitBrowser();
	}
	
	

}
