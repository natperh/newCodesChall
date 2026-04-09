# 📚 Wiki y Fidelidad: OPERACION

¡Claro! A continuación, te proporciono una wiki técnica completa sobre el programa COBOL que has proporcionado:

**Título:** Programa de suma en COBOL

**Descripción:** Este programa en COBOL realiza la suma de dos números enteros introducidos por el usuario y muestra el resultado en pantalla.

**Estructura del programa:**

* **IDENTIFICATION DIVISION:** Esta sección identifica el programa y proporciona información sobre él, como el nombre del programa y el autor.
* **PROGRAM-ID:** Especifica el nombre del programa, en este caso "SUMA".
* **DATA DIVISION:** Esta sección define las variables y estructuras de datos utilizadas en el programa.
	+ **FILE SECTION:** No se utiliza en este programa, ya que no se trabaja con archivos.
	+ **WORKING-STORAGE SECTION:** Define las variables que se utilizan en el programa.
		- **01 NUM1 PIC 9(4):** Define una variable llamada "NUM1" que almacena un número entero de 4 dígitos.
		- **01 NUM2 PIC 9(4):** Define una variable llamada "NUM2" que almacena un número entero de 4 dígitos.
		- **01 RESULTADO PIC 9(5):** Define una variable llamada "RESULTADO" que almacena un número entero de 5 dígitos.
* **PROCEDURE DIVISION:** Esta sección define las instrucciones que se ejecutan en el programa.
	+ **MAIN-PROCEDURE:** Es la sección principal del programa.
		- **DISPLAY "Introduce el primer número:":** Muestra un mensaje en pantalla solicitando al usuario que introduzca el primer número.
		- **ACCEPT NUM1:** Lee el número introducido por el usuario y lo almacena en la variable "NUM1".
		- **DISPLAY "Introduce el segundo número: ":** Muestra un mensaje en pantalla solicitando al usuario que introduzca el segundo número.
		- **ACCEPT NUM2:** Lee el número introducido por el usuario y lo almacena en la variable "NUM2".
		- **ADD NUM1 TO NUM2 GIVING RESULTADO:** Realiza la suma de los números almacenados en "NUM1" y "NUM2" y almacena el resultado en la variable "RESULTADO".
		- **DISPLAY "El resultado es " RESULTADO:** Muestra el resultado de la suma en pantalla.
		- **STOP RUN:** Finaliza la ejecución del programa.

**Notas:**

* El programa utiliza la instrucción `PIC` para definir el formato de las variables. En este caso, `PIC 9(4)` indica que la variable almacena un número entero de 4 dígitos.
* La instrucción `ACCEPT` se utiliza para leer la entrada del usuario.
* La instrucción `ADD` se utiliza para realizar la suma de los números.
* La instrucción `GIVING` se utiliza para almacenar el resultado de la suma en una variable.
* La instrucción `DISPLAY` se utiliza para mostrar mensajes y resultados en pantalla.

Espero que esta wiki técnica te sea útil. ¡Si tienes alguna pregunta o necesitas más información, no dudes en preguntar!

## ⚖️ Fidelidad
Aquí te presento una matriz de trazabilidad que compara el programa COBOL con la implementación en Java:

| **Requisito** | **COBOL** | **Java** |
| --- | --- | --- |
| 1. Pedir dos números al usuario | `DISPLAY "Introduce el primer número:"` y `ACCEPT NUM1` | `@RequestParam int num1` y `@RequestParam int num2` |
| 2. Sumar los dos números | `ADD NUM1 TO NUM2 GIVING RESULTADO` | `int resultado = num1 + num2;` |
| 3. Mostrar el resultado | `DISPLAY "El resultado es " RESULTADO` | `return resultado;` |
| 4. Definir variables | `01 NUM1 PIC 9(4)` y `01 NUM2 PIC 9(4)` | `int num1` y `int num2` |
| 5. Definir el procedimiento principal | `MAIN-PROCEDURE` | `@Service` y `public class ModernizedService` |
| 6. Invocar el procedimiento | `STOP RUN` | `@Autowired` y `modernizedService.sumarNumeros(num1, num2)` |
| 7. Definir la interfaz de usuario | No se define explícitamente | `@RestController` y `@GetMapping("/sumar")` |
| 8. Procesar la entrada del usuario | `ACCEPT NUM1` y `ACCEPT NUM2` | `@RequestParam int num1` y `@RequestParam int num2` |

La matriz de trazabilidad muestra cómo cada requisito del programa COBOL se implementa en la versión en Java. Aunque las sintaxis y las estructuras de los programas son diferentes, la lógica y la funcionalidad son equivalentes.

Es importante destacar que la implementación en Java es más modular y utiliza patrones de diseño como la inyección de dependencias (DI) y la programación orientada a objetos (POO), lo que la hace más mantenible y escalable que el programa COBOL. Además, la versión en Java utiliza una arquitectura de capas (controlador, servicio, etc.) que no se encuentra en el programa COBOL.