package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.VerifyInfoEvents;
import co.com.andrescepeda.tasks.ObtainInformationEvents;
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

import java.util.regex.Matcher;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AndresCepedaStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Andres");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^that enter the page \"([^\"]*)\"$")
    public void that_enter_the_page(String url) {
            theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the option Eventos and select the one publication$")
    public void select_the_option_Eventos_and_select_the_one_publication() {
        theActorInTheSpotlight().attemptsTo(ObtainInformationEvents.inThePage());
    }

    @Then("^you should see on the console  the information provided by the web page$")
    public void you_should_see_on_the_console_the_information_provided_by_the_web_page() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInfoEvents.inThePage(),
                Matchers.equalTo("2022")));
    }
}
