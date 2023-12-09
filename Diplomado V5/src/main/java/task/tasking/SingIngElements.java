package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.SingIng;
import ui.Todoly;

public class SingIngElements {
    public static void as(WebDriver webDriver, String email, String password){
        Click.on(webDriver, SingIng.ingresar);
        Enter.text(webDriver,SingIng.email, email);
        Enter.text(webDriver,SingIng.password, password);
        Click.on(webDriver, SingIng.buttonlog);
    }
}
