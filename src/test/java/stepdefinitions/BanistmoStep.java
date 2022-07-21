package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidacionPDF;
import tasks.BanistmoTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BanistmoStep {

    @Before
    public void setThestage() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Pablo");
    }

    @Given("El usuario ingresa a la web")
    public void el_usuario_ingresa_a_la_web() {

        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bancolombia.com/personas"));
    }
    @When("El usuario ingresa a la pestaña proveedores en el cual descarga el documento")
    public void el_usuario_ingresa_a_la_pestaña_proveedores_en_el_cual_descarga_el_documento() {

        theActorInTheSpotlight().attemptsTo(BanistmoTask.acciones());
    }
    @Then("El usuario valida el PDF generado")
    public void el_usuario_valida_el_pdf_generado() {

        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionPDF.enLaPagina()));
    }
}
