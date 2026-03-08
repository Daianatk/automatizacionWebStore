package com.nttdata.pages;

import com.nttdata.core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercadoLibrePage {
    // Selectores centralizados
    public static final By inputBusqueda = By.name("as_word");
    public static final By botonBuscar = By.cssSelector(".nav-search-btn");
    public static final By resultadosBusqueda = By.cssSelector(".ui-search-result__wrapper");
    public static final By titulos = By.cssSelector(".ui-search-item__title");
    public static final By primerTitulo = By.cssSelector(".poly-component__title-wrapper");
}
