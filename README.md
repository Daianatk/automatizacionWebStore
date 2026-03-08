# StoreQALab - Automatización de Registro y Login

Este proyecto implementa pruebas automatizadas para validar las funcionalidades críticas de **Registro de un Nuevo Usuario** y **Login (inicio de sesión)** en la tienda en línea [QALab Store](https://qalab.bensg.com/store/pe/).

## 🚀 Objetivo
Confirmar la disponibilidad y correcto funcionamiento del servicio de autenticación de la tienda, asegurando que:
1. Se pueda **registrar un nuevo usuario** con datos válidos.
2. Se pueda **iniciar sesión exitosamente** con el usuario recién registrado.
3. Se valide que el nombre del usuario aparezca en la pantalla de **Mi Cuenta**.

---

## 🛠️ Tecnologías utilizadas
- **Java 11+**
- **Maven**
- **JUnit 5**
- **Selenium WebDriver**
- **Cucumber (BDD)**
- **GitLab** para control de versiones y CI/CD

---

## 📝 Escenarios principales

### Registro y Login exitoso
```gherkin
#language: es
Feature: Store

  @store
  Escenario: Registro y login exitoso
    Dado estoy en la página de la tienda
    Cuando doy click en la opción iniciar sesión
    Y doy click en el link text cree una cuenta aquí
    Y lleno los campos del formulario para el registro
    Y doy click en el botón guardar
    Entonces debería visualizar el nombre del usuario registrado en la pantalla de Mi Cuenta