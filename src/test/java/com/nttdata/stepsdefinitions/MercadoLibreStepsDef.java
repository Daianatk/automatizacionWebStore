package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MercadoLibreSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.nttdata.core.DriverManager.*;

public class MercadoLibreStepsDef {

    private WebDriver driver;

    private MercadoLibreSteps mercadoLibreSteps(WebDriver driver){
        return new MercadoLibreSteps(driver);
    }

    @Dado("Ingreso a la página de MercadoLibre")
    public void abrirPaginaMercadoLibre() {
        driver = getDriver();
        driver.get("https://www.mercadolibre.com.pe/");
        screenShot();
    }

    @Cuando("Busco un producto {string}")
    public void buscarProducto(String producto) {
        MercadoLibreSteps steps = new MercadoLibreSteps(driver);
        steps.ingresarBusqueda(producto);
        screenShot();
    }

    @Entonces("Visualiza una lista de resultados")
    public void validarListaResultados() {
        boolean verResultados = mercadoLibreSteps(driver).verResultados();
        Assertions.assertTrue(verResultados, "No se encontraron resultados en la búsqueda");
        screenShot();
    }

    @Y("Valido que exista al menos un producto con titulo")
    public void validarProductoConTitulo() {
        boolean existeTitulo = mercadoLibreSteps(driver).existeProductoConTitulo();
        Assertions.assertTrue(existeTitulo, "No se encontró ningún producto con título en los resultados");
        screenShot();
    }

    @Y("Valido que el primer titulo del resultado sea {string}")
    public void validarPrimerTitulo(String tituloEsperado) {
        String primerTitulo = mercadoLibreSteps(driver).primerTitulo();
        Assertions.assertEquals(tituloEsperado, primerTitulo, "El título del primer resultado no coincide");
        screenShot();
    }

}
