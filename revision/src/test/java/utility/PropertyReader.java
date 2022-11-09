package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	/**
	 * 
	 * @param fileName
	 * @return Properties
	 */
	
	public static Properties getAllProperties(String fileName) {
		
		FileInputStream inputFile;
		Properties p=null;
		try {
			inputFile=new FileInputStream(System.getProperty("user.dir")+"/sre/test/resources/properties/"+fileName+".properties");
		
		p =new Properties();
		try {
			p.load(inputFile);
		} catch (IOException e) {
			System.out.println(" not a valid data in property file");
		}
		
		} catch (FileNotFoundException e) {
			System.out.println("not a valid property file name or file path ");
		}
		
		
		return p;
	}
	
	public static String getPropertyValue(String propertyFileName,String propertyKey) {
		
		return getAllProperties(propertyFileName).getProperty(propertyKey);
	}

}
