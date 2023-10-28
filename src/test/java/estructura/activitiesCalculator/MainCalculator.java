package estructura.activitiesCalculator;

import estructura.control.Button;
import estructura.control.Label;
import org.openqa.selenium.By;

public class MainCalculator {
    public Button acceptButton = new Button(By.id("com.transsion.calculator:id/mbtnOk"));
    public Button fiveButton = new Button(By.id("com.transsion.calculator:id/digit_5"));
    public Button sevenButton = new Button(By.id("com.transsion.calculator:id/op_add"));
    public Button addButton = new Button(By.id("com.transsion.calculator:id/digit_7"));
    public Button equalButton = new Button(By.id("com.transsion.calculator:id/eq_rl"));

    public Label resultLabel = new Label(By.id("com.transsion.calculator:id/result"));

}