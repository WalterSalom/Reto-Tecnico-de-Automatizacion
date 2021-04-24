package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.model.UtestData;
import co.com.choucair.certification.reto.questions.Answer;
import co.com.choucair.certification.reto.tasks.FillOut;
import co.com.choucair.certification.reto.tasks.JoinToday;
import co.com.choucair.certification.reto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast()); }

    @Given("^than walter wants to be part of the utest community$")
    public void thanWalterWantsToBePartOfTheUtestCommunity(){

        OnStage.theActorCalled("Walter").wasAbleTo(
                OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^he fills out the registration form$")
    public void heFillsOutTheRegistrationForm
            (List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(FillOut.the(
                utestData.get(0).getStrName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmail(),
                utestData.get(0).getStrMonth(),
                utestData.get(0).getStrDay(),
                utestData.get(0).getStrYear(),
                utestData.get(0).getStrLanguage(),

                utestData.get(0).getStrCity(),
                utestData.get(0).getStrZip(),
                utestData.get(0).getStrCountry(),

                utestData.get(0).getStrComputer(),
                utestData.get(0).getStrVersion(),
                utestData.get(0).getStrComputerLanguage(),
                utestData.get(0).getStrMobile(),
                utestData.get(0).getStrModel(),
                utestData.get(0).getStrSystem(),

                utestData.get(0).getStrPassword(),
                utestData.get(0).getStrPasswordConfirm()));
    }

    @Then("^he completes the registration process$")
    public void heCompletesTheRegistrationProcess
            (List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(
                utestData.get(0).getStrWelcome())));
    }
}
