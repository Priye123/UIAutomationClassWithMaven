package javatestcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesClass {

	public static String read(String browser) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		prop.load(fis);
		return prop.getProperty(browser);
	}

	public static void main(String[] args) throws IOException {

	}

}
