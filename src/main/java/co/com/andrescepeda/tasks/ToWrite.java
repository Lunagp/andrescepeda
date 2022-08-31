package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.andrescepeda.userinterfaces.NoticiasHome.NEWS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ToWrite implements Task {

    public static ToWrite noticias(){
        return instrumented(ToWrite.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NEWS));
    }
}
