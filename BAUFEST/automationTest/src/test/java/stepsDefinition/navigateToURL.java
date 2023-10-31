package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import exercisePages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class navigateToURL {
	
	WebDriver chromeDriver=null;
	String driverPath="../automationTest/driver/chromedriver.exe";
	
	private HomePage homePage;
	
	@Before
    public void initializeObjects() {
		//System.setProperty("webdriver.chrome.driver",driverPath);
		//chromeDriver=new ChromeDriver();
       
       /*
        TestCases[] testCases = TestCases.values();
        test = report.startTest(testCases[Utils.testCount].getTestName());
        log.info("Test {} has started.", test.getTest().getName());
        Utils.testCount++;*/
    }

    /*@After
    public void closeObjects() {
        report.endTest(test);
        report.flush();
        log.info("Test {} has ended.", test.getTest().getName());
    }

    @AfterAll
    public static void closeDriver(){
        DriverSingleton.closeObjectInstance();
    }*/
	
	@Given("^I lunch Google Chrome browser$")
	public void i_lunch_Google_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",driverPath);
		chromeDriver=new ChromeDriver();
		 homePage = new HomePage(chromeDriver);
		//throw new io.cucumber.java.PendingException();
	}

	@When("^I navigate to the url$")
	public void i_navigate_to_the_url() throws Throwable {
		String url="https://www.demoblaze.com";
		chromeDriver.get(url);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	
	@SuppressWarnings("deprecation")
	@Then("^I validate the title of the web page$")
	public void i_validate_demoBlaze_https_www_demoblaze_com_index_html_web_page_is_loaded() throws Throwable {
	    String actualTitle=chromeDriver.getTitle();
	    String expectedTitle="STORE";
	    Assert.assertEquals(expectedTitle,actualTitle);
	    
	    homePage.userLoginActionOk("Rodrigo", "Pass");
		
		// Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}


}
