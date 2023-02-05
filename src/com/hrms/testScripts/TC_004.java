package com.hrms.testScripts;

import com.hrms.lib.General;

public class TC_004 {
public static void main(String[] args) throws Exception{
	General obj = new General();
	obj.openApplication();
	obj.login();
	Thread.sleep(3000);
	obj.mouseover();
	Thread.sleep(3000);
	obj.logout();
	obj.closeApplication();
}
}
