package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static search.CommonAPI.convertToString;

public class Search {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {

        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {

        return submitButtonWebElement;
    }

    public void searchFor(String value)
    {
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton()
    {
        getSubmitButtonWebElement().click();
    }
    public void clearInput()
    {
        getSearchInputWebElement().clear();
    }
    public List<String>getMenuData( ){
        List<String> data=new ArrayList<>();
        data.add("Laptop");
        data.add("Honey");
        data.add("Honey");
        return  data;

    }

    public void searchItemsAndSubmitButton()throws IOException {
       // ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        //String [] value = itemsToBeSearched.getDataFromExcelFile();
        List<String> list=getMenuData();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws InterruptedException{
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }



}
