package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.ShadowRoot;


import static userinterfaces.Constantes.PDF;
import static userinterfaces.Map.*;


public class ValidacionPDF implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        boolean mensaje = VALIDACION.resolveFor(actor).isVisible();
        return mensaje;

    }

    public static ValidacionPDF enLaPagina() {
        return new ValidacionPDF();
    }
}
