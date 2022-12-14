package co.com.chechosychechos.ti.utest.tasks;


import co.com.chechosychechos.ti.utest.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static co.com.chechosychechos.ti.utest.userinterfaces.AboutYouPage.*;
import static co.com.chechosychechos.ti.utest.userinterfaces.DevicePage.*;
import static co.com.chechosychechos.ti.utest.userinterfaces.HomePage.*;
import static co.com.chechosychechos.ti.utest.userinterfaces.LastStepPage.*;
import static co.com.chechosychechos.ti.utest.userinterfaces.LocationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUsers implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Waiting.theSeconds(BTN_JOIN_TODAY,10),
                Click.on(BTN_JOIN_TODAY),
                Waiting.theSeconds(TXT_FIRST_NAME,10),
                Enter.theValue("Sergio Andres").into(TXT_FIRST_NAME),
                Enter.theValue("Madrigal").into(TXT_LAST_NAME),
                Enter.theValue("madrigalsergio@hotmail.com").into(TXT_EMAIL),
                SelectFromOptions.byVisibleText("August").from(LST_MONTH_BIRTH),
                SelectFromOptions.byVisibleText("20").from(LST_BIRTH_DAY),
                SelectFromOptions.byVisibleText("1985").from(LST_YEAR_BIRTH),
                Click.on(BTN_NEXT_LOCATION),
                Waiting.theSeconds(TXT_ADDRESS_CITY,10),
                Enter.theValue("Girardota").into(TXT_ADDRESS_CITY),
                Enter.theValue("051030").into(TXT_ADDRESS_ZIP_CODE),
                Click.on(LST_COUNTRY),
                Click.on(LST_ADDRESS_COUNTRY),
                Click.on(BTN_NEXT_DEVICE),
                Waiting.theSeconds(BTN_NEXT_FINAL_STEP,10),
               // Click.on(LST_YOUR_COMPUTER_OS),
                //SelectFromOptions.byVisibleText("Windows").from(LST_YOUR_COMPUTER_OS),
                //SelectFromOptions.byVisibleText("10").from(LST_OS_VERSION),
                //SelectFromOptions.byVisibleText("Spanish").from(LST_OS_LANGUAJE),
                Click.on(BTN_NEXT_FINAL_STEP),
                Waiting.theSeconds(TXT_PASSWORD,10),
                Enter.theValue("Samv12345*").into(TXT_PASSWORD),
                Enter.theValue("Samv12345*").into(TXT_CONFIRM_PASSWORD),
                Click.on(CHK_TERMS),
                Waiting.theSeconds(CHK_POLICY,10),
                //Click.on(CHK_POLICY),
                Click.on(BTN_CONFIRM)

        );
    }
    public static CreateUsers createUsers(){

        return instrumented(CreateUsers.class);
    }
}
