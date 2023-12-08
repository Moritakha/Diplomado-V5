package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.Todoly;

public class Todolyelements {
    public static void as(WebDriver webDriver, String user,String email, String password){
        Click.on(webDriver, Todoly.newuser);
        Enter.text(webDriver,Todoly.fullname, user);
        Enter.text(webDriver,Todoly.email, email);
        Enter.text(webDriver,Todoly.password, password);
        Click.on(webDriver, Todoly.checkbox);
    }
}
