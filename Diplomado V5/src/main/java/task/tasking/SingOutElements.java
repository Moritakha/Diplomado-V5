package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.SingIng;
import ui.SingOut;

public class SingOutElements {
    public static void as(WebDriver webDriver, String email, String password){
        Click.on(webDriver, SingOut.ingresar);
        Enter.text(webDriver,SingOut.email, email);
        Enter.text(webDriver,SingOut.password, password);
        Click.on(webDriver, SingOut.buttonlog);
    }
}
