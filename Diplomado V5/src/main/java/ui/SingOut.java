package ui;

import org.openqa.selenium.By;

public class SingOut {
    public static By ingresar = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img");

    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]");

    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]");

    public static By buttonlog = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]");

    public static By singout = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");

}
