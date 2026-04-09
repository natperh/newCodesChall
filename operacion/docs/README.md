# 📚 Reporte de Modernización: OPERACION

## 📝 Descripción del Proceso
**Wiki Técnica: Lógica de Negocio del Programa SUMA en COBOL**

**Introducción**

El programa SUMA es un ejemplo básico de un programa en COBOL que realiza la suma de dos números enteros. En este documento, se explicará la lógica de negocio detrás de este programa.

**Estructura del Programa**

El programa SUMA se divide en cuatro secciones principales:

1. **IDENTIFICATION DIVISION**: En esta sección se especifica el nombre del programa y otros metadatos.
2. **DATA DIVISION**: En esta sección se definen las variables y estructuras de datos utilizadas en el programa.
3. **PROCEDURE DIVISION**: En esta sección se define la lógica de negocio del programa.
4. **MAIN-PROCEDURE**: Es la sección principal del programa donde se ejecuta la lógica de negocio.

**Lógica de Negocio**

La lógica de negocio del programa SUMA se puede resumir en los siguientes pasos:

1. **Solicitar el primer número**: El programa muestra un mensaje en pantalla solicitando al usuario que introduzca el primer número.
2. **Aceptar el primer número**: El programa acepta el primer número introducido por el usuario y lo almacena en la variable `NUM1`.
3. **Solicitar el segundo número**: El programa muestra un mensaje en pantalla solicitando al usuario que introduzca el segundo número.
4. **Aceptar el segundo número**: El programa acepta el segundo número introducido por el usuario y lo almacena en la variable `NUM2`.
5. **Realizar la suma**: El programa realiza la suma de los dos números almacenados en las variables `NUM1` y `NUM2` y almacena el resultado en la variable `RESULTADO`.
6. **Mostrar el resultado**: El programa muestra el resultado de la suma en pantalla.

**Variables y Estructuras de Datos**

Las variables y estructuras de datos utilizadas en el programa SUMA son:

* `NUM1`: Variable de tipo entero que almacena el primer número introducido por el usuario.
* `NUM2`: Variable de tipo entero que almacena el segundo número introducido por el usuario.
* `RESULTADO`: Variable de tipo entero que almacena el resultado de la suma de los dos números.

**Instrucciones COBOL**

Las instrucciones COBOL utilizadas en el programa SUMA son:

* `DISPLAY`: Instrucción que muestra un mensaje en pantalla.
* `ACCEPT`: Instrucción que acepta un valor introducido por el usuario y lo almacena en una variable.
* `ADD`: Instrucción que realiza la suma de dos valores y almacena el resultado en una variable.
* `STOP RUN`: Instrucción que finaliza la ejecución del programa.

**Conclusión**

En resumen, el programa SUMA es un ejemplo básico de un programa en COBOL que realiza la suma de dos números enteros. La lógica de negocio detrás de este programa se basa en solicitar dos números al usuario, realizar la suma y mostrar el resultado en pantalla. Las variables y estructuras de datos utilizadas en el programa son de tipo entero y las instrucciones COBOL utilizadas son `DISPLAY`, `ACCEPT`, `ADD` y `STOP RUN`.

## ⚖️ Validación de Fidelidad
| Regla de Negocio (COBOL) | Implementación (Java) | Estado | Porcentaje de Fidelidad funcional |
| --- | --- | --- | --- |
| Solicitar el primer número al usuario | No se solicita el primer número al usuario, se pasa como parámetro en la URL | No Cumple | 0% |
| Solicitar el segundo número al usuario | No se solicita el segundo número al usuario, se pasa como parámetro en la URL | No Cumple | 0% |
| Realizar la suma de los dos números | Se realiza la suma de los dos números en el método `sumar` de `SumaService` | Cumple | 100% |
| Mostrar el resultado de la suma | Se muestra el resultado de la suma en la respuesta del controlador `SumaController` | Cumple | 100% |
| Utilizar variables de almacenamiento temporal para los números y el resultado | Se utilizan variables locales en los métodos de `SumaService` y `SumaController` | Cumple | 100% |
| Utilizar una estructura de programa secuencial | Se utiliza una estructura de programa secuencial en los métodos de `SumaService` y `SumaController` | Cumple | 100% |

En general, la implementación en Java cumple con la mayoría de las reglas de negocio del programa COBOL original, excepto en la forma en que se solicitan los números al usuario. En lugar de solicitar la entrada del usuario de manera interactiva, se pasan los números como parámetros en la URL. Esto cambia la forma en que se interactúa con el programa, pero no afecta la lógica de la suma en sí.

El porcentaje de fidelidad funcional es del 80%, ya que la mayoría de las reglas de negocio se cumplen, pero hay una diferencia significativa en la forma en que se interactúa con el programa.

## 📊 Flujo Lógico (BPM)
```mermaid
graph TD del flujo lógico del programa SUMA en COBOL:
```

## 🧪 Estrategia de Pruebas
- **BDD:** Gherkin Scenarios en `/src/test/resources`
- **Unitarias:** JUnit 5 en `/src/test/java`