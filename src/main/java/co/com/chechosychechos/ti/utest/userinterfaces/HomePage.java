package co.com.chechosychechos.ti.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_JOIN_TODAY = Target.the("Button Join Today").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
