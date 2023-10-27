package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WhenDo1 {
    AppiumDriver phone;

    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "TECNO POVA 4");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appPackage", "com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity", "com.vrproductiveapps.whendo.ui.HomeActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");

        phone = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterEach
    public void closeApp() {
        phone.quit();
    }

    @Test
    public void verifyAddTwoNumbers() throws InterruptedException {
        String taskName = "Tarea1";
        //ACCEPT BUTTON
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        //Click 5
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys(taskName);
        //Click +
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("DESCRIPCION: com.vrproductiveapps.whendo:id/noteTextNotes");
        //Click 7
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

        //Verification expectedResult 12 = actualResult 12
        Thread.sleep(500);Assertions.assertTrue( phone.findElements(By.xpath("//android.widget.TextView[@text='"+taskName+"']")).size() >= 1,"ERROR ! no se creo la tarea");
        /*String expectedResult = "Tarea1";
        String actualResult = phone.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals(expectedResult, actualResult, "ERROR no se creo la tarea");*/

        /* phone.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
        // click +
        phone.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
        // click 7
        phone.findElement(By.xpath("//android.widget.Button[@text='7']")).click();
        // click  =
        phone.findElement(By.xpath("//android.widget.Button[@content-desc=\"equals\"]")).click();
         // verification  expectedResult 12 = actualResult 12
        Thread.sleep(5000);
        String expectedResult="12";
        String actualResult= phone.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.calculator2:id/result\"]")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR la suma esta mal");*/

    }
}
