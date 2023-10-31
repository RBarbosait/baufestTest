package exercisePages;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class HomePage{
	 
		//variables 
		//private By loginMenuActionLink= By.id("login2");
		private By loginMenuActionLink=By.id("login2");
		private By signUpMenuActionLink=By.id("signin2");

		private By inputTextUserName= By.id("loginusername");
		private By inputTextUserPass= By.id("loginpassword");
		//private By buttonLogin= By.name("login");
		//private By userButton=By.xpath("//[@id=\'mount_0_0_42\']/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image");
		
		private WebDriver chromeDriver;
		public HomePage(WebDriver chromeDriver){
			this.chromeDriver=chromeDriver;
			
		}
		
			
			
		public void userLoginActionOk(String user,String pass){
			Duration time = Duration.ofSeconds(5);
			//WebDriverWait wait = new WebDriverWait(chromeDriver, time);
			
			//click login actionMenuOption 
			
			WebElement loginMenuAction = chromeDriver.findElement(loginMenuActionLink);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(loginMenuActionLink));
			WebElement signUpMenuAction = chromeDriver.findElement(signUpMenuActionLink);

			

			
			//check user 
	        Actions builder = new Actions(chromeDriver);
	       // builder.moveToElement(loginMenuAction).click(loginMenuAction);
	        //builder.perform();
	        
	        builder.moveToElement(signUpMenuAction).click(signUpMenuAction);
	        builder.perform();


	        
			
			chromeDriver.findElement(inputTextUserName).sendKeys(user);
			chromeDriver.findElement(inputTextUserPass).sendKeys(pass);
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLogin));
			
			//click login button 
			
			/*WebElement loginButton = chromeDriver.findElement(buttonLogin);
			//check user 
	        Actions builder = new Actions(chromeDriver);
	        builder.moveToElement(loginButton).click(loginButton);
	        builder.perform();*/
	        	
		}}
		
		/*public String getLoginUser() throws InterruptedException{
			
			Duration time = Duration.ofSeconds(5);
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfElementLocated(userButton));
			
			WebElement usermenuButton = driver.findElement(userButton);
			//check user 
	        Actions builder = new Actions(driver);
	        builder.moveToElement(usermenuButton).click(usermenuButton);
	        builder.perform();
	  		return null;//driver.findElement(userName).getText();
		}*/
		
		

	

