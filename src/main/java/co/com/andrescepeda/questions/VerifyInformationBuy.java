package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.StoreHome.*;

public class VerifyInformationBuy implements Question<Boolean> {

    public static VerifyInformationBuy inThePage(){
        return new VerifyInformationBuy();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_NAMEITEM1.resolveFor(actor).getText().contains("Articulo 1")
                && TXT_PRICEITEM1.resolveFor(actor).getText().contains("Precio articulo 1")
                && TXT_NAMEITEM2.resolveFor(actor).getText().contains("Articulo 2")
                && TXT_PRICEITEM2.resolveFor(actor).getText().contains("Precio articulo 1")
                && TXT_TOTALPRICE.resolveFor(actor).getText().contains("10000");
    }
}
