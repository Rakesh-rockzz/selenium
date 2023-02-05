package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
     WebDriver driver;  
     // To Provide Test Data And Objects For Whole Application
//Test Data
     public String url = "http://183.82.103.245/nareshit/login.php";
     public String username = "nareshit";
     public String password = "nareshit";
     public String firstname = "Rakesh";
     public String lastname = "Pogu";
     public String searchfor = "0003";
//Objects
     public String txt_username = "txtUserName";
     public String txt_passwod = "txtPassword";
     public String btn_login = "Submit";
     public String link_logout = "Logout";
     public String txt_firstname = "txtEmpFirstName";
     public String txt_lastname = "txtEmpLastName";
     public String btn_save = "btnEdit";
     public String btn_add = "//input[@value='Add']";
     public String lt_mouseover_PIM = "PIM";
     public String lt_addemp = "Add Employee";
     public String dropdown_searchBy = "loc_code";
     public String Emp_Id = "Emp. ID";
     public String txt_searchfor = "loc_name";
     public String btn_search = "//input[@value='Search']";
     public String checkbox_1 = "chkLocID[]";
     public String btn_delete = "//input[@value='Delete']";
     
}
