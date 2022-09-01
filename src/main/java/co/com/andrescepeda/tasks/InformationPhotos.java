package co.com.andrescepeda.tasks;

import co.com.andrescepeda.userinterfaces.PhotosHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InformationPhotos implements Task {

    public static InformationPhotos inThePage(){
        return Tasks.instrumented(InformationPhotos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PhotosHome.BTN_PHOTOS));
    }
}
