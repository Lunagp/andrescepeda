package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.VerifyInformationBiography;
import co.com.andrescepeda.tasks.ObtainInformationBiography;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BioStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Andres");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^that enter the page \"([^\"]*)\" and$")
    public void that_enter_the_page_and(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the option Bio and select the one publication$")
    public void select_the_option_Bio_and_select_the_one_publication() throws InterruptedException {
        Thread.sleep(3000);
        theActorInTheSpotlight().attemptsTo(ObtainInformationBiography.inThePage());
    }

    @Then("^you should see on the console the biography information provided by the website$")
    public void you_should_see_on_the_console_the_biography_information_provided_by_the_website() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInformationBiography.inThePage(),
                Matchers.equalTo("SOBRE ANDRÉS CEPEDA")));
    }

}
