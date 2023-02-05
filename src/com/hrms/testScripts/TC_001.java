package com.hrms.testScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
	//To provide Test Scripts
//public static void main(String[] args)throws Exception {
	
	//TEST STEPS
	
@Test	
public void tc001() {
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	
	obj.openApplication();
	
	obj.login();

	obj.logout();
	
	obj.closeApplication();
	
	
}
}
