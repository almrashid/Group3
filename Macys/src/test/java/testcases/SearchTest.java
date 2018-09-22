package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.CommonAPI;
import search.SearchItem;

public class SearchTest extends CommonAPI {





    @Test
    public  void findItem(){

       SearchItem searchItem= PageFactory.initElements(driver, SearchItem.class);

       searchItem.searchProduct("shooo");
       searchItem.getSubmitButton();

    }




}
