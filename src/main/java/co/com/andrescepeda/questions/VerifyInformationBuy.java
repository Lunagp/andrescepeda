package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.StoreHome.TXT_NAMEITEM1;
import static co.com.andrescepeda.userinterfaces.StoreHome.TXT_NAMEITEM2;

public class VerifyInformationBuy implements Question<Boolean> {

    public static VerifyInformationBuy inThePage(){
        return new VerifyInformationBuy();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_NAMEITEM1.resolveFor(actor).getText().contains("hola")
                && TXT_NAMEITEM2.resolveFor(actor).getText().contains("hola x2 :)");
    }
}
