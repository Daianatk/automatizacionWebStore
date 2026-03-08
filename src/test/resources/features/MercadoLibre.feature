#language: es
Característica: MercadoLibre
@busquedaProducto
  Escenario: Busqueda de Productos
    Dado Ingreso a la página de MercadoLibre
    Cuando Busco un producto "Televisores Led 40 pulgadas"
    Entonces Visualiza una lista de resultados
    Y Valido que el primer titulo del resultado sea "Smart Tv Samsung 40\" Fhd F6000F 2025 Black UN40F6000FGXPE"

