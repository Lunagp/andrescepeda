package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.BioHome.BIO;
import static co.com.andrescepeda.userinterfaces.BioHome.BIO_ANSWER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Bio implements Task {

    public static Bio bioAndres(){
        return instrumented(Bio.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BIO));
        System.out.println(Text.of(BIO_ANSWER).viewedBy(actor).asString());
    }
}
