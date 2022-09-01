package co.com.andrescepeda.questions;

import co.com.andrescepeda.userinterfaces.PhotosHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.StoreHome.*;

public class VerifyInformationPhoto implements Question<Boolean> {

    public static VerifyInformationPhoto inThePage(){
        return new VerifyInformationPhoto();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_NAMEITEM1.resolveFor(actor).getText().contains("hola")
                && TXT_NAMEITEM2.resolveFor(actor).getText().contains("hola x2 :)");
    }
}
