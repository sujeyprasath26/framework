package com.learnautomation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//screenshot,alerts,frames,windows,sync issue,javascript executor
	
	public static String captureScreenshot(WebDriver driver) {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath=System.getProperty("user.dir")+"/Screenshots/Process_Automation"+getCurrentDateTime()+ ".png";
		
		try {
			FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot Captured");
		} catch (IOException e) {
			
			System.out.println("Unable to Capture Screenshot"+ e.getMessage());
		}
		return screenshotPath;
	}
  public static String getCurrentDateTime() {
	 DateFormat customformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	 Date currentdate=new Date();
	 return customformat.format(currentdate);
	  
  }
}
