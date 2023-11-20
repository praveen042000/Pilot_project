package Actions;

import org.openqa.selenium.support.PageFactory;

import Locators.LoginLocators;
import Utility.HelperClass;


public class LoginActions {
	LoginLocators logloc ;
	
	public LoginActions() {
		logloc = new LoginLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), logloc);
	}
	
	public void setEmail(String username) {
		logloc.username.sendKeys(username);
	}
	public void setPassword(String password) {
		logloc.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		logloc.loginButton.click();
	}
	public String getVerifyText() {
		return logloc.verifyText.getText();
	}
	public String getErrorText() {
		return logloc.errorText.getText();
	}
	
	public void loginAccount(String username, String password) {
		setEmail(username);
		setPassword(password);
	}
}