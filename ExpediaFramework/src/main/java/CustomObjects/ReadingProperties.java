package CustomObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
	
	public static  Properties Readingpropertiesv() throws IOException
	{
		Properties prop = new Properties();
		String path = "C:\\Users\\vinodtharavath\\git\\VTExpedia\\ExpediaFramework\\vt.properties";
		try {
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
			//String Pg = prop.getProperty("urlpage");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ok Error Man!");
			e.printStackTrace();
		}
		return prop;
	}

}
