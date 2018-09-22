package testcases;
import accounts.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.CommonAPI;

public class LoginToMento extends CommonAPI {
  @Test
    public  void loginMagento(){
     LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
     loginPage.loginMegento("almrashid@yahoo.com","Toyota2007");
  }
}
