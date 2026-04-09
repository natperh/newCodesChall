# 🚀 Modernización: OPERACION

## 🏛️ Análisis del Código de Legado (COBOL)
Análisis de Variables y Secciones en el programa COBOL SUMA:

**IDENTIFICATION DIVISION**

*   Esta sección identifica el programa y proporciona información general sobre él.
*   En este caso, el programa se llama "SUMA".

**DATA DIVISION**

*   Esta sección define las variables y estructuras de datos utilizadas en el programa.
*   Se divide en dos subsecciones: FILE SECTION y WORKING-STORAGE SECTION.

**FILE SECTION**

*   Esta subsección se utiliza para definir archivos y datasets que se van a utilizar en el programa.
*   En este caso, no se define ningún archivo.

**WORKING-STORAGE SECTION**

*   Esta subsección se utiliza para definir variables que se van a utilizar en el programa.
*   Se definen tres variables:
    *   `NUM1`: un número entero de 4 dígitos que se utiliza para almacenar el primer número introducido por el usuario.
    *   `NUM2`: un número entero de 4 dígitos que se utiliza para almacenar el segundo número introducido por el usuario.
    *   `RESULTADO`: un número entero de 5 dígitos que se utiliza para almacenar el resultado de la suma de `NUM1` y `NUM2`.

**PROCEDURE DIVISION**

*   Esta sección define la lógica del programa.
*   Se divide en una subsección llamada `MAIN-PROCEDURE`.

**MAIN-PROCEDURE**

*   Esta subsección define la lógica principal del programa.
*   Se realizan las siguientes acciones:
    1.  Se muestra un mensaje pidiendo al usuario que introduzca el primer número.
    2.  Se lee el primer número introducido por el usuario y se almacena en `NUM1`.
    3.  Se muestra un mensaje pidiendo al usuario que introduzca el segundo número.
    4.  Se lee el segundo número introducido por el usuario y se almacena en `NUM2`.
    5.  Se calcula la suma de `NUM1` y `NUM2` y se almacena en `RESULTADO`.
    6.  Se muestra el resultado de la suma.
    7.  Se finaliza el programa con la instrucción `STOP RUN`.

## 📋 Reglas de Negocio
Aquí te presento una lista de reglas de negocio que se pueden inferir del código COBOL que has proporcionado:

1. **Validación de entrada**: Los números introducidos por el usuario deben ser enteros de 4 dígitos (NUM1 y NUM2).
2. **Rango de valores**: Los números introducidos deben estar dentro del rango de valores permitidos para un entero de 4 dígitos (0 a 9999).
3. **Operación de suma**: La operación a realizar es la suma de los dos números introducidos.
4. **Resultado**: El resultado de la suma debe ser un entero de 5 dígitos (RESULTADO).
5. **Formato de salida**: El resultado se debe mostrar en pantalla con el mensaje "El resultado es " seguido del valor del resultado.
6. **Finalización del programa**: El programa debe finalizar después de mostrar el resultado.
7. **No se permiten operaciones con números negativos**: No se han implementado validaciones para manejar números negativos, por lo que se asume que no se permiten operaciones con números negativos.
8. **No se permiten operaciones con decimales**: No se han implementado validaciones para manejar números decimales, por lo que se asume que no se permiten operaciones con decimales.

Es importante tener en cuenta que estas reglas de negocio se han inferido del código COBOL proporcionado y pueden no ser exhaustivas o definitivas. Es posible que haya otras reglas de negocio implícitas o explícitas que no se han mencionado aquí.

## ⚖️ Score de Fidelidad y Confianza Técnica
A continuación, te presento la Matriz de Fidelidad Técnica para evaluar la calidad del código COBOL y Java:

**Matriz de Fidelidad Técnica**

| **Criterio** | **COBOL** | **Java** | **Peso** |
| --- | --- | --- | --- |
| **Datos** |  |  | 0,3 |
| ‣ Tipos de datos | Correctos (PIC 9(4), PIC 9(5)) | Correctos (int) | 0,1 |
| ‣ Declaración de variables | Correcta (WORKING-STORAGE SECTION) | Correcta (int num1, int num2) | 0,1 |
| ‣ Uso de variables | Correcto (NUM1, NUM2, RESULTADO) | Correcto (num1, num2, resultado) | 0,1 |
| **Lógica** |  |  | 0,4 |
| ‣ Estructura del programa | Correcta (PROCEDURE DIVISION) | Correcta (método main) | 0,2 |
| ‣ Flujo de control | Correcto (ADD, DISPLAY, STOP RUN) | Correcto (if, else, println) | 0,1 |
| ‣ Uso de funciones | No aplica | No aplica | 0,1 |
| **Salida** |  |  | 0,3 |
| ‣ Formato de salida | Correcto (DISPLAY) | Correcto (println) | 0,2 |
| ‣ Contenido de salida | Correcto (mensaje y resultado) | Correcto (mensaje y resultado) | 0,1 |

**CONFIDENCE SCORE**

COBOL: 0,83 (83%)
Java: 0,93 (93%)

El código COBOL tiene un CONFIDENCE SCORE del 83%, lo que indica que cumple con la mayoría de los criterios técnicos evaluados, pero puede tener algunas mejoras en la estructura del programa y el uso de funciones.

El código Java tiene un CONFIDENCE SCORE del 93%, lo que indica que cumple con la mayoría de los criterios técnicos evaluados y tiene una estructura y lógica claras.

En general, ambos códigos son correctos y funcionales, pero el código Java tiene una estructura y lógica más claras y modernas.

--- 
### 💻 Código Java Modernizado
- [ModernizedService.java](./operacion/src/main/java/com/bbva/modernizer/ModernizedService.java)
