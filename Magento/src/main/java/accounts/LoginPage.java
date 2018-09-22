package accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import search.CommonAPI;

public class LoginPage extends CommonAPI {

    @FindBy(how = How.XPATH, using= "//*[@class='fa fa-user']")
    WebElement imagebutton;
    @FindBy(how = How.ID , using = "pass") WebElement password;
    @FindBy(how=How.ID, using="email") WebElement username;
    @FindBy(how=How.ID, using="send2")
    WebElement submit;
    @FindBy(how= How.XPATH,using ="//*[@id='screen-page']/div[3]/div[2]/div[1]/div/div[1]/a")
    WebElement logOutButton;

    public WebElement getImagebutton() {
        return imagebutton;
    }

    public void setImagebutton(WebElement imagebutton) {
        this.imagebutton = imagebutton;
    }
    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }


    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }


    public WebElement getSubmit() {
        return submit;
    }

    public void setSubmit(WebElement submit) {
        this.submit = submit;
    }

    public WebElement getLogOutButton() {
        return logOutButton;
    }

    public void setLogOutButton(WebElement logOutButton) {

        this.logOutButton = logOutButton;
    }

    public  void loginMegento(String user, String pass){
        imagebutton.click();
        username.sendKeys(user);
        password.sendKeys(pass);
        submit.click();
        logOutButton.click();
    }





}
