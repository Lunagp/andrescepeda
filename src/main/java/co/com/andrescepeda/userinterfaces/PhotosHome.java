package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhotosHome {


    public static final Target BTN_PHOTOS = Target.the("Botón opción fotos").located(By.xpath("//header/div/div/div/nav/div/a[contains(text(),'FOTOS')]"));
    public static final Target PHOTO = Target.the("Imagen de Andrés Cepeda").located(By.xpath("//div[2]/div/a"));
    public static final Target TXT_NAMEUSERPHOTO = Target.the("Texto de verificación nombre del cantante").located(By.xpath("html/body/div/div/div/div/div[2]/div/div/div/div/div[3]/div/div/div/div/div[2]/div/article/div/div[2]/div/div/div/div/header/div[2]/div/div/div/div/div/span/a"));
}
