package co.com.chechosychechos.ti.utest.stepdefinitions;

import co.com.chechosychechos.ti.utest.tasks.CreateUsers;
import co.com.chechosychechos.ti.utest.utils.MyDriversWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.chechosychechos.ti.utest.utils.Constants.ACTOR;
import static co.com.chechosychechos.ti.utest.utils.Constants.URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUsersSteps {
    @Given("I want go to the page of utest")
    public void iWantGoToThePageOfUtest() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.chrome().inThePage(URL)));
    }
    @When("I enter the information to create the user in utest")
    public void iEnterTheInformationToCreateTheUserInUtest() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers());
    }
    @Then("I validate the correct user creation in utest")
    public void iValidateTheCorrectUserCreationInUtest() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
