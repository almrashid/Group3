package testcases;


import accounts.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.CommonAPI;

public class LoginToMento extends CommonAPI {


  @Test
    public  void loginMagento(){

     LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);

     loginPage.getImagebutton().click();
     loginPage.getUsername().sendKeys("almrashid@yahoo.com");
     loginPage.getPassword().sendKeys("Toyota2007");
     loginPage.getSubmit().click();



  }




}
