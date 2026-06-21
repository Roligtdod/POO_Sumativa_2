``` markdown
# POOS5 - Sistema de Catálogo de Tours

Proyecto desarrollado en Java orientado a la gestión básica de trabajadores y tours turísticos.  
La aplicación funciona mediante consola y permite consultar información, agregar trabajadores y filtrar tours según criterios de precio.

## Autor

**Maximiliano Pino**

## Descripción del Proyecto

**POOS5** es una aplicación de consola creada con Java que simula un sistema de catálogo de tours.  
El programa permite administrar información relacionada con trabajadores y tours, entregando un menú interactivo para que el usuario pueda realizar diferentes operaciones.

Este proyecto está enfocado en la práctica de conceptos de Programación Orientada a Objetos, tales como:

- Creación de clases y objetos.
- Encapsulamiento.
- Uso de constructores.
- Manejo de listas.
- Separación de responsabilidades por paquetes.
- Interacción con el usuario mediante consola.
- Lectura y gestión de datos.

## Funcionalidades

El sistema incluye las siguientes opciones principales:

1. **Mostrar trabajadores**  
   Permite visualizar los trabajadores registrados en el sistema.

2. **Agregar un nuevo trabajador**  
   Permite ingresar nuevos trabajadores mediante datos proporcionados por el usuario.

3. **Filtrar tours a menos de $200.000**  
   Muestra los tours cuyo valor se encuentra bajo el precio indicado.

4. **Salir del sistema**  
   Finaliza la ejecución del programa.

## Estructura del Proyecto
```

text POOS5/ │ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── app/ │ │ │ │ └── Main.java │ │ │ ├── data/ │ │ │ └── model/ │ │ └── resources/ │ │ │ └── test/ │ ├── pom.xml ├── Tours.txt └── README.md``` 

## Tecnologías Utilizadas

- **Java**
- **Maven**
- **Programación Orientada a Objetos**
- **Aplicación de consola**

## Requisitos

Para ejecutar este proyecto necesitas tener instalado:

- Java JDK 17 o superior
- Maven
- Un IDE compatible con Java, por ejemplo:
  - IntelliJ IDEA
  - Eclipse
  - NetBeans
  - Visual Studio Code con extensiones de Java

## Instalación y Ejecución

### 1. Clonar o descargar el proyecto

Puedes descargar el proyecto como archivo `.zip` o clonarlo desde un repositorio si se encuentra disponible.
```

bash git clone <URL_DEL_REPOSITORIO>``` 

Luego ingresa a la carpeta del proyecto:
```

bash cd POOS5``` 

### 2. Compilar el proyecto con Maven
```

bash mvn clean compile``` 

### 3. Ejecutar la aplicación
```

bash mvn exec:java``` 

También puedes ejecutar directamente la clase principal desde tu IDE.

La clase principal se encuentra en:
```

text src/main/java/app/Main.java``` 

## Uso del Sistema

Al iniciar la aplicación, se mostrará un menú en consola similar al siguiente:
```

text ------------========Menu principal========------------ Bienvenido al sistema de catalogo de tours
Mostrar trabajadores
Agregar un nuevo trabajador
Tours a menos de $200.000
Salir Seleccione que desea realizar:``` 

El usuario debe ingresar el número correspondiente a la acción que desea realizar.

## Organización por Paquetes

El proyecto se encuentra dividido en paquetes para mantener una estructura ordenada:

### `app`

Contiene la clase principal encargada de iniciar la aplicación y mostrar el menú al usuario.

### `data`

Contiene la lógica relacionada con la carga, almacenamiento o filtrado de datos.

### `model`

Contiene las clases que representan las entidades principales del sistema, como trabajadores y tours.

## Archivo de Datos

El proyecto incluye el archivo:
```

text Tours.txt``` 

Este archivo puede ser utilizado para almacenar o consultar información relacionada con los tours disponibles dentro del sistema.

## Objetivo Académico

Este proyecto fue desarrollado con fines educativos, principalmente para reforzar conocimientos de:

- Java básico e intermedio.
- Modelamiento de clases.
- Manejo de estructuras de datos.
- Buenas prácticas de organización de código.
- Uso de Maven en proyectos Java.
- Desarrollo de aplicaciones por consola.

## Posibles Mejoras Futuras

Algunas mejoras que podrían implementarse en futuras versiones son:

- Validación avanzada de entradas del usuario.
- Persistencia de datos en archivos o base de datos.
- Edición y eliminación de trabajadores.
- Asociación completa entre trabajadores y tours.
- Interfaz gráfica de usuario.
- Reportes de tours y trabajadores.
- Pruebas unitarias.
- Mejor manejo de errores y excepciones.

## Licencia

Este proyecto fue desarrollado con fines académicos.  
Su uso, modificación y distribución quedan sujetos a la autorización del autor.

## Créditos

Desarrollado por:

**Maximiliano Pino**
```
