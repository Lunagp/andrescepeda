package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.NoticiasHome.NEWS_ANSWER;
public class NoticiasQ implements Question<String> {

    public static NoticiasQ answer(){
        return new NoticiasQ();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(NEWS_ANSWER).viewedBy(actor).asString() ;
    }
}
