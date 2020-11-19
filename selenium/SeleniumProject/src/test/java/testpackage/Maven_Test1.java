package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Maven_Test1 {
	 
    public static void main(String args[]) {
    	
    	String baseUrl = "http://35.223.146.89:8081";
        String expectedTitle = "Simple PHP Website";

        String driverPath = "/home/ansible/chromedriver";  
        WebDriver driver ; 
        
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
    	
        
        String actualTitle = "";

        
        driver.get(baseUrl);

       
        actualTitle = driver.getTitle();

       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        driver.quit(); 
      
     }
  
              
     }
