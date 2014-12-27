
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class opengmail {

	

	public static void main(String[] args) throws Exception {
		FirefoxDriver d1= new FirefoxDriver(); 
		d1.manage().window().maximize();
		d1.get("https://sysdev.microsoft.com/en-us/hardware/member/default.aspx");
		
		WebElement username =d1.findElement(By.id("i0116"));
		username.sendKeys("himanshu.jaiswal@citrix.com");
		WebElement password =d1.findElement(By.id("i0118"));
		password.sendKeys("Pradeep9323");
		
		WebElement signin =d1.findElement(By.id("idSIButton9"));
		signin.click();
		
		WebElement createHCKsub =d1.findElement(By.id("ctl00_MainContentPlaceHolder_SiteQuickView_ParentFeatureTile0_ChildFeatureTileItem0_Link"));
		
		Thread.sleep(4000);
		createHCKsub.click();
		Thread.sleep(3000);
		//***** path for user directory*****//
		String UserPath=System.getProperty("user.dir");
		Screen s=new Screen();
		try{
			s.click(UserPath +"\\img\\brow2.png");
			s.type(UserPath +"\\img\\filepath.png",UserPath+"\\HckFile\\Test submission.hckx");
			Thread.sleep(2000);
			s.click(UserPath+"\\img\\open.png");
			
			
		}
		catch(FindFailed e){
			e.printStackTrace();
			
		}
		WebElement next =d1.findElement(By.id("ctl00_MainContentPlaceHolder_UploadButton"));
		Thread.sleep(2000);
		next.click();
		WebElement next_upload =d1.findElement(By.id("ctl00_MainContentPlaceHolder_NextButton"));
		Thread.sleep(2000);
		next_upload.click();
		WebElement dropdown =d1.findElement(By.id("ctl00_MainContentPlaceHolder_whosWizard_ctl01_Division_ctl00_Division"));
		Thread.sleep(2000);
		dropdown.sendKeys("Citrix Systems, Inc - COL");
				 
		FileInputStream fstream = new FileInputStream(UserPath+"\\HckFile\\driverinfo.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		 String strLine1=br.readLine();
		 String strLine2=br.readLine();
		//// System.out.println(strLine1+" "+strLine2);
		 
		//d1.findElement(By.id("ctl00_MainContentPlaceHolder_whosWizard_ctl01_Summary_ctl00_ProductName")).sendKeys(strLine1);
		//d1.findElement(By.id("ctl00_MainContentPlaceHolder_whosWizard_ctl01_FirmwareVersion_FirmwareVersion")).sendKeys(strLine2);
		//Thread.sleep(2000);
		//d1.findElement(By.id("ctl00_MainContentPlaceHolder_whosWizard_StartNavigationTemplateContainerID_StartNextButton")).click();
		//Thread.sleep(2000);
		//d1.findElement(By.id("ctl00_MainContentPlaceHolder_whosWizard_FinishNavigationTemplateContainerID_FinishButton")).click();
		Thread.sleep(2000);
		d1.findElement(By.id("ctl00_MainContentPlaceHolder_whosWizard_FinishNavigationTemplateContainerID_FinishButton")).click();
		
		try{
			s.click(UserPath +"\\img\\brow2.png");
			s.type(UserPath +"\\img\\filepath.png",UserPath+"\\HckFile\\Test submission.hckx");
			Thread.sleep(2000);
			s.click(UserPath+"\\img\\open.png");
			
			
		}
		catch(FindFailed e){
			e.printStackTrace();
			
		}
		d1.findElement(By.id("ctl00_MainContentPlaceHolder_whosWizard_FinishNavigationTemplateContainerID_FinishButton")).click();
	}

}


