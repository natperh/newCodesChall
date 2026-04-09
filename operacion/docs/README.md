# 📚 Reporte de Modernización: OPERACION

## 📝 Descripción
**Wiki Técnica: Lógica de Negocio del Programa SUMA**

**Introducción**

El programa SUMA es un ejemplo básico de un programa en COBOL que realiza una operación aritmética simple: la suma de dos números enteros. En esta wiki técnica, se explicará la lógica de negocio detrás de este programa, detallando cada sección y sentencia.

**IDENTIFICATION DIVISION**

Esta sección identifica el programa y proporciona información básica sobre él. En este caso, el programa se llama "SUMA".

**DATA DIVISION**

Esta sección define las variables y estructuras de datos utilizadas en el programa. En este caso, se definen tres variables:

* `NUM1`: un campo numérico de 4 dígitos que almacenará el primer número introducido por el usuario.
* `NUM2`: un campo numérico de 4 dígitos que almacenará el segundo número introducido por el usuario.
* `RESULTADO`: un campo numérico de 5 dígitos que almacenará el resultado de la suma de `NUM1` y `NUM2`.

**WORKING-STORAGE SECTION**

Esta sección define las variables que se utilizarán en el programa y que no se almacenan en un archivo. En este caso, se definen las tres variables mencionadas anteriormente.

**PROCEDURE DIVISION**

Esta sección contiene la lógica de negocio del programa. En este caso, se define un procedimiento llamado `MAIN-PROCEDURE` que realiza las siguientes acciones:

1. **DISPLAY "Introduce el primer número:"**: muestra un mensaje en la pantalla pidiendo al usuario que introduzca el primer número.
2. **ACCEPT NUM1**: lee el número introducido por el usuario y lo almacena en la variable `NUM1`.
3. **DISPLAY "Introduce el segundo número: "**: muestra un mensaje en la pantalla pidiendo al usuario que introduzca el segundo número.
4. **ACCEPT NUM2**: lee el número introducido por el usuario y lo almacena en la variable `NUM2`.
5. **ADD NUM1 TO NUM2 GIVING RESULTADO**: realiza la suma de `NUM1` y `NUM2` y almacena el resultado en la variable `RESULTADO`.
6. **DISPLAY "El resultado es " RESULTADO**: muestra el resultado de la suma en la pantalla.
7. **STOP RUN**: finaliza la ejecución del programa.

**END PROGRAM SUMA**

Esta sentencia marca el final del programa.

**Lógica de Negocio**

La lógica de negocio del programa SUMA se puede resumir de la siguiente manera:

1. El programa solicita al usuario que introduzca dos números enteros.
2. El programa almacena los números introducidos en las variables `NUM1` y `NUM2`.
3. El programa realiza la suma de los dos números y almacena el resultado en la variable `RESULTADO`.
4. El programa muestra el resultado de la suma en la pantalla.

En resumen, el programa SUMA es un ejemplo básico de un programa en COBOL que realiza una operación aritmética simple y muestra el resultado en la pantalla.

## ⚖️ Validación de Fidelidad
| Característica | COBOL | Java |
| --- | --- | --- |
| **Declaración de variables** | Se utiliza la sección `WORKING-STORAGE SECTION` para declarar variables. | Se utilizan tipos de datos primitivos (int, double, etc.) o clases para declarar variables. |
| **Entrada/Salida** | Se utiliza la instrucción `ACCEPT` para leer datos del usuario y `DISPLAY` para mostrar resultados. | Se utilizan métodos como `@RequestParam` para leer parámetros de la solicitud y `return` para devolver resultados. |
| **Lógica de negocio** | Se utiliza la sección `PROCEDURE DIVISION` para implementar la lógica de negocio. | Se utilizan métodos en clases para implementar la lógica de negocio. |
| **Estructura de programa** | El programa se estructura en divisiones (IDENTIFICATION, DATA, PROCEDURE). | El programa se estructura en clases y métodos. |
| **Tipos de datos** | Se utilizan tipos de datos definidos por el usuario (PIC 9(4), etc.). | Se utilizan tipos de datos primitivos (int, double, etc.) o clases. |
| **Operaciones aritméticas** | Se utilizan instrucciones como `ADD` para realizar operaciones aritméticas. | Se utilizan operadores aritméticos (+, -, \*, /, etc.) para realizar operaciones aritméticas. |
| **Interacción con el usuario** | Se utiliza la instrucción `DISPLAY` para mostrar mensajes al usuario. | Se utilizan métodos como `return` para devolver resultados al usuario. |
| **Separación de concerns** | No se separa la lógica de negocio de la presentación. | Se separa la lógica de negocio de la presentación utilizando patrones como MVC. |
| **Reutilización de código** | No se fomenta la reutilización de código. | Se fomenta la reutilización de código mediante la creación de clases y métodos reutilizables. |

En resumen, aunque ambos lenguajes pueden realizar la misma tarea, Java es un lenguaje más moderno y flexible que permite una mayor separación de concerns, reutilización de código y una estructura de programa más organizada. COBOL, por otro lado, es un lenguaje más antiguo y rígido que requiere una estructura de programa más estricta y no fomenta la reutilización de código.

## 📊 Flujo Lógico (BPM)
```mermaid
graph TD
```

## 🧪 Pruebas
- JUnit 5 y Gherkin generados.