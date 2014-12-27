import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

//import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;


public class Openbrowser {

	
	public static void main(String[] args) {
		
		//FirefoxDriver d1= new FirefoxDriver(); 
		//d1.get("http://google.com");
	System.setProperty("webdriver.chrome.driver","E:\\selenium-2.29.0\\chromedriver_win32\\chromedriver.exe");
	
		//InternetExplorerDriver e1= new InternetExplorerDriver();
		//e1.get("http://google.com");
		ChromeDriver d1= new ChromeDriver(); 
		d1.get("http://facebook.com");
		Screen s=new Screen();
	}

}
