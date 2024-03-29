package automationTest1;
 
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import com.poiji.option.PoijiOptions.PoijiOptionsBuilder;
public class TestScenarios {
           	public WebDriver driver;
           	private static Logger Log = LogManager.getLogger(TestScenarios.class.getName());
           	
           	  @DataProvider(name = "CreateVideoDataMappingDataProvider")
                          	public Iterator<DataMap> getData(Method method) {
                                         	PoijiOptions options = PoijiOptionsBuilder.settings()
                                                        	           	.sheetIndex(0)
                                                        	           	.build();
 
                                         	String currentTestMethodName = method.getName();
 
                                         	List<DataMap> filteredTestData = new ArrayList<DataMap>();
                                         	List<DataMap> testData = Poiji.fromExcel(new File("src/TestData/TestDataSheet.xlsx"), DataMap.class, options);
                                         	for(int i = 0; i < testData.size(); i++){
                                         	 if(testData.get(i).testMethodName.equalsIgnoreCase(currentTestMethodName)){
                                                        	           	filteredTestData.add(testData.get(i));
                                                        	}
                                         	}
                                         	Iterator<DataMap> itr = filteredTestData.iterator();
 
                                         	return itr;
           	  }       	
 @Test(dataProvider="CreateVideoDataMappingDataProvider")
  public void TestScenario1(DataMap dm) throws InterruptedException {
 
           	  fillFormDetails(dm);
           	  String successMsg = driver.findElement(Locators.confirmationTxt).getText();
	       	  Assert.assertEquals(true,successMsg.equals(dm.expectedMsg) );
	       	  Log.info("Order has been placed successfully");
  	
  }
 public void fillFormDetails(DataMap dm) throws InterruptedException
 {
           	  driver.findElement(Locators.createVideo).click();;
           	  Log.info("Create Video link has been clicked");
           	  driver.findElement(Locators.brandName).sendKeys(dm.brandName);
           	  driver.findElement(Locators.brandWebsite).sendKeys(dm.brandWeb);
           	  driver.findElement(Locators.projectName).sendKeys(dm.projectName);
           	  driver.findElement(Locators.projectDescription).sendKeys(dm.projectDesc);
           	  driver.findElement(Locators.firstName).sendKeys(dm.firstName);
           	  driver.findElement(Locators.lastName).sendKeys(dm.lastName);
      driver.findElement(Locators.email).sendKeys(dm.emailId);
      driver.findElement(Locators.mobileNo).sendKeys(dm.mobileNo);
      driver.findElement(Locators.termsConditions).click();
      Log.info("Quote form details are filled");
      driver.findElement(Locators.nextBtn).click();
 }
 @Test(dataProvider="CreateVideoDataMappingDataProvider")
 public void TestScenario2(DataMap dm) throws InterruptedException {
 
           	  fillFormDetails(dm);
           	 Assert.assertEquals(true, driver.findElement(Locators.errorMsg).getText().equals(dm.expectedMsg));
           	 Log.info("Due to incomplete fields ,order cant be placed");
 }
  @BeforeMethod
  public void beforeMethod() {
           	  String exePath = "src/Driver/chromedriver.exe";
           	  System.setProperty("webdriver.chrome.driver", exePath);
           	  driver = new ChromeDriver();
           	 
  	//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
           	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           	  DOMConfigurator.configure("src/log4j2.xml");
  	//Launch 90 Seconds web application
 
      driver.get("https://app.90seconds.cc");
  }
 
  @AfterMethod
  public void afterMethod() {
  	driver.quit();
 
  }
}
 
 
