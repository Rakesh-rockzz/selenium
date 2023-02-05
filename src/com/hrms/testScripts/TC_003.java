package com.hrms.testScripts;

import com.hrms.lib.General;

public class TC_003 {
public static void main(String[] args) {
	General obj = new General();
	//Test Steps
	obj.openApplication();
	obj.login();
	obj.entframe();
	obj.deleteEmp();
	obj.extframe();
	obj.logout();
	obj.closeApplication();
}
}
