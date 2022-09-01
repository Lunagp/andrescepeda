package co.com.andrescepeda.tasks;

import co.com.andrescepeda.userinterfaces.PhotosHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class InformationPhotos implements Task {

    WebDriver hisBrowser;
    public String urlimg;
    public static InformationPhotos inThePage(){
        return Tasks.instrumented(InformationPhotos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PhotosHome.BTN_PHOTOS));
        actor.attemptsTo(Scroll.to(PhotosHome.PHOTO));

    }
}
