package Menu;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import search.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class MenuPage extends CommonAPI {

    @Test
    public  void  readMenuText(){

        List<String> actual=new ArrayList<String>();
      List<WebElement> element=  getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
        for (WebElement text: element){
            actual.add(text.getText());
            System.out.println(text.getText());
        }
        System.out.println("Total links --"+element.size());

        //to be impelemented to get from outsource
        List<String> menuData=new ArrayList<>();
        Assert.assertEquals(actual,menuData);



    }

}
//class=".nav-search-dropdown searchSelect"