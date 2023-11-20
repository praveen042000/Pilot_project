package Locators;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	public class LoginLocators {
		@FindBy(xpath="//input[@placeholder='Username']")
		public WebElement username;
		@FindBy(xpath="//input[@placeholder='Password']")
		public WebElement password;
		@FindBy(xpath="(//div[@class='oxd-form-actions orangehrm-login-action']//button)")
		public WebElement loginButton;
		@FindBy(xpath="//h6[text()='Dashboard']")
		public WebElement verifyText;
		@FindBy(xpath="//i[contains(@class,'oxd-icon bi-exclamation-circle')]/following-sibling::p[1]")
		public WebElement errorText;
	}


