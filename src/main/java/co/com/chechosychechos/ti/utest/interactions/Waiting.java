package co.com.chechosychechos.ti.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class Waiting implements Interaction {
    private Target objetPage;
    private int seconds;

    public Waiting(Target objetPage, int seconds) {
        this.objetPage=objetPage;
        this.seconds=seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(objetPage.waitingForNoMoreThan(Duration.ofSeconds(seconds))).isDisplayed());
    }

    public static Waiting theSeconds(Target objetPage, int seconds){
        return Tasks.instrumented(Waiting.class,objetPage,seconds);
    }
}
