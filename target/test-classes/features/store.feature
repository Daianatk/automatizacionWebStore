#language: es
Característica: Store QALab
@store
  Escenario: Realizar el login - Store
    Dado estoy en la página de la tienda
    Cuando doy click en la opción iniciar sesión
    Y doy click en el link text cree una cuenta aquí
    Y lleno los campos del formulario para el registro
    Y doy click en el botón guardar
    Entonces debería visualizar el nombre del usuario registrado en la pantalla de Mi Cuenta