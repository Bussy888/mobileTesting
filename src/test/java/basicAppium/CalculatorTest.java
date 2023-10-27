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

public class CalculatorTest {
    AppiumDriver phone;

    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "TECNO POVA 4");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appPackage", "com.transsion.calculator");
        capabilities.setCapability("appActivity", "com.transsion.calculator.Calculator");
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
        //ACCEPT BUTTON
        phone.findElement(By.id("com.transsion.calculator:id/mbtnOk")).click();
        //Click 5
        phone.findElement(By.id("com.transsion.calculator:id/digit_5")).click();
        //Click +
        phone.findElement(By.id("com.transsion.calculator:id/op_add")).click();
        //Click 7
        phone.findElement(By.id("com.transsion.calculator:id/digit_7")).click();
        //click =
        phone.findElement(By.id("com.transsion.calculator:id/eq_rl")).click();
        //Verification expectedResult 12 = actualResult 12
        Thread.sleep(5000);
        String expectedResult = "12";
        String actualResult = phone.findElement(By.id("com.transsion.calculator:id/result")).getText();
        Assertions.assertEquals(expectedResult, actualResult, "ERROR la suma esta mal");

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