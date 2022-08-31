package co.com.andrescepeda.questions;

import co.com.andrescepeda.userinterfaces.EventsHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyInfoEvents implements Question {

    public static VerifyInfoEvents inThePage(){
        return new VerifyInfoEvents();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(EventsHome.TXT_VERIFYDATE).viewedBy(actor).asString();
    }
}
