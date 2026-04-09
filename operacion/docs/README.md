# 📚 Detalles Técnicos: OPERACION

¡Claro! A continuación, te proporciono una wiki técnica completa sobre el programa COBOL que has proporcionado:

**Título:** Programa de suma en COBOL

**Descripción:** Este programa en COBOL realiza la suma de dos números enteros introducidos por el usuario y muestra el resultado en pantalla.

**Estructura del programa:**

* **IDENTIFICATION DIVISION:** Sección que identifica el programa y proporciona información sobre él.
 + `PROGRAM-ID.`: Especifica el nombre del programa, en este caso "SUMA".
* **DATA DIVISION:** Sección que define las variables y estructuras de datos utilizadas en el programa.
 + `FILE SECTION.`: Sección que define los archivos utilizados en el programa (en este caso, no se utilizan archivos).
 + `WORKING-STORAGE SECTION.`: Sección que define las variables de trabajo utilizadas en el programa.
 - `01 NUM1 PIC 9(4).`: Define una variable llamada `NUM1` con un formato de 4 dígitos numéricos.
 - `01 NUM2 PIC 9(4).`: Define una variable llamada `NUM2` con un formato de 4 dígitos numéricos.
 - `01 RESULTADO PIC 9(5).`: Define una variable llamada `RESULTADO` con un formato de 5 dígitos numéricos.
* **PROCEDURE DIVISION:** Sección que define las instrucciones que se ejecutan en el programa.
 + `MAIN-PROCEDURE.`: Sección que define la rutina principal del programa.
 - `DISPLAY "Introduce el primer número:".`: Muestra un mensaje en pantalla solicitando al usuario que introduzca el primer número.
 - `ACCEPT NUM1.`: Lee el valor introducido por el usuario y lo almacena en la variable `NUM1`.
 - `DISPLAY "Introduce el segundo número: ".`: Muestra un mensaje en pantalla solicitando al usuario que introduzca el segundo número.
 - `ACCEPT NUM2.`: Lee el valor introducido por el usuario y lo almacena en la variable `NUM2`.
 - `ADD NUM1 TO NUM2 GIVING RESULTADO.`: Realiza la suma de los valores almacenados en `NUM1` y `NUM2` y almacena el resultado en la variable `RESULTADO`.
 - `DISPLAY "El resultado es " RESULTADO.`: Muestra el resultado de la suma en pantalla.
 - `STOP RUN.`: Finaliza la ejecución del programa.

**Funcionamiento:**

1. El programa muestra un mensaje en pantalla solicitando al usuario que introduzca el primer número.
2. El usuario introduce un valor y el programa lo almacena en la variable `NUM1`.
3. El programa muestra un mensaje en pantalla solicitando al usuario que introduzca el segundo número.
4. El usuario introduce un valor y el programa lo almacena en la variable `NUM2`.
5. El programa realiza la suma de los valores almacenados en `NUM1` y `NUM2` y almacena el resultado en la variable `RESULTADO`.
6. El programa muestra el resultado de la suma en pantalla.
7. El programa finaliza su ejecución.

**Notas:**

* El programa utiliza variables de trabajo para almacenar los valores introducidos por el usuario y el resultado de la suma.
* El programa utiliza la instrucción `ADD` para realizar la suma de los valores almacenados en `NUM1` y `NUM2`.
* El programa utiliza la instrucción `DISPLAY` para mostrar mensajes en pantalla y el resultado de la suma.
* El programa utiliza la instrucción `ACCEPT` para leer los valores introducidos por el usuario.
* El programa utiliza la instrucción `STOP RUN` para finalizar su ejecución.

## 📊 Diagrama BPM
```mermaid
graph TD
A[Inicio] --> B[Muestra mensaje "Introduce el primer número:"]
B --> C[Lee valor introducido por el usuario y lo almacena en NUM1]
C --> D[Muestra mensaje "Introduce el segundo número: "]
D --> E[Lee valor introducido por el usuario y lo almacena en NUM2]
E --> F[Realiza suma de NUM1 y NUM2 y almacena resultado en RESULTADO]
F --> G[Muestra resultado de la suma en pantalla]
G --> H[Finaliza ejecución del programa]
```