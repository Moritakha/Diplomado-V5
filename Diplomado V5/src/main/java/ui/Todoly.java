package ui;

import org.openqa.selenium.By;

public class Todoly {

    public static By newuser = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img");

    public static By fullname = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");

    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");
    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");
    public static By checkbox = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");


}
