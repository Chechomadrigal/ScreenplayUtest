package co.com.chechosychechos.ti.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target TXT_ADDRESS_CITY=Target.the("The address city").located(By.id("city"));
    public static final Target TXT_ADDRESS_ZIP_CODE=Target.the("The address zip code").located(By.id("zip"));
    public static final Target LST_COUNTRY=Target.the("the list Country").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]"));
    public static final  Target LST_ADDRESS_COUNTRY=Target.the("The address country").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target BTN_NEXT_DEVICE=Target.the("the button next Devices").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
   // public static final Target BTN_NEXT_DEVICE=Target.the("the button next Devices").located(By.className("btn btn-blue pull-right"));
}
