package estructura.activitiesCalendar;

import estructura.control.Button;
import estructura.control.Label;
import estructura.control.TextBox;
import org.openqa.selenium.By;

public class MainCalendar {
    public Button acceptButton = new Button(By.id("com.simplemobiletools.calendar:id/dialog_trial_start_free_trial"));
    public Button changeViewButton = new Button(By.id("com.simplemobiletools.calendar:id/change_view"));
    public Button dayViewButton = new Button(By.xpath("//android.widget.RadioButton[@text=\"Vista diaria\"]"));
    public Button nextDayButton = new Button(By.id("com.simplemobiletools.calendar:id/top_right_arrow"));
    public Button newEventButton = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));
    public Button newTareaButton = new Button(By.id("com.simplemobiletools.calendar:id/fab_task_icon"));
    public TextBox taskTitleTextBox = new TextBox(By.id("com.simplemobiletools.calendar:id/task_title"));
    public TextBox descTitleTextBox = new TextBox(By.id("com.simplemobiletools.calendar:id/task_description"));
    public Button saveEventButton = new Button(By.id("com.simplemobiletools.calendar:id/save"));
    public Button acceptResponsabilityButton = new Button(By.id("android:id/button1"));
    public Label taskTitleLabel = new Label(By.id("com.simplemobiletools.calendar:id/event_item_title"));


    //com.simplemobiletools.calendar:id/task_title
}
