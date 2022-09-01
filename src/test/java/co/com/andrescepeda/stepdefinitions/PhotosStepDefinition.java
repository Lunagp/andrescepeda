package co.com.andrescepeda.stepdefinitions;


import co.com.andrescepeda.tasks.InformationPhotos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PhotosStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Andres");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^that enter the page \"([^\"]*)\" a$")
    public void that_enter_the_page_a(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the option Photos and select the one publication$")
    public void select_the_option_Photos_and_select_the_one_publication() {
      theActorInTheSpotlight().attemptsTo(InformationPhotos.inThePage());
    }

    @Then("^you should see on the console the photos information provided by the website$")
    public void you_should_see_on_the_console_the_photos_information_provided_by_the_website() {

    }
}
