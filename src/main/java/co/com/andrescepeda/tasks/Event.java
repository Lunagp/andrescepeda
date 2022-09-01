package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.EventHome.EVENT;
import static co.com.andrescepeda.userinterfaces.EventHome.EVENT_ANSWER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Event implements Task {

    public static Event eventosAndres(){
        return instrumented(Event.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(EVENT));
        actor.attemptsTo(Click.on(EVENT));
        System.out.println(Text.of(EVENT_ANSWER).viewedBy(actor).asString());
    }
}
