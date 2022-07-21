Feature: Validar el correcto funcionamiento de la descarga ” del apartado “Políticas
  de tratamiento y de protección de datos personales de proveedores”:

  @banistmo
  Scenario: Ingresar a la pagina web y la correcta descarga de las politicas de los proveedores
    Given El usuario ingresa a la web
    When  El usuario ingresa a la pestaña proveedores en el cual descarga el documento
    Then  El usuario valida el PDF generado