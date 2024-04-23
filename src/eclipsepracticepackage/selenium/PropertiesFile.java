package eclipsepracticepackage.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop;
	
	public static void main(String[] args) throws IOException {
	
		
		File file=new File("");
		
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream(file);
		
		prop.load(fis);
		
		//prop.getProperty("URL");

	}
	
	public String getURL()
	{
		return prop.getProperty("URL");
	}
	
	
}
