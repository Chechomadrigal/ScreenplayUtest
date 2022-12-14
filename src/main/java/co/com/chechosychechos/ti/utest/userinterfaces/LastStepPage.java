package co.com.chechosychechos.ti.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {
    public static final Target TXT_PASSWORD = Target.the("The input text password").located(By.id("password"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("The input text confirm password").located(By.id("confirmPassword"));
    public static final Target CHK_TERMS = Target.the("The checkbox terms and conditions").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHK_POLICY = Target.the("The checkbox terms and conditions").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));;
    public static final Target BTN_CONFIRM = Target.the("the button confirm").located(By.id("laddaBtn"));

}
