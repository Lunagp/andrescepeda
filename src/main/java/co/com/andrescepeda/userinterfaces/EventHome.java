package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EventHome {

    public static final Target EVENT = Target.the("boton de proximos eventos").located(By.xpath("//*[contains(text(),'PRÓXIMOS eventos')]"));
    public static final Target EVENT_ANSWER = Target.the("información de bio").located(By.xpath("html/body/div/div[2]/main/div/div/div/div/div[2]/div[2]/div/div[1]/div/div"));

}
