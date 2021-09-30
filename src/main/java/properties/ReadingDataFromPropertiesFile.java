package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\files\\config.properties");

		prop.load(fis);
		System.out.println(prop.get("username"));
		System.out.println(prop.getProperty("password"));
		
	}

}
