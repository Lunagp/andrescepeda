package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.NoticiasHome.NEWS;
import static co.com.andrescepeda.userinterfaces.NoticiasHome.NEWS_ANSWER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Noticias implements Task {

    public static Noticias noticiasAndres(){
        return instrumented(Noticias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NEWS));
        System.out.println(Text.of(NEWS_ANSWER).viewedBy(actor).asString());
    }
}
