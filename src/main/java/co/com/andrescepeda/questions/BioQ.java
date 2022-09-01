package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.BioHome.BIO_ANSWER;

public class BioQ implements Question<Boolean> {

    public static BioQ bioAndres(){
        return new BioQ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BIO_ANSWER.resolveFor(actor).getText().contains("hola");
    }
}
