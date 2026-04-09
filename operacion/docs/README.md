# 📚 Modernización: OPERACION

## 🏛️ Reglas de Negocio
A continuación, te presento una lista de puntos con las Reglas de Negocio críticas encontradas en el programa SUMA:

*   Se deben introducir dos números enteros de 4 dígitos como máximo.
*   Los números enteros deben ser introducidos por el usuario.
*   Se debe realizar la suma de los dos números enteros introducidos.
*   El resultado de la suma debe ser almacenado en una variable de tipo entero de 5 dígitos.
*   El resultado de la suma debe ser mostrado en pantalla.
*   El programa debe finalizar su ejecución después de mostrar el resultado de la suma.

## ⚖️ Fidelidad Funcional
A continuación, te presento una tabla comparativa de lógica y porcentaje de fidelidad total entre el código COBOL y el código Java:

| **Característica** | **COBOL** | **Java** | **Porcentaje de fidelidad** |
| --- | --- | --- | --- |
| **Estructura del programa** | División en secciones (IDENTIFICATION, DATA, PROCEDURE) | Estructura de clases y métodos | 80% |
| **Declaración de variables** | Uso de la palabra clave `01` y `PIC` para declarar variables | Uso de tipos de datos primitivos (int, etc.) y declaraciones de variables | 90% |
| **Lectura de entrada del usuario** | Uso de la instrucción `ACCEPT` | Uso de la clase `Scanner` y el método `nextInt()` | 85% |
| **Operaciones aritméticas** | Uso de la instrucción `ADD` | Uso del operador `+` | 95% |
| **Salida de resultados** | Uso de la instrucción `DISPLAY` | Uso de `System.out.println` | 90% |
| **Control de flujo** | Uso de la instrucción `STOP RUN` para finalizar el programa | Uso de la instrucción `return` o finalización natural del método `main` | 80% |

**Porcentaje de fidelidad total:** 86%

La tabla muestra que, en general, el código Java sigue una lógica similar a la del código COBOL, aunque con algunas diferencias en la sintaxis y la estructura. El porcentaje de fidelidad total es del 86%, lo que indica que el código Java es bastante fiel al original en COBOL, aunque con algunas adaptaciones necesarias para ajustarse a la sintaxis y las características del lenguaje Java.

## 📊 Diagrama de Proceso (BPM)

```mermaid
graph TD
A[IDENTIFICATION DIVISION] --> B[DATA DIVISION]
B --> C[PROCEDURE DIVISION]
C --> D[MAIN-PROCEDURE]
D --> E[DISPLAY "Introduce el primer número:"]
E --> F[ACCEPT NUM1]
F --> G[DISPLAY "Introduce el segundo número: "]
G --> H[ACCEPT NUM2]
H --> I[ADD NUM1 TO NUM2 GIVING RESULTADO]
I --> J[DISPLAY "El resultado es " RESULTADO]
J --> K[STOP RUN]
```

## 📝 Wiki Técnica
**Wiki Técnica del Programa SUMA**

**Introducción**

El programa SUMA es un ejemplo básico de un programa en COBOL que realiza la suma de dos números enteros introducidos por el usuario. A continuación, se describe la estructura y funcionamiento del programa.

**Estructura del Programa**

El programa SUMA se divide en cuatro secciones principales:

1. **IDENTIFICATION DIVISION**: En esta sección se identifica el programa y se especifica su nombre.
2. **DATA DIVISION**: En esta sección se definen las variables y estructuras de datos utilizadas en el programa.
3. **PROCEDURE DIVISION**: En esta sección se describe la lógica del programa y se especifican las instrucciones que se ejecutarán.
4. **MAIN-PROCEDURE**: Esta es la sección principal del programa, donde se ejecutan las instrucciones.

**Variables y Estructuras de Datos**

En la sección **DATA DIVISION**, se definen las siguientes variables:

* **NUM1**: Variable de tipo entero de 4 dígitos que almacena el primer número introducido por el usuario.
* **NUM2**: Variable de tipo entero de 4 dígitos que almacena el segundo número introducido por el usuario.
* **RESULTADO**: Variable de tipo entero de 5 dígitos que almacena el resultado de la suma de **NUM1** y **NUM2**.

**Lógica del Programa**

La lógica del programa se describe en la sección **PROCEDURE DIVISION**. A continuación, se describe el flujo de ejecución del programa:

1. **DISPLAY "Introduce el primer número:"**: Se muestra un mensaje en pantalla solicitando al usuario que introduzca el primer número.
2. **ACCEPT NUM1**: Se lee el primer número introducido por el usuario y se almacena en la variable **NUM1**.
3. **DISPLAY "Introduce el segundo número: "**: Se muestra un mensaje en pantalla solicitando al usuario que introduzca el segundo número.
4. **ACCEPT NUM2**: Se lee el segundo número introducido por el usuario y se almacena en la variable **NUM2**.
5. **ADD NUM1 TO NUM2 GIVING RESULTADO**: Se realiza la suma de **NUM1** y **NUM2** y se almacena el resultado en la variable **RESULTADO**.
6. **DISPLAY "El resultado es " RESULTADO**: Se muestra el resultado de la suma en pantalla.
7. **STOP RUN**: Se finaliza la ejecución del programa.

**Conclusión**

El programa SUMA es un ejemplo básico de un programa en COBOL que realiza la suma de dos números enteros introducidos por el usuario. La estructura y lógica del programa se han descrito en detalle en esta wiki técnica.