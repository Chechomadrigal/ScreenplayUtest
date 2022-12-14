package co.com.chechosychechos.ti.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {
    public static final Target LST_YOUR_COMPUTER_OS=Target.the("The list OS").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target LST_OS_VERSION=Target.the("The computer OS version").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target LST_OS_LANGUAJE=Target.the("The computer OS languaje").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target BTN_NEXT_FINAL_STEP=Target.the("The button next final step").located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));
    //public static final Target BTN_NEXT_FINAL_STEP=Target.the("The button next final step").located(By.className("btn btn-blue pull-right"));
}
