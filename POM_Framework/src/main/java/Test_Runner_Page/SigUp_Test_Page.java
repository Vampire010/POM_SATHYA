package Test_Runner_Page;

import Browser_SetUp.Launch_Browsers;
import Login_SignUp_Page.SignUp_Page;

public class SigUp_Test_Page 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String Brswr_Type = "firefox";
		String URL = "http://mykidsbank.org/";
		
		Launch_Browsers br = new Launch_Browsers();
		br.browsers(Brswr_Type, URL);
		
		SignUp_Page sng_pg = new SignUp_Page(br.driver);
		
		sng_pg.Frst_name();
		sng_pg.Lst_name();
		sng_pg.Your_Email();
		sng_pg.ReEnt_Your_Email();
		sng_pg.User_Password();
		sng_pg.Parent_Gurd();
		sng_pg.Sign_Up_btn();
		Thread.sleep(2000);
		sng_pg.Continue_btn();
		Thread.sleep(2000);
		sng_pg.Home_btn();
		Thread.sleep(2000);
		br.driver.quit();
		
	}

}
