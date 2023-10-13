package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Picommerce {
    

    public static void main(String[] args) {
		

		
		 // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/openweb/Downloads/chromedriver-linux64/chromedriver");

       // ChromeDriverService service = ChromeDriverService.createDefaultService();
       //        service.
       //        service.SuppressInitialDiagnosticInformation = true;
       //        service.HideCommandPromptWindow = true;
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();    
        
        // Open the signup page
        driver.get("https://picommerce-store.intellexio.com/");
        
       // driver.maximize_window();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
       // driver.manage().window().minimize();   
       // driver.manage().window().maximize();

        // Find and fill in the signup form fields
        WebElement signin1 = driver.findElement(By.xpath("//*[contains(@href,'/auth')]"));
        signin1.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.navigate().back();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement Wishlist = driver.findElement(By.xpath("//*[contains(@href,'/wishlist')]"));
        Wishlist.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.navigate().back();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement Cart = driver.findElement(By.xpath("//*[contains(@href,'/cart')]"));
        Cart.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signin2 = driver.findElement(By.xpath("//*[contains(@href,'/auth')]"));
        signin2.click();
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
        WebElement signin3= driver.findElement(By.xpath("//*[@id=\"app\"]/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-auth/mat-card/app-sign-up/div/div/p/a"));
        signin3.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
        WebElement signup2= driver.findElement(By.xpath("//*[contains(text(),'Sign up')]"));
        signup2.click();
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
        
        //WebDriverWait wait = new WebDriverWait(driver, 10); // Timeout of 10 second
        //WebElement signupFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-14\"]")));
        //signupFirstName.sendKeys("Prasanta");
        
         WebElement RememberPassword = driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/div"));
         RememberPassword.click();
         
         // For New registration 
         
         WebElement signupFirstName= driver.findElement(By.xpath("//*[@id=\"mat-input-14\"]"));
         signupFirstName.sendKeys("Prasanta");
         try {
           Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
        
        WebElement signupLastName= driver.findElement(By.xpath("//*[@id=\"mat-input-15\"]"));
        signupLastName.sendKeys("Sahu");
          try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
        WebElement signupEmail= driver.findElement(By.xpath("//*[@id=\"mat-input-16\"]"));
        signupEmail.sendKeys("prasanta+122@pitangent.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signupPhoneNumber= driver.findElement(By.xpath("//*[@id=\"mat-input-17\"]"));
        signupPhoneNumber.sendKeys("8942069111");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signupPassword= driver.findElement(By.xpath("//*[@id=\"mat-input-18\"]"));
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
        WebElement signupConfirmPassword= driver.findElement(By.xpath("//*[@id=\"mat-input-19\"]"));
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
        WebElement Signin5 = driver.findElement(By.xpath("//*[@class=\"mat-raised-button mat-primary sign-btn w-100\"]"));
        Signin5.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Sign_in after successfully registration 
        
        WebElement signin_Email1= driver.findElement(By.xpath("//*[@id=\"mat-input-20\"]"));
        signin_Email1.sendKeys("prasanta+122@pitangent.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signup_Password1= driver.findElement(By.xpath("//*[@id=\"mat-input-21\"]"));
        signup_Password1.sendKeys("123456");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement Signin6 = driver.findElement(By.xpath("//*[@class=\"mat-raised-button mat-primary sign-btn w-100\"]"));
        Signin6.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        WebElement AfterSignin_Wishlist = driver.findElement(By.xpath("//*[contains(@href,'/wishlist')]"));
        AfterSignin_Wishlist.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.navigate().back();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement AfterSignin_Cart = driver.findElement(By.xpath("//*[contains(@href,'/cart')]"));
        AfterSignin_Cart.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement AfterSignin_Account = driver.findElement(By.xpath("//*[@class=\"blackStyle mat-button ng-star-inserted\"]"));
        AfterSignin_Account.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement AfterSignin_Account_OrderHistory = driver.findElement(By.xpath("//*[@class=\"mat-menu-item\"][1]"));
        AfterSignin_Account_OrderHistory.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      
      //*[contains(@href,"/account/orders")]

        // Close the browser
       // driver.quit();
		
		
		
	}

}
