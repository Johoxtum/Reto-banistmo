package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Map extends PageObject {


    public static final Target URL = Target.the("Me permite ingresar a la pagina destino")
            .located(By.xpath("//*[contains(text(), \"www.bancolombia.com\")]"));

    public static final Target ACERCA = Target.the("Me permite ingresar a la pestaña acerca de nosotros")
            .located(By.id("header-nosotros"));

    public static final Target INFORMACION = Target.the("Me permite ingresar a informacion corporativa")
            .located(By.id("serv"));

    public static final Target PROVEEDORES = Target.the("Me permite ingresar a la pestaña proveedores")
            .located(By.xpath("//*[contains(text(), \"Proveedores\") and @href]"));

    public static final Target DESCARGA = Target.the("Me permite descargar politicas")
            .located(By.xpath("//*[@id=\"wizard2\"]/div/div[3]/div/div[1]/div/p[2]/a"));

    public static final Target VALIDACION = Target.the("Me permite validar el pdf generado")
            .located(By.cssSelector("#viewer"));



}
