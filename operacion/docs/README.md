# 📚 Reporte de Modernización: OPERACION

## 📝 Descripción del Proceso
**Wiki Técnica: Lógica de Negocio del Programa SUMA**

**Resumen**

El programa SUMA es un ejemplo básico de un programa en COBOL que realiza la suma de dos números enteros introducidos por el usuario. A continuación, se explica la lógica de negocio detrás de este programa.

**Estructura del Programa**

El programa SUMA se divide en cuatro secciones principales:

1. **IDENTIFICATION DIVISION**: En esta sección se identifica el programa y se especifica su nombre.
2. **DATA DIVISION**: En esta sección se definen las variables y estructuras de datos utilizadas en el programa.
3. **PROCEDURE DIVISION**: En esta sección se define la lógica de negocio del programa, es decir, las instrucciones que se ejecutan para realizar la suma.
4. **MAIN-PROCEDURE**: Esta es la sección principal del programa, donde se ejecutan las instrucciones.

**Lógica de Negocio**

La lógica de negocio del programa SUMA se puede resumir en los siguientes pasos:

1. **Solicitud de datos**: El programa solicita al usuario que introduzca dos números enteros.
2. **Almacenamiento de datos**: Los números introducidos se almacenan en las variables `NUM1` y `NUM2`.
3. **Realización de la suma**: El programa realiza la suma de los dos números utilizando la instrucción `ADD`.
4. **Almacenamiento del resultado**: El resultado de la suma se almacena en la variable `RESULTADO`.
5. **Visualización del resultado**: El programa muestra el resultado de la suma al usuario.

**Detalles de la Lógica de Negocio**

A continuación, se proporcionan detalles adicionales sobre la lógica de negocio del programa:

* **Solicitud de datos**: El programa utiliza la instrucción `DISPLAY` para mostrar un mensaje al usuario solicitando que introduzca un número. La instrucción `ACCEPT` se utiliza para leer el número introducido por el usuario y almacenarlo en la variable correspondiente.
* **Almacenamiento de datos**: Las variables `NUM1` y `NUM2` se definen como `PIC 9(4)`, lo que significa que pueden almacenar números enteros de hasta 4 dígitos.
* **Realización de la suma**: La instrucción `ADD` se utiliza para realizar la suma de los dos números. La instrucción `GIVING` se utiliza para especificar la variable que almacenará el resultado de la suma.
* **Almacenamiento del resultado**: La variable `RESULTADO` se define como `PIC 9(5)`, lo que significa que puede almacenar números enteros de hasta 5 dígitos.
* **Visualización del resultado**: El programa utiliza la instrucción `DISPLAY` para mostrar el resultado de la suma al usuario.

**Conclusión**

En resumen, el programa SUMA es un ejemplo básico de un programa en COBOL que realiza la suma de dos números enteros introducidos por el usuario. La lógica de negocio detrás de este programa se basa en la solicitud de datos, el almacenamiento de datos, la realización de la suma, el almacenamiento del resultado y la visualización del resultado.

## ⚖️ Validación de Fidelidad
Aquí te dejo la tabla Markdown con la comparativa entre el COBOL original y el Java generado:

| Regla de Negocio (COBOL) | Implementación (Java) | Estado | % Fidelidad |
| --- | --- | --- | --- |
| Solicitar el primer número al usuario | No se solicita explícitamente, se espera como parámetro en la URL | No Cumple | 0% |
| Solicitar el segundo número al usuario | No se solicita explícitamente, se espera como parámetro en la URL | No Cumple | 0% |
| Realizar la suma de los dos números | Se realiza la suma en el método `sumar` de `SumaService` | Cumple | 100% |
| Mostrar el resultado de la suma | Se muestra el resultado como una cadena en el controlador `SumaController` | Cumple | 100% |
| Utilizar variables de almacenamiento temporal | Se utilizan variables locales en los métodos de `SumaService` y `SumaController` | Cumple | 100% |
| Utilizar una sección de procedimientos | Se utiliza una clase de servicio (`SumaService`) y un controlador (`SumaController`) | Cumple | 100% |

En general, el Java generado cumple con la lógica de negocio del COBOL original en cuanto a la realización de la suma y la muestra del resultado. Sin embargo, no cumple con la solicitud de entrada del usuario de la misma manera que el COBOL original, ya que se espera que se le pasen los números como parámetros en la URL en lugar de solicitar la entrada explícitamente. Por lo tanto, la fidelidad es del 60%.

## 📊 Flujo Lógico (BPM)
```mermaid
graph TD
```

## 🧪 Estrategia de Pruebas
- **BDD:** Gherkin Scenarios en `/src/test/resources`
- **Unitarias:** JUnit 5 en `/src/test/java`
