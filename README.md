``` markdown
# Sistema de Catálogo de Tours

## Descripción

Este proyecto corresponde a una aplicación desarrollada en **Java** orientada a la gestión y visualización de distintos tipos de tours turísticos. El sistema permite representar servicios como excursiones, paseos lacustres y rutas gastronómicas, aplicando principios fundamentales de la Programación Orientada a Objetos como **herencia**, **polimorfismo**, encapsulamiento y reutilización de código.

El objetivo principal del proyecto es organizar diferentes servicios turísticos bajo una estructura común, permitiendo que cada tipo de tour mantenga sus propias características particulares sin perder una base compartida.

## Estructura general del proyecto

El proyecto se organiza en paquetes principales:

- `app`: contiene la clase principal encargada de iniciar la aplicación.
- `data`: contiene clases relacionadas con la gestión de datos y servicios.
- `model`: contiene las clases que representan las entidades principales del sistema.

## Clases principales

### `Tour`

La clase `Tour` representa la clase base del sistema. Define los atributos generales que comparten todos los servicios turísticos, tales como:

- Identificador del tour.
- Región.
- Tipo de tour.
- Duración.
- Valor.

Esta clase funciona como una plantilla común para los distintos tipos de servicios turísticos.

### `Excursion`

La clase `Excursion` hereda de `Tour` y representa un tour terrestre o turístico asociado a un lugar específico. Además de los datos generales del tour, incorpora información adicional como:

- Lugar de la excursión.
- Calle o dirección asociada.

### `PaseoLacustre`

La clase `PaseoLacustre` también hereda de `Tour` y representa un servicio turístico relacionado con paseos lacustres. Esta clase agrega información específica sobre el tipo de embarcación o vehículo utilizado.

### `RutaGastronomica`

La clase `RutaGastronomica` hereda de `Tour` y representa un servicio turístico enfocado en experiencias gastronómicas. Permite diferenciar este tipo de servicio del resto mediante atributos propios de su categoría.

### `GestorServicios`

La clase `GestorServicios` cumple un rol fundamental dentro del sistema, ya que se encarga de crear y administrar una colección de distintos tipos de tours.

Dentro de esta clase se instancia una lista de objetos de tipo `Tour`, pero dicha lista puede almacenar objetos de sus clases hijas, como:

- `Excursion`
- `PaseoLacustre`
- `RutaGastronomica`

Esto permite centralizar la creación y visualización de los servicios turísticos disponibles. Además, `GestorServicios` demuestra el uso práctico del polimorfismo, ya que recorre una colección de tours y ejecuta el método `MostrarDatos()` sin importar el tipo específico de objeto almacenado.

## Aplicación de Programación Orientada a Objetos

### Herencia

El proyecto utiliza herencia para establecer una relación entre una clase general y varias clases especializadas.

La clase `Tour` actúa como clase padre, mientras que `Excursion`, `PaseoLacustre` y `RutaGastronomica` son clases hijas. Esto permite reutilizar atributos y métodos comunes, evitando la duplicación de código.

Ejemplo conceptual:
```

java public class Excursion extends Tour { // Atributos y comportamientos específicos de una excursión }``` 

Gracias a la herencia, cada tipo de tour mantiene una estructura común, pero también puede definir sus propios detalles.

### Polimorfismo

El polimorfismo se evidencia cuando una colección de tipo `Tour` almacena objetos de distintas clases hijas. Aunque todos los elementos son tratados como objetos de tipo `Tour`, cada uno ejecuta su propia versión del método `MostrarDatos()`.

Esto permite que el sistema sea más flexible y escalable, ya que se pueden agregar nuevos tipos de tours sin modificar drásticamente la lógica existente.

Ejemplo conceptual:
```

java ArrayListtours = new ArrayList<>();
tours.add(new Excursion(...)); tours.add(new PaseoLacustre(...)); tours.add(new RutaGastronomica(...));
for (Tour tour : tours) { tour.MostrarDatos(); }``` 

En este caso, Java determina en tiempo de ejecución qué versión del método debe ejecutarse según el tipo real del objeto.

## Funcionalidades principales

- Creación de distintos tipos de tours.
- Visualización de información general y específica de cada servicio.
- Uso de una lista común para almacenar servicios turísticos variados.
- Aplicación de herencia entre clases del modelo.
- Aplicación de polimorfismo mediante sobrescritura de métodos.
- Organización del código en paquetes según responsabilidad.

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos
- Maven
- IntelliJ IDEA u otro entorno compatible con Java

## Cómo ejecutar el proyecto

1. Clonar o descargar el proyecto.
2. Abrirlo en un entorno de desarrollo compatible con Java.
3. Verificar que el proyecto esté configurado con Maven.
4. Ejecutar la clase principal ubicada en el paquete `app`.
5. El sistema mostrará en consola los tours creados por `GestorServicios`.

## Ejemplo de funcionamiento

Al iniciar la aplicación, se crea una instancia de `GestorServicios`, la cual genera una lista de servicios turísticos y muestra sus datos en consola.

Cada tour imprime primero la información común definida en la clase `Tour` y luego muestra los datos específicos de su clase correspondiente.

## Objetivo académico

Este proyecto tiene como finalidad demostrar el uso de conceptos esenciales de la Programación Orientada a Objetos en Java, especialmente:

- Creación de clases y objetos.
- Uso de constructores.
- Herencia entre clases.
- Sobrescritura de métodos.
- Polimorfismo.
- Manejo de colecciones con `ArrayList`.

## Conclusión

El sistema de catálogo de tours representa una solución simple pero clara para modelar servicios turísticos mediante Programación Orientada a Objetos. La clase `GestorServicios` permite reunir diferentes tipos de tours en una misma estructura, demostrando cómo la herencia y el polimorfismo facilitan la organización, extensión y mantenimiento del código.
```
