package selemium;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class test2 {
	@Test
	public void LaunchChrome_Method1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.169.128/login");
		//driver.get("http://edusciences.uottawa.ca/login");
		driver.manage().window().maximize();
        System.out.println("Page title is: " + driver.getTitle());
       Thread.sleep(1000); 
      
       //driver.findElement(By.id("loginName")).sendKeys("lzhang");
       //driver.findElement(By.id("loginPassword")).sendKeys("lzhang131");
		 driver.findElement(By.id("loginName")).sendKeys("admin");
		 driver.findElement(By.id("loginPassword")).sendKeys("admin_youmaynotpass");
		 driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
//create develop 		 
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[1]/div[4]/div/div[2]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div[2]/a")).click();
		 driver.findElement(By.name("fname")).sendKeys("devetest");
		 driver.findElement(By.name("lname")).sendKeys("devetest");
		 driver.findElement(By.name("email")).sendKeys("devetest@uottawa.ca");
		 driver.findElement(By.name("username")).sendKeys("develop");
		 driver.findElement(By.name("password")).sendKeys("develop");
		 driver.findElement(By.name("passwordx2")).sendKeys("develop");
		 driver.findElement(By.xpath("//*[@id=\"newAccount\"]/div[16]/div/button")).click();
//change it to develop		 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"compteArray\"]/tbody/tr[3]/td[3]/div")));
         driver.findElement(By.xpath("//*[@id=\"compteArray\"]/tbody/tr[3]/td[3]/div")).click();
         driver.findElement(By.linkText("Rôles")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/form/div[2]/div[2]/div/div/div[1]/h4/span/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/form/div[1]/div[3]/div/div/div[1]/h4/span/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/form/div[2]/div[3]/div/button")).click();
//create evalutor
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div[2]/a")).click();
		 driver.findElement(By.name("fname")).sendKeys("qwe12");
		 driver.findElement(By.name("lname")).sendKeys("qwe12");
		 driver.findElement(By.name("email")).sendKeys("qw12@uottawa.ca");
		 driver.findElement(By.name("username")).sendKeys("qw12");
		 driver.findElement(By.name("password")).sendKeys("qw12");
		 driver.findElement(By.name("passwordx2")).sendKeys("qw12");
		 driver.findElement(By.xpath("//*[@id=\"newAccount\"]/div[16]/div/button")).click();
//change it to evalutor		 
		 WebDriverWait wait23 = new WebDriverWait(driver, 20);
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"compteArray\"]/tbody/tr[4]/td[3]/div")));
         driver.findElement(By.xpath("//*[@id=\"compteArray\"]/tbody/tr[4]/td[3]/div")).click();
         driver.findElement(By.linkText("Rôles")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/form/div[1]/div[4]/div/div/div[1]/h4/span/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/form/div[1]/div[3]/div/div/div[1]/h4/span/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/form/div[2]/div[3]/div/button")).click();
//logout
		 driver.get("http://192.168.169.128/logout"); 
//login develop
		 driver.findElement(By.id("loginName")).sendKeys("develop");
		 driver.findElement(By.id("loginPassword")).sendKeys("develop");
		 driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
//create activity
		 for (int i = 0; i<5;i++){
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/div[2]/a")).click();
		 driver.findElement(By.name("title")).sendKeys("csi4900"+i);
		 driver.findElement(By.name("description")).sendKeys("descrition"+i);
		 WebDriverWait wait1 = new WebDriverWait(driver, 20);
	     wait1.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		 driver.findElement(By.name("submit")).click();
		 }
//upload a picture
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div/div/div/a")).click();
		 WebDriverWait wait1 = new WebDriverWait(driver, 20);
	     wait1.until(ExpectedConditions.elementToBeClickable(By.id("mediaUploadForm")));
		 driver.findElement(By.id("mediaUploadForm")).click();
		 Runtime rn = Runtime.getRuntime();  
	        try {  
	            String str = "E://uploadFile.exe";  
	            rn.exec(str);  
	        } catch (Exception e) {  
	            System.out.println("Error to run the exe");  
	        }
	     Thread.sleep(4500); 
	     driver.findElement(By.xpath("//*[@id=\"mediaUploadBtn\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div/div/div/a")).click();
		 WebDriverWait wait11 = new WebDriverWait(driver, 20);
	     wait11.until(ExpectedConditions.elementToBeClickable(By.id("mediaUploadForm")));
		 driver.findElement(By.id("mediaUploadForm")).click();
		 Runtime rn1 = Runtime.getRuntime();  
	        try {  
	            String str = "E://uploadFile.exe";  
	            rn1.exec(str);  
	        } catch (Exception e) {  
	            System.out.println("Error to run the exe");  
	        }
	     Thread.sleep(4500); 
	     driver.findElement(By.xpath("//*[@id=\"mediaUploadBtn\"]")).click();*/
	     
    
//add a information
	    driver.get("http://192.168.169.128/rolechange/chooserole/4");
	    for(int i=1;i<6;i++) {
	     driver.findElement(By.xpath("//*[@id=\"concepteurAtelierArray\"]/tbody/tr["+i+"]/td[4]/div/button")).click();
	     driver.findElement(By.xpath("//*[@id=\"concepteurAtelierArray\"]/tbody/tr["+i+"]/td[4]/div/ul/li[1]/a")).click();
	     driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/a")).click();
	     driver.findElement(By.xpath("//*[@id=\"nameInput\"]")).sendKeys("test1");
	     driver.findElement(By.xpath("//*[@id=\"descriptionInput\"]")).sendKeys("test1");
	     driver.findElement(By.xpath("//*[@id=\"information\"]")).click();
	     driver.findElement(By.xpath(" //*[@id=\"activityDiv\"]/div/div[1]/div/div[2]/div/textarea")).sendKeys("test1");
//add a question
	     driver.findElement(By.xpath("//*[@id=\"textarea\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"activityDiv\"]/div[2]/div[1]/div[1]/div[2]/div/textarea")).sendKeys("testquestion");
	     driver.findElement(By.xpath("//*[@id=\"activityDiv\"]/div[2]/div[1]/div[2]/div[2]/textarea")).sendKeys("testanswer");
//add a image
	     driver.findElement(By.xpath("//*[@id=\"image\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"activityDiv\"]/div[3]/div[1]/div/div[2]/div/textarea")).sendKeys("image");
	     driver.findElement(By.xpath("//*[@id=\"fragment_-1\"]/option")).click();
//Submit
	     driver.findElement(By.xpath(" //*[@id=\"editform\"]/div/div/div/div/div/div/div[2]/div/button")).click();
	     driver.findElement(By.xpath("//*[@id=\"editform\"]/div/div/div/div/div/div/div[2]/div/a")).click();
	     driver.get("http://192.168.169.128/rolechange/chooserole/4");}
//public 1
	     driver.findElement(By.xpath("//*[@id=\"concepteurAtelierArray\"]/tbody/tr[2]/td[4]/div/button")).click();
	     driver.findElement(By.xpath("//*[@id=\"concepteurAtelierArray\"]/tbody/tr[2]/td[4]/div/ul/li[7]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.cssSelector("button.confirm")).click();
//public 2
	     driver.findElement(By.xpath("//*[@id=\"concepteurAtelierArray\"]/tbody/tr[3]/td[4]/div/button")).click();
	     driver.findElement(By.xpath("//*[@id=\"concepteurAtelierArray\"]/tbody/tr[3]/td[4]/div/ul/li[8]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.cssSelector("button.confirm")).click();
//log out
         driver.get("http://192.168.169.128/logout");
//login evalutor
		 driver.findElement(By.id("loginName")).sendKeys("qw12");
		 driver.findElement(By.id("loginPassword")).sendKeys("qw12");
		 driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
//craete score
		 driver.findElement(By.xpath("//*[@id=\"adminworkshops\"]/div/div/div/div[2]/div/div[2]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"adminworkshops\"]/div/div/div/div/div/div/div/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"editform\"]/div[1]/form/div[1]/div/input")).sendKeys("testtitile");
		 driver.findElement(By.name("criteria1")).sendKeys("testtitile");
		 driver.findElement(By.name("criteria2")).sendKeys("testtitile");
		 driver.findElement(By.name("att1-1desc")).sendKeys("testtitile");
		 driver.findElement(By.name("att1-2desc")).sendKeys("testtitile");
		 driver.findElement(By.name("att2-1desc")).sendKeys("testtitile");
		 driver.findElement(By.name("att2-2desc")).sendKeys("testtitile");
		 driver.findElement(By.xpath("//*[@id=\"editform\"]/div[2]/div[1]/input")).click();
		 driver.get("http://192.168.169.128/logout");

//workshop test

//teacher public workshop
		  driver.findElement(By.id("loginName")).sendKeys("testteacher");
		 driver.findElement(By.id("loginPassword")).sendKeys("testteacher");
		 driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
		 for(int j=0;j<2;j++) {
			 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div/a[1]")).click();
		 WebElement A = driver.findElement(By.xpath("//*[@id=\"availableWorkshops\"]/li[1]/div"));
		 WebElement B = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div[2]/form"));
		 Actions action = new Actions(driver);
		 action.dragAndDrop(A, B).build().perform();
	      Thread.sleep(1000); 
	 	 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/button")).click();}
	 	 driver.get("http://192.168.169.128/logout");
//student doing test
	 	driver.findElement(By.id("loginName")).sendKeys("test00");
		 driver.findElement(By.id("loginPassword")).sendKeys("test00");
		 driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[1]/div/div/div/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[5]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"activityForm\"]/div[2]/div/div/div/div/textarea")).sendKeys("qwe");
		 WebDriverWait wait3 = new WebDriverWait(driver, 20);
	     wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnsave\"]")));
		 driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
		 driver.get("http://192.168.169.128/logout");
//teacher check test
		 driver.findElement(By.id("loginName")).sendKeys("testteacher");
		 driver.findElement(By.id("loginPassword")).sendKeys("testteacher");
		 driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div/a[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div/div[2]/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/a")).click();
		 driver.get("http://192.168.169.128/logout");
//////????????????????????????????????????????????????????????????????????????????????????????????????????????
//more student doingtest
		 for(int i=1;i<2;i++) {
			 driver.findElement(By.id("loginName")).sendKeys("test0"+i);
			 driver.findElement(By.id("loginPassword")).sendKeys("test0"+i);
			 driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
			 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[1]/div/div/div/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[5]/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"activityForm\"]/div[2]/div/div/div/div/textarea")).sendKeys("qwe");
			 WebDriverWait wait2 = new WebDriverWait(driver, 20);
		     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnsave\"]")));
			 driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
			 driver.get("http://192.168.169.128/logout");
		 }


         }
	     
	}

