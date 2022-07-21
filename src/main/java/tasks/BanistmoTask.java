package tasks;

import interactions.Cambiodeventana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Map.*;

public class BanistmoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(ACERCA),
                Click.on(INFORMACION),
                Click.on(PROVEEDORES),
                Scroll.to(DESCARGA),
                Click.on(DESCARGA),
                Cambiodeventana.switchToNewTab()

        );

    }

    public static BanistmoTask acciones() {
        return  instrumented(BanistmoTask.class);
    }
}
