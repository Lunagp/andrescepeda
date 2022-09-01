package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BioHome {

    public static final Target BIO = Target.the("boton de bio").located(By.xpath("html/body/div/header/div/div/div/nav/div[3]"));
    public static final Target BIO_ANSWER = Target.the("información de bio").located(By.xpath("html/body/div/div[3]/main/div/div[3]/div/div/div/div/div/div/div[2]/div[2]/div/div/p[1]"));

}
