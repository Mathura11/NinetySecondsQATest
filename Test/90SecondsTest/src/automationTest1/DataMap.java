package automationTest1;
 
import com.poiji.annotation.ExcelCellName;
 
public class DataMap
{
   	@ExcelCellName("TestMethodName")
   	public String testMethodName;
   	
   	@ExcelCellName("BrandName")
   	public String brandName;
   	
   	@ExcelCellName("BrandWebsite")
   	public String brandWeb;
   	
   	@ExcelCellName("ProjectName")
   	public String projectName;
   	
   	@ExcelCellName("ProjectDesc")
   	public String projectDesc;
   	
   	@ExcelCellName("FirstName")
   	public String firstName;
   	
   	@ExcelCellName("LastName")
   	public String lastName;
   	
   	@ExcelCellName("EmailId")
   	public String emailId;
   	
   	@ExcelCellName("MobileNo")
   	public String mobileNo;
   	
  	@ExcelCellName("ExpectedMessage")
   	public String expectedMsg;
}
 
