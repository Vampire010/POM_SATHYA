package Login_SignUp_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{

	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")
	WebElement Bnk_Id;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")
	WebElement Usr_Name;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")
	WebElement Usr_Pssword;
	
	@FindBy(xpath="//*[@id=\"clicked_when_enter_id\"]")
	WebElement Login_Btn;
	
	
	public Login_Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void Bank_Id()
	{
		Bnk_Id.sendKeys("70520");
	}
	
	public void UserName()
	{
		Usr_Name.sendKeys("banker");
	}
	
	public void Password()
	{
		Usr_Pssword.sendKeys("ram12345");
	}
	
	public void Lign_Button()
	{
		Login_Btn.click();
	}
}
