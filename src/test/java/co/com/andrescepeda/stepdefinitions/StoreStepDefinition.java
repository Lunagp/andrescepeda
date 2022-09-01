package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.VerifyInformationPhoto;
import co.com.andrescepeda.tasks.BuyItems;
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

public class StoreStepDefinition {


    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Andres");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that enter the page \"([^\"]*)\" s$")
    public void that_enter_the_page_s(String url) {
      theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the option Store and buy two items$")
    public void select_the_option_Store_and_buy_two_items() {
        theActorInTheSpotlight().attemptsTo(BuyItems.inThePage());
    }

    @Then("^you should see on the console the items information provided by the website$")
    public void you_should_see_on_the_console_the_items_information_provided_by_the_website() {
            theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInformationPhoto.inThePage(),
                    Matchers.equalTo(Boolean.FALSE)));
    }
}
