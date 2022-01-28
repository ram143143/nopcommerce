package nopcommerse.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	Select dropdown;
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(id="gender-male")
	WebElement male;
	
	@FindBy(id="gender-female")
	WebElement female;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(name="DateOfBirthDay")
	WebElement day; 
	
	@FindBy(name="DateOfBirthMonth")
	WebElement month;
	
	@FindBy(name="DateOfBirthYear")
	WebElement year;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirm;
	
	@FindBy(id="register-button")
	WebElement registerbutton;
	
	public void registerpage() {
		register.click();
	}
	
	public void selectgender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			male.click();
		}
		else if(gender.equalsIgnoreCase("Female")) {
			female.click();
		}
	}
	
	
	public void setFirstname(String Fname) {
		
		firstname.sendKeys("Naresh");
	}
	
	public void setLastname(String Lname) {
		lastname.sendKeys("Reddy");
	}
	
	public void setbirthday(String Day) {
		dropdown=new Select(day);
		dropdown.selectByVisibleText(Day);
		
	}
	
	public void setbirthmonth(String Month) {
		dropdown=new Select(month);
		dropdown.selectByVisibleText(Month);
		
	}
	
	public void setbirthyear(String Year) {
		dropdown=new Select(year);
		dropdown.selectByVisibleText(Year);
		
	}
	
	public void registerEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void setPassword(String Password) {
		if(Password.length()>=6) {
			password.sendKeys(Password);	
		}
		else {
			throw new ArithmeticException("Password must have minimum 6 Characters");
		}
	}
	
	public void confirmPassword(String Password,String cPassword) throws Exception {
		if(Password.equals(cPassword)) {
			confirm.sendKeys(cPassword);
		}
		else {
			throw new StringIndexOutOfBoundsException("The password and confirmation password do not match");
		}
	}
	
	public void clickRegisterbutton() {
		registerbutton.click();
	}
}
