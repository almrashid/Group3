package button;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import search.CommonAPI;

public class ClickButton extends CommonAPI {


    @Test
    public  void click(){
       driver.findElement(By.xpath("//*[@id='nav']/div[2]/div[2]/a[2]")).click();
    }

}
