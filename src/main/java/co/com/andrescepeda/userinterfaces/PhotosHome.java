package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhotosHome {


    public static final Target BTN_PHOTOS = Target.the("Botón opción fotos").located(By.xpath("//header/div/div/div/nav/div/a[contains(text(),'FOTOS')]"));
    public static final Target TXT_ABOUT = Target.the("Texto verificación sobre andres cepeda").located(By.xpath("//*[contains(text(),'Sobre Andrés Cepeda')]"));
}
