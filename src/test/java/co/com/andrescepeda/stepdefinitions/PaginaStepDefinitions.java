package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.*;
import co.com.andrescepeda.tasks.*;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PaginaStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void inisialize(){
        setTheStage(new OnlineCast());
        theActorCalled("luna");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Since you enter the website \"([^\"]*)\"$")
    public void since_you_enter_the_website(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the option Photos and select the one publication$")
    public void select_the_option_Photos_and_select_the_one_publication() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(InformationPhotos.inThePage());
        Thread.sleep(3000);

        String url =  hisBrowser.findElement(By.xpath("//div[2]/div/a")).getAttribute("href");
        System.out.println(url);
        hisBrowser.navigate().to(url);
    }
    @Then("^you should see on the console the photos information provided by the website$")
    public void you_should_see_on_the_console_the_photos_information_provided_by_the_website() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInformationPhoto.inThePage(),
                Matchers.equalTo(Boolean.FALSE)));
    }


    @When("^select the option Store and buy two items$")
    public void select_the_option_Store_and_buy_two_items() {
        theActorInTheSpotlight().attemptsTo(BuyItems.inThePage());
    }
    @Then("^you should see on the console the items information provided by the website$")
    public void you_should_see_on_the_console_the_items_information_provided_by_the_website() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInformationBuy.inThePage(),
                Matchers.equalTo(Boolean.FALSE)));
    }

    @When("^you select the News option and select a publication$")
    public void you_select_the_News_option_and_select_a_publication() {
        theActorInTheSpotlight().attemptsTo(Noticias.noticiasAndres());
    }
    @Then("^You will then need to validate that the information provided by the page is displayed in the console and compared to a text\\.$")
    public void you_will_then_need_to_validate_that_the_information_provided_by_the_page_is_displayed_in_the_console_and_compared_to_a_text() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(NoticiasQ.answer(),
                Matchers.equalTo("ENTREVISTA: 'GUITARRA Y VOZ', LA PROPUESTA MÁS ÍNTIMA DE ANDRÉS CEPEDA")));
    }


    @When("^When you select the BIO option$")
    public void when_you_select_the_bio_option() {
        theActorInTheSpotlight().attemptsTo(Bio.bioAndres());
    }
    @Then("^When you select the BIO option bio$")
    public void when_you_select_the_bio_option_bio() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(BioQ.bioAndres(),
                Matchers.equalTo(Boolean.FALSE)));
    }


    @When("^When you select the Events option and the Upcoming Events option$")
    public void when_you_select_the_events_option_and_the_upcoming_events_option() {
        theActorInTheSpotlight().attemptsTo(Event.eventosAndres());
    }
    @Then("^When you select the Events option and the Upcoming Events option event$")
    public void when_you_select_the_events_option_and_the_upcoming_events_option_event() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(EventQ.eventoAndres(),
                Matchers.equalTo(Boolean.FALSE)));
    }


}
