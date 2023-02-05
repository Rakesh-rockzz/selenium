package com.hrms.testScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002 { 
//public static void main(String[] args)throws Exception {
	@Test
	public void tc002() {
		DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.entframe();
	obj.addNewEmp();
	obj.extframe();
	obj.logout();
	obj.closeApplication();
}
}
