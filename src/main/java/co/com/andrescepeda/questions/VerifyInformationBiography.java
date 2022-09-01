package co.com.andrescepeda.questions;

import co.com.andrescepeda.userinterfaces.BioHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyInformationBiography implements Question {

    public static VerifyInformationBiography inThePage(){
        return new VerifyInformationBiography();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(BioHome.TXT_ABOUT).viewedBy(actor).asString();
    }
}
