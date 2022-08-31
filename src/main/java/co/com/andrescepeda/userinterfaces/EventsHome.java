package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EventsHome {

    public static final Target BTN_EVENTS = Target.the("Botón opción eventos").located(By.xpath("//a[contains(text(),'EVENTOS')]"));
    public static final Target BTN_NEXTEVENTS = Target.the("Botón opción próximos eventos").located(By.xpath("//div/a[contains(text(),'PRÓXIMOS eventos')]"));
    public static final Target TXT_VERIFYDATE = Target.the("campo de texto verificación fecha de eventos").located(By.xpath("//span[@class = 'sqs-tourdates__date']"));
    public static final Target TXT_VERIFYNAMEEVENT = Target.the("campo de texto verificación nombre de evento").located(By.xpath("//div[@class = 'sqs-tourdates__venue-name']"));
    public static final Target TXT_VERIFYLOCATIONEVENT = Target.the("campo de texto verificación nombre de evento").located(By.xpath("//div[2]/a[@href = 'https://bandsintown.com/e/103527517']"));
}
