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
        return PhotosHome.PHOTO.resolveFor(actor).getText().contains("Photo");
    }
}
