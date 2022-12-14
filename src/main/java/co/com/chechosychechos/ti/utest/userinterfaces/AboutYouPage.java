package co.com.chechosychechos.ti.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYouPage {
    public static final Target TXT_FIRST_NAME=Target.the("The input Text First Name").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME=Target.the("The input Text Last Name").located(By.id("lastName"));
    public static final Target TXT_EMAIL=Target.the("The input Text E-mail").located(By.id("email"));
    public static final Target LST_MONTH_BIRTH=Target.the("The list Month Birth").located(By.id("birthMonth"));
    public static final Target LST_BIRTH_DAY=Target.the("The list birthday").located(By.id("birthDay"));
    public static final Target LST_YEAR_BIRTH=Target.the("The list year birth").located(By.id("birthYear"));
    public static final Target BTN_NEXT_LOCATION=Target.the("Button next location").located(By.xpath("//a[@class='btn btn-blue']"));
    //public static final Target BTN_NEXT_LOCATION=Target.the("Button next location").located(By.className("btn btn-blue"));
}