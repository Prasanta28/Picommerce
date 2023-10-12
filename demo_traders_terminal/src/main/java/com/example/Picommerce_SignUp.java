package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Picommerce_SignUp {


	//public static void main(String[] args) {
	
		
		WebDriver driver;
		
		
        @BeforeClass
        public void setUp()
        {
        System.setProperty("webdriver.chrome.driver", "/home/openweb/Downloads/chromedriver-linux64/chromedriver");	
        driver = new ChromeDriver();  
        driver.get("https://picommerce-store.intellexio.com/");
        try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        driver.manage().window().maximize();
        try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        }
        
        
        @Test		  
        public void verifyProjectLogo() 
        {
          String actualTitle =driver.getTitle(); 
          String ExpectedTitle="PATCOMMERCE";
        Assert.assertEquals(actualTitle, ExpectedTitle);
        try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();	  
          }
        }
        
        @Test		  
        public void verifyProjectTitle() 
        {
          boolean logo =driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/mat-toolbar[2]/app-spurt-header-menu/mat-toolbar-row/a/img")).isDisplayed();
          
        Assert.assertTrue(logo);
        try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();	  
          }
        }
        
        @Test		  
        public void signUpTest() 
        {
        WebElement signin1 = driver.findElement(By.xpath("//*[contains(@href,'/auth')]"));
          signin1.click();
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement signup1= driver.findElement(By.xpath("//*[contains(text(),'Sign up')]"));
          signup1.click();
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          } 
        WebElement signupSubmit1= driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-auth/mat-card/app-sign-up/div/div/form/div[4]/button"));
          signupSubmit1.click();
          try {
             Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
       // WebElement RememberPassword = driver.findElement(By.xpath("//*[@id=\"mat-checkbox-3\"]/label/div"));
        //   RememberPassword.click();
        //   try {
         //        Thread.sleep(1000);
          //     } catch (InterruptedException e) {
          //        e.printStackTrace();
          //     }
          
        //  WebDriverWait wait = new WebDriverWait(driver, 10000);
        //  WebElement signupFirstName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mat-input-14']")));

         WebElement signupFirstName= driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]"));
           signupFirstName.sendKeys("Prasanta");
           try {
             Thread.sleep(1000);
           } catch (InterruptedException e) {
              e.printStackTrace();
           }
          
        WebElement signupLastName= driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]"));
          signupLastName.sendKeys("Sahu");
            try {
              Thread.sleep(1000);
           } catch (InterruptedException e) {
              e.printStackTrace();
           }
        WebElement signupEmail= driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]"));
          signupEmail.sendKeys("prasanta+145@pitangent.com");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement signupPhoneNumber= driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]"));
          signupPhoneNumber.sendKeys("8942069111");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement signupPassword= driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]"));
          signupPassword.sendKeys("123456");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement signupPasswordView= driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-auth/mat-card/app-sign-up/div/div/form/div[3]/mat-form-field[1]/div/div[1]/div[4]/mat-icon"));
          signupPasswordView.click();
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement signupConfirmPassword= driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]"));
          signupConfirmPassword.sendKeys("123456");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement signupConfirmPasswordView= driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-auth/mat-card/app-sign-up/div/div/form/div[3]/mat-form-field[2]/div/div[1]/div[4]/mat-icon"));
          signupConfirmPasswordView.click();
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          
        WebElement SignupSubmit = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-auth/mat-card/app-sign-up/div/div/form/div[4]/button"));
          SignupSubmit.click();
          try {
              Thread.sleep(3000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }  
        WebElement Signin4 = driver.findElement(By.xpath("//*[@class=\"sign-in-btn mt-2 mat-raised-button mat-primary\"]"));
          Signin4.click();

          // Wait for a few seconds to see the result before sign in
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        } 
        
        
        @Test		  
        public void sign_in()
        { 
          WebElement signin2 = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-auth/mat-card/app-sign-in/div/div/form/div[2]/button"));
          signin2.click();
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
       // Sign_in after successfully registration 
          
        WebElement signin_Email1= driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]"));
          signin_Email1.sendKeys("prasanta+122@pitangent.com");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement signup_Password1= driver.findElement(By.xpath("//*[@id=\"mat-input-13\"]"));
          signup_Password1.sendKeys("123456");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        WebElement Signin6 = driver.findElement(By.xpath("//*[@class=\"mat-raised-button mat-primary sign-btn w-100\"]"));
          Signin6.click();
          try {
              Thread.sleep(3000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        }
        
        @Test
        
        public void menuTab_checking()
        {
            WebElement Allproduct = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[2]"));
            Allproduct.click();
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              
            WebElement Sports = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[3]"));
            Sports.click();
               try {
                  Thread.sleep(2000);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
                  
            WebElement Babies_Kid = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[4]"));
            Babies_Kid.click();
                try {
                   Thread.sleep(2000);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                      
                      
//    	       WebElement Electronics = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[5]"));
//    	       Electronics.click();
//		           try {
//			            Thread.sleep(2000);
//			       } catch (InterruptedException e) {
//			            e.printStackTrace();
//			       }
             WebElement Mens_fashion = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[6]"));
             Mens_fashion.click();
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 
             WebElement Womens_fashion = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[7]"));
             Womens_fashion.click();
                 try {
                    Thread.sleep(2000);
                 } catch (InterruptedException e) {
                    e.printStackTrace();
                 }			       

             WebElement Home_Furniture = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[8]"));
             Home_Furniture.click();
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }	
                 
             WebElement Book_More = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[9]"));
             Book_More.click();
                 try {
                    Thread.sleep(2000);
                 } catch (InterruptedException e) {
                    e.printStackTrace();
                 }
                   
             WebElement Contact = driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[10]"));
             Contact.click();
                 try {
                        Thread.sleep(2000);
                 } catch (InterruptedException e) {
                    e.printStackTrace();
                 }				       
                 
        }
        
        
         @AfterClass 
         public void tearDown()
         {
          // Close the browser
       // driver.quit();  
         }
    
}
