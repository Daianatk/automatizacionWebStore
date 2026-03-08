package com.nttdata.stepsdefinitions;

import com.nttdata.steps.StoreSteps;
import io.cucumber.java.es.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.*;

public class StoreStepsDef {
    private WebDriver driver;
    private StoreSteps storeSteps;

    @Dado("estoy en la página de la tienda")
    public void abrirPaginaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        storeSteps = new StoreSteps(driver);
        screenShot();
    }

    @Cuando("doy click en la opción iniciar sesión")
    public void clickOpcionLogin() {
        storeSteps.clickLoginOption();
        screenShot();
    }

    @Y("doy click en el link text cree una cuenta aquí")
    public void clickCrearCuenta() {
        storeSteps.clickCrearCuenta();
        screenShot();
    }

    @Y("lleno los campos del formulario para el registro")
    public void llenarFormularioRegistro() {
        storeSteps.llenarFormularioRegistro(
                "Nestor", "Ishuiza", "nestori@test.com", "MRomero@080326", "15/02/1986"
        );
        screenShot();
    }

    @Y("doy click en el botón guardar")
    public void clickGuardar() {
        storeSteps.clickGuardar();
        screenShot();
    }

    @Entonces("debería visualizar el nombre del usuario registrado en la pantalla de Mi Cuenta")
    public void validarUsuarioRegistrado() {
        String usuario = storeSteps.obtenerUsuarioLogeado();
        Assertions.assertEquals("Nestor Ishuiza", usuario, "El usuario mostrado no coincide con el registrado");
        screenShot();
    }
}
