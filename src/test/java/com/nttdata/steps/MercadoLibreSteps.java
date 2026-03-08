package com.nttdata.steps;

import com.nttdata.pages.MercadoLibrePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MercadoLibreSteps {

    private WebDriver driver;

    public MercadoLibreSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarBusqueda(String producto) {
        driver.findElement(MercadoLibrePage.inputBusqueda).sendKeys(producto);
        driver.findElement(MercadoLibrePage.botonBuscar).click();
    }

    public boolean verResultados() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> resultados = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(MercadoLibrePage.resultadosBusqueda)
        );
        return !resultados.isEmpty();
    }

    public boolean existeProductoConTitulo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> titulos = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(MercadoLibrePage.titulos)
        );

        if (!titulos.isEmpty()) {
            System.out.println("Primer título encontrado: " + titulos.get(0).getText());
        }
        return !titulos.isEmpty();
    }

    public String primerTitulo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement primerResultado = wait.until(
                ExpectedConditions.presenceOfElementLocated(MercadoLibrePage.primerTitulo)
        );
        return primerResultado.getText();
    }
}