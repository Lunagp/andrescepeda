package co.com.andrescepeda.tasks;

import co.com.andrescepeda.userinterfaces.StoreHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

public class BuyItems implements Task {

    WebDriver hisBrowser;

    public static BuyItems inThePage(){
        return Tasks.instrumented(BuyItems.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StoreHome.BTN_STORE));
        actor.attemptsTo(Scroll.to(StoreHome.BTN_ITEM1));
        actor.attemptsTo(Click.on(StoreHome.BTN_ITEM1));
        actor.attemptsTo(Scroll.to(StoreHome.TXT_PRICE));
        actor.attemptsTo(Click.on(StoreHome.BTN_ADD));
        actor.attemptsTo(Click.on(StoreHome.BTN_BUYTOO));
        actor.attemptsTo(Scroll.to(StoreHome.BTN_ITEM2));
        actor.attemptsTo(Click.on(StoreHome.BTN_ITEM2));
        actor.attemptsTo(Scroll.to(StoreHome.TXT_PRICE));
        actor.attemptsTo(Click.on(StoreHome.BTN_ADD));
        actor.attemptsTo(Scroll.to(StoreHome.BTN_BUYFINISH));
        actor.attemptsTo(Click.on(StoreHome.BTN_BUYFINISH));

    }
}
