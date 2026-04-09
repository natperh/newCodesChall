# 📚 Reporte de Modernización: OPERACION

## ⚖️ Análisis de Fidelidad Funcional
| Regla de Negocio identificada en COBOL | Implementación correspondiente en Java | Porcentaje de Fidelidad Funcional |
| --- | --- | --- |
| 1. Pedir al usuario que introduzca el primer número | `System.out.print("Introduce el primer número: "); int num1 = scanner.nextInt();` | 100% |
| 2. Pedir al usuario que introduzca el segundo número | `System.out.print("Introduce el segundo número: "); int num2 = scanner.nextInt();` | 100% |
| 3. Realizar la suma de los dos números | `int resultado = num1 + num2;` | 100% |
| 4. Mostrar el resultado de la suma | `System.out.println("El resultado es: " + resultado);` | 100% |

**Porcentaje Total de Fidelidad del Programa:** 100%

La implementación en Java es casi idéntica a la original en COBOL, con la única diferencia en la forma en que se maneja la entrada y salida del usuario. En COBOL se utiliza la instrucción `ACCEPT` para leer la entrada del usuario, mientras que en Java se utiliza la clase `Scanner`. Sin embargo, la lógica de negocio es la misma en ambos casos, por lo que el porcentaje de fidelidad funcional es del 100%.

## 📊 Flujo de Negocio (BPM)

```mermaid
graph TD
```

## 📝 Documentación Detallada
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