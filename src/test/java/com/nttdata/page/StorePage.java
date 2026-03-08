package com.nttdata.page;

import org.openqa.selenium.By;

public class StorePage {
    public static By loginOption = By.id("_desktop_user_info");
    public static By crearCuentaLink = By.cssSelector(".no-account");

    // Campos del formulario de registro
    public static By inputNombre = By.id("field-firstname");
    public static By inputApellidos = By.id("field-lastname");
    public static By inputEmailRegistro = By.id("field-email");
    public static By inputPasswordRegistro = By.id("field-password");
    public static By inputFechaNacimiento = By.id("field-birthday");

    // Checkboxes
    public static By checkOfertas = By.name("optin");
    public static By checkTerminos = By.name("psgdpr");
    public static By checkSuscribir = By.name("newsletter");
    public static By checkPrivacidad = By.name("customer_privacy");

    // Botón guardar
    public static By botonGuardar = By.cssSelector("button[type='submit']");

    // Validación usuario logeado
    public static By usuarioLogeado = By.cssSelector("a.account span");
}
