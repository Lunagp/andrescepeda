package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StoreHome {

    public static final Target BTN_STORE = Target.the("Botón opción tienda").located(By.xpath("//header/div/div/div/nav/div/a[contains(text(),'TIENDA')]"));
    public static final Target BTN_ITEM1 = Target.the("Botón opción articulo 1").located(By.xpath("//body/div/div/div/article/div/div/div/div[2]/div/div/div[2]/div/ul/li/a"));
    public static final Target BTN_ITEM2 = Target.the("Botón opción articulo 2").located(By.xpath("//body/div/div/div/div/div/div/div[2]/section/ul/li[1]/a"));
    public static final Target BTN_ADD = Target.the("Botón opción añadir al carrito").located(By.xpath("//button[contains(text(),'Añadir al carrito')]"));
    public static final Target BTN_BUYTOO = Target.the("Botón opción seguir comprando").located(By.xpath("//a[contains(text(),'Seguir comprando')]"));

    public static final Target BTN_BUYFINISH = Target.the("Botón opción finalizar compra").located(By.xpath("//a[contains(text(),'Finalizar compra')]"));

    public static final Target TXT_NAMEITEM1 = Target.the("Texto verificación nombre primer articulo").located(By.xpath("//table/tbody/tr/td"));
    public static final Target TXT_NAMEITEM2 = Target.the("Texto verificación nombre segundo articulo").located(By.xpath("//table/tbody/tr[2]/td"));
    public static final Target TXT_PRICEITEM1 = Target.the("Texto verificación precio primer articulo").located(By.xpath("//table/tbody/tr/td[2]/span/bdi"));
    public static final Target TXT_PRICEITEM2 = Target.the("Texto verificación precio segundo articulo").located(By.xpath("//table/tbody/tr[2]/td[2]/span/bdi"));
    public static final Target TXT_TOTALPRICE = Target.the("Texto verificación precio total por articulos").located(By.xpath("//table/tfoot/tr[3]/td/strong/span/bdi"));


    public static final Target TXT_PRICE = Target.the("texto precio").located(By.xpath("//body/div/div/div/div/div/div/div[2]/div/div[2]/p/span/bdi"));

}
