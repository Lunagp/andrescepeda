package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NoticiasHome {

    public static final Target NEWS = Target.the("boton de noticias").located(By.xpath("html/body/div/header/div/div/div/nav/div[4]"));
    public static final Target NEWS_ANSWER = Target.the("informacion de noticias").located(By.xpath("html/body/div/div[3]/main/div/div[4]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/a"));

}
