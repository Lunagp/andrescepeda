package co.com.andrescepeda.tasks;

import co.com.andrescepeda.userinterfaces.EventsHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class ObtainInformationEvents implements Task {

    public static ObtainInformationEvents inThePage(){
        return Tasks.instrumented(ObtainInformationEvents.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EventsHome.BTN_EVENTS));
        actor.attemptsTo(Scroll.to(EventsHome.BTN_NEXTEVENTS));
        actor.attemptsTo(Click.on(EventsHome.BTN_NEXTEVENTS));
        actor.attemptsTo(Scroll.to(EventsHome.TXT_VERIFYDATE));
        actor.attemptsTo(Scroll.to(EventsHome.TXT_VERIFYLOCATIONEVENT));
    }
}
