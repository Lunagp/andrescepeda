package co.com.andrescepeda.tasks;

import co.com.andrescepeda.userinterfaces.BioHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class ObtainInformationBiography implements Task {

    public static ObtainInformationBiography inThePage(){
        return Tasks.instrumented(ObtainInformationBiography.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BioHome.BTN_BIO));
        actor.attemptsTo(Scroll.to(BioHome.TXT_ABOUT));
    }
}
