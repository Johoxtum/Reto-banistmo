package utils;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.*;


public class ShadowRoot {


    private ShadowRoot(){
    }
    private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    public static void newShadowRootClickNivel3(By padre, By hijo, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement shrHijo = shadowRoot1.findElement(hijo);
        SearchContext shadowRoot2 = shrHijo.getShadowRoot();
        WebElement elementoClicleable = shadowRoot2.findElement(elemento);
        elementoClicleable.click();
    }
    public static void shadowRootClickNivel3(By padre, By hijo, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        WebElement shadowDom1 = expandShadowElement(shrPadre);
        WebElement shrHijo = shadowDom1.findElement(hijo);
        WebElement shadowDom2 = expandShadowElement(shrHijo);
        WebElement elementoClicleable = shadowDom2.findElement(elemento);
        elementoClicleable.click();
    }
    public static void newShadowRootClickNivel2(By padre, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement elementoClicleable = shadowRoot1.findElement(elemento);
        elementoClicleable.click();
    }
    public static void shadowRootClickNivel2(By padre, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        WebElement shadowDom1 = expandShadowElement(shrPadre);
        WebElement elementoClicleable = shadowDom1.findElement(elemento);
        elementoClicleable.click();
    }
    public static void newShadowRootTexto(By padre, By hijo, By elemento, String dato){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement shrHijo = shadowRoot1.findElement(hijo);
        SearchContext shadowDom2 = shrHijo.getShadowRoot();
        WebElement entrada = shadowDom2.findElement(elemento);
        entrada.sendKeys(dato);
    }
    public static void newShadowRootTextoNivel2(By padre, By elemento, String dato){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement entrada = shadowRoot1.findElement(elemento);
        entrada.click();
        entrada.sendKeys(dato);
    }
    public static void newShadowRootDropDown(By padre, By hijo, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement options = shadowRoot1.findElement(hijo);
        WebElement elementoClicleable = options.findElement(elemento);
        elementoClicleable.click();
    }
    public static void shadowRootTexto(By padre, By hijo, By elemento, String dato){
        WebElement shrPadre = driver.findElement(padre);
        WebElement shadowDom1 = expandShadowElement(shrPadre);
        WebElement shrHijo = shadowDom1.findElement(hijo);
        WebElement shadowDom2 = expandShadowElement(shrHijo);
        WebElement entrada = shadowDom2.findElement(elemento);
        entrada.sendKeys(dato);
    }
    public static String newShadowRootGetText(By shadow1, By padre, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement elementoTexto = shadowRoot1.findElement(elemento);
        return elementoTexto.getText();
    }

    public static String newShadowRootGetText2(By padre, By hijo, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement shadowRoot2 = shadowRoot1.findElement(hijo);
        WebElement elementotexto = shadowRoot2.findElement(elemento);
        return elementotexto.getText();

    }

    public static void shadowRootClickNivel4(By padre, By hijo,By hijo2, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        WebElement shadowDom1 = expandShadowElement(shrPadre);
        WebElement shrHijo = shadowDom1.findElement(hijo);
        WebElement shadowDom2 = expandShadowElement(shrHijo);
        WebElement shrHijo2 = shadowDom2.findElement(hijo2);
        WebElement shadowDom3 = expandShadowElement(shrHijo2);
        WebElement elementoClicleable = shadowDom3.findElement(elemento);
        elementoClicleable.click();
    }
    public static void newShadowRootTexto2(By padre, By hijo,By hijo2, By elemento, String dato){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement shrHijo = shadowRoot1.findElement(hijo);
        SearchContext shadowDom2 = shrHijo.getShadowRoot();
        WebElement shrhijo2 = shadowDom2.findElement(hijo2);
        SearchContext shadowDom3 = shrhijo2.getShadowRoot();
        WebElement entrada = shadowDom3.findElement(elemento);
        entrada.sendKeys(dato);

    }

    public static String newShadowRootGetText3(By padre,By hijo ,By hijo2, By elemento){
        WebElement shrPadre = driver.findElement(padre);
        SearchContext shadowRoot1 = shrPadre.getShadowRoot();
        WebElement shijo = shadowRoot1.findElement(hijo);
        SearchContext shadowDom2 = shijo.getShadowRoot();
        WebElement shrhijo2 = shadowDom2.findElement(hijo2);
        SearchContext shadowDom3 = shrhijo2.getShadowRoot();
        WebElement elementoTexto = shadowDom3.findElement(elemento);
        return elementoTexto.getText();
    }


    public static WebElement expandShadowElement(WebElement element){
        return (WebElement)((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", element);
    }
}


