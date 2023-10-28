package estructura.testSuite;

import estructura.activitiesCalendar.MainCalendar;
import estructura.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalendarTest {
    String title = "Tarea Appium";
    MainCalendar mainCalendar = new MainCalendar();
    @Test
    public void verifyAddCalculator(){
        mainCalendar.acceptButton.click();
        mainCalendar.changeViewButton.click();
        mainCalendar.dayViewButton.click();
        mainCalendar.nextDayButton.click();
        mainCalendar.newEventButton.click();
        mainCalendar.newTareaButton.click();
        mainCalendar.taskTitleTextBox.setText(title);
        mainCalendar.descTitleTextBox.setText("Esta es la descripcion");
        mainCalendar.saveEventButton.click();
        mainCalendar.acceptResponsabilityButton.click();

        Assertions.assertEquals(title, mainCalendar.taskTitleLabel.getText(),
                "ERROR la suma es incorrecta");

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }

}
