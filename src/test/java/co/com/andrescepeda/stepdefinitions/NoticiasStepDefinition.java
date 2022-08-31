package co.com.andrescepeda.stepdefinitions;


import co.com.andrescepeda.tasks.ToWrite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class NoticiasStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void inicial(){
        setTheStage(new OnlineCast());
        theActorCalled("luna");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Since you enter the website \"([^\"]*)\"$")
    public void since_you_enter_the_website(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^you select the News option and select a publication$")
    public void you_select_the_News_option_and_select_a_publication() {
        theActorInTheSpotlight().attemptsTo(ToWrite.noticias());

    }

    @Then("^You will then need to validate that the information provided by the page is displayed in the console and compared to a text\\.$")
    public void you_will_then_need_to_validate_that_the_information_provided_by_the_page_is_displayed_in_the_console_and_compared_to_a_text() {

    }
}
