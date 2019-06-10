package automationTest1;
 
import org.openqa.selenium.By;
 
public interface Locators {
public static final By createVideo = By.xpath("/html/body/header/nav[1]/div[3]/a[4]");
public static final By  brandName = By.id("order_organisation_name");
public static final By  brandWebsite = By.id("order_organisation_website");
public static final By projectName = By.id("order_project_name");
public static final By projectDescription = By.id("order_project_description");
public static final By firstName = By.id("order_contact_first_name");
public static final By lastName = By.id("order_contact_last_name");
public static final By email = By.id("order_contact_email");
public static final By mobileNo = By.id("order_contact_mobile");
public static final By termsConditions = By.id("accepts_terms");
public static final By nextBtn = By.xpath("//*[@id=\"new_order\"]/div/button");
public static final By confirmationTxt = By.xpath("//*[@id=\"main\"]/div/div/div[2]/h1/p");
public static final By errorMsg = By.xpath("//*[@id=\"validation_dialog\"]//span");
}
 
