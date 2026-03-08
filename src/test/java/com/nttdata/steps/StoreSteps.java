package com.nttdata.steps;

import com.nttdata.page.StorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class StoreSteps {
    private WebDriver driver;

    public StoreSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginOption() {
        driver.findElement(StorePage.loginOption).click();
    }

    public void clickCrearCuenta() {
        driver.findElement(StorePage.crearCuentaLink).click();
    }

    public void llenarFormularioRegistro(String nombre, String apellidos, String email, String password, String fechaNacimiento) {
        driver.findElement(StorePage.inputNombre).sendKeys(nombre);
        driver.findElement(StorePage.inputApellidos).sendKeys(apellidos);
        driver.findElement(StorePage.inputEmailRegistro).sendKeys(email);
        driver.findElement(StorePage.inputPasswordRegistro).sendKeys(password);
        driver.findElement(StorePage.inputFechaNacimiento).sendKeys(fechaNacimiento);

        // Marcar los cuatro checkboxes
        driver.findElement(StorePage.checkOfertas).click();
        driver.findElement(StorePage.checkTerminos).click();
        driver.findElement(StorePage.checkSuscribir).click();
        driver.findElement(StorePage.checkPrivacidad).click();
    }

    public void clickGuardar() {
        driver.findElement(StorePage.botonGuardar).click();
    }

    public String obtenerUsuarioLogeado() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(StorePage.usuarioLogeado)
        ).getText();
    }
}
