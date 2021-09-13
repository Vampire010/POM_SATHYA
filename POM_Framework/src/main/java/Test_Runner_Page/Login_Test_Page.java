package Test_Runner_Page;

import Browser_SetUp.Launch_Browsers;
import Login_SignUp_Page.Login_Page;

public class Login_Test_Page {

	public static void main(String[] args) 
	{
		String Brswr_Type = "chrome";
		String URL = "http://mykidsbank.org/";
		
		Launch_Browsers br = new Launch_Browsers();
		br.browsers(Brswr_Type, URL);
		
		Login_Page Lng_pg = new Login_Page(br.driver);
		Lng_pg.Bank_Id();
		Lng_pg.UserName();
		Lng_pg.Password();
		Lng_pg.Lign_Button();
	}
}
