package search;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {

    @Test

    public void search() throws InterruptedException {
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey");
        typeOnInput("#twotabsearchtextbox","Laptop");

    }





}
