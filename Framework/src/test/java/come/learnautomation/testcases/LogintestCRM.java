package come.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.Loginpage;
import com.learnautomation.utilities.Browserfactory;
import com.learnautomation.utilities.ExcelDataProvider;

public class LogintestCRM extends  BaseClass {
	
	@Test
	public void loginApp() {
		
		logger=report.createTest("LogintoPA");
		
		
		Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);
		
		logger.info("Starting Application");
		
		loginpage.LogintoPA(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
	}
	
	

}
