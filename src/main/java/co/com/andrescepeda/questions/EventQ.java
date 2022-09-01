package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.EventHome.EVENT_ANSWER;

public class EventQ implements Question<Boolean> {

    public static EventQ eventoAndres(){
        return new EventQ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return EVENT_ANSWER.resolveFor(actor).getText().contains("hola");
    }
}
