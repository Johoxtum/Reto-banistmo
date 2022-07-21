package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Cambiodeventana implements Interaction {

    public Cambiodeventana (){}


    @Step("{0} Switching to new Window")public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }
    }
    public static Cambiodeventana switchToNewTab(){
        return Instrumented.instanceOf(Cambiodeventana.class).withProperties();
    }
}
