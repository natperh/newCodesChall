# 📚 Wiki y Fidelidad: OPERACION

¡Claro! A continuación, te proporciono una wiki técnica completa sobre el programa COBOL que has proporcionado:

**Título:** Programa de suma en COBOL

**Descripción:** Este programa en COBOL realiza la suma de dos números enteros introducidos por el usuario y muestra el resultado en pantalla.

**Estructura del programa:**

* **IDENTIFICATION DIVISION:** Esta sección identifica el programa y proporciona información sobre él.
 + `PROGRAM-ID. SUMA.`: Especifica el nombre del programa, que es "SUMA".
* **DATA DIVISION:** Esta sección define las variables y estructuras de datos utilizadas en el programa.
 + `FILE SECTION.`: No se utiliza en este programa, ya que no se trabajan con archivos.
 + `WORKING-STORAGE SECTION.`: Define las variables de trabajo utilizadas en el programa.
 - `01 NUM1 PIC 9(4).`: Define una variable llamada `NUM1` con un formato de 4 dígitos numéricos.
 - `01 NUM2 PIC 9(4).`: Define una variable llamada `NUM2` con un formato de 4 dígitos numéricos.
 - `01 RESULTADO PIC 9(5).`: Define una variable llamada `RESULTADO` con un formato de 5 dígitos numéricos.
* **PROCEDURE DIVISION:** Esta sección define las instrucciones que se ejecutan en el programa.
 + `MAIN-PROCEDURE.`: Especifica el procedimiento principal del programa.
 - `DISPLAY "Introduce el primer número:".`: Muestra un mensaje en pantalla solicitando al usuario que introduzca el primer número.
 - `ACCEPT NUM1.`: Lee el valor introducido por el usuario y lo almacena en la variable `NUM1`.
 - `DISPLAY "Introduce el segundo número: ".`: Muestra un mensaje en pantalla solicitando al usuario que introduzca el segundo número.
 - `ACCEPT NUM2.`: Lee el valor introducido por el usuario y lo almacena en la variable `NUM2`.
 - `ADD NUM1 TO NUM2 GIVING RESULTADO.`: Realiza la suma de `NUM1` y `NUM2` y almacena el resultado en la variable `RESULTADO`.
 - `DISPLAY "El resultado es " RESULTADO.`: Muestra el resultado de la suma en pantalla.
 - `STOP RUN.`: Finaliza la ejecución del programa.

**Funcionamiento:**

1. El programa muestra un mensaje en pantalla solicitando al usuario que introduzca el primer número.
2. El usuario introduce un número y el programa lo almacena en la variable `NUM1`.
3. El programa muestra un mensaje en pantalla solicitando al usuario que introduzca el segundo número.
4. El usuario introduce un número y el programa lo almacena en la variable `NUM2`.
5. El programa realiza la suma de `NUM1` y `NUM2` y almacena el resultado en la variable `RESULTADO`.
6. El programa muestra el resultado de la suma en pantalla.
7. El programa finaliza su ejecución.

**Notas:**

* El programa utiliza variables de trabajo para almacenar los valores introducidos por el usuario y el resultado de la suma.
* El programa utiliza la instrucción `ADD` para realizar la suma de los dos números.
* El programa utiliza la instrucción `DISPLAY` para mostrar mensajes y resultados en pantalla.
* El programa utiliza la instrucción `ACCEPT` para leer valores introducidos por el usuario.
* El programa utiliza la instrucción `STOP RUN` para finalizar su ejecución.

## ⚖️ Fidelidad
Aquí te presento una matriz de trazabilidad que compara el código COBOL y Java para la función de suma:

| **Requisito** | **COBOL** | **Java** |
| --- | --- | --- |
| Declaración de variables | `01 NUM1 PIC 9(4).` | `int num1;` |
| Declaración de variables | `01 NUM2 PIC 9(4).` | `int num2;` |
| Declaración de variable resultado | `01 RESULTADO PIC 9(5).` | `int resultado;` |
| Lectura de entrada del usuario | `ACCEPT NUM1.` | `int num1 = scanner.nextInt();` |
| Lectura de entrada del usuario | `ACCEPT NUM2.` | `int num2 = scanner.nextInt();` |
| Operación de suma | `ADD NUM1 TO NUM2 GIVING RESULTADO.` | `int resultado = sumaService.sumar(num1, num2);` |
| Impresión del resultado | `DISPLAY "El resultado es " RESULTADO.` | `System.out.println("El resultado es " + resultado);` |
| Estructura de control | `PROCEDURE DIVISION. MAIN-PROCEDURE.` | `public static void main(String[] args) { ... }` |
| Llamada a función | No aplica | `sumaService.sumar(num1, num2)` |
| Declaración de función | No aplica | `public int sumar(int num1, int num2) { ... }` |

La matriz muestra cómo cada requisito se implementa de manera diferente en COBOL y Java. Algunas diferencias notables son:

* La declaración de variables en COBOL se realiza mediante la sección `WORKING-STORAGE SECTION`, mientras que en Java se utiliza la palabra clave `int`.
* La lectura de entrada del usuario en COBOL se realiza mediante la instrucción `ACCEPT`, mientras que en Java se utiliza la clase `Scanner`.
* La operación de suma en COBOL se realiza mediante la instrucción `ADD`, mientras que en Java se utiliza el operador `+`.
* La impresión del resultado en COBOL se realiza mediante la instrucción `DISPLAY`, mientras que en Java se utiliza la clase `System.out`.
* La estructura de control en COBOL se realiza mediante la sección `PROCEDURE DIVISION`, mientras que en Java se utiliza la palabra clave `public static void main`.
* La llamada a función en Java se realiza mediante la instancia de la clase `SumaService`, mientras que en COBOL no se utiliza una función separada para la suma.

Espero que esta matriz te sea útil para comparar y contrastar los dos códigos.