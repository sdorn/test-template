package com.sdo.test;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.sdo.utils.properties.PropertyLoader;



public class Test {
	
	public static final String DIR = System.getProperty("user.dir");
	public static final Logger log = Logger.getLogger(Test.class.getName());
	public static final String PREFIX = Test.class.getCanonicalName();
	
	public static final String PROPS = "conf/test";
	public static final Properties PROPERTIES = PropertyLoader.loadProperties(
			PROPS, PREFIX);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		
		
		test.doSomeThingAndLog();
		
	}
	
	 public void doSomeThingAndLog() {
		 String confdir = PROPERTIES.getProperty(PREFIX + ".confdir");
		 PropertyConfigurator.configureAndWatch(confdir + "/log4j.properties");
		 log.info(PROPERTIES.toString());
		 
		
		
		  }

}
