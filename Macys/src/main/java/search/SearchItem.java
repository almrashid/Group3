package search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchItem {

    @FindBy(how= How.ID,using = "globalSearchInputField")
    WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }

    @FindBy(how=How.ID, using = "searchSubmit")
    WebElement submitButton;

    public  void  searchProduct(String name){
        searchButton.sendKeys(name);
        submitButton.click();
    }




}
