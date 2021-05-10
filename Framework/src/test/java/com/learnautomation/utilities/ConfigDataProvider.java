package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	 Properties pro;
	
	public ConfigDataProvider() {
		File src=new File("./Configuration/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to Load Config file"+ e.getMessage());
		} 
	}
		public String getDataFromConfig(String KeytoSearch)
		{
			return pro.getProperty("KeytoSearch");
		}
        public String getBrowser() 
        {
			return pro.getProperty("Browser");
		}
         public String getStaggingURL() 
         {
        	 return pro.getProperty("qaURL");
		}
	

}
