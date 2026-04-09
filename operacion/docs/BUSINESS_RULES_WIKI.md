# 🏦 Reglas de Negocio: operacion

**Wiki: Proceso de Suma de Dos Números**
=====================================

**1. Objetivo del Proceso**
-------------------------

El objetivo de este proceso es realizar la suma de dos números enteros de cuatro dígitos cada uno y mostrar el resultado.

**2. Reglas de Validación**
-------------------------

*   Se verifican los siguientes datos:
    *   NUM1: Debe ser un número entero de cuatro dígitos.
    *   NUM2: Debe ser un número entero de cuatro dígitos.
*   Se validan los siguientes criterios:
    *   Los números ingresados deben ser enteros positivos.
    *   Los números ingresados no deben exceder los cuatro dígitos.

**3. Reglas de Cálculo**
----------------------

*   La fórmula financiera utilizada es la suma aritmética:
    *   RESULTADO = NUM1 + NUM2

**4. Casos de Excepción**
-----------------------

*   Si el usuario ingresa un valor no numérico o un número con más de cuatro dígitos, el programa mostrará un error y no realizará la suma.
*   Si el resultado de la suma excede los cinco dígitos, el programa mostrará un error y no mostrará el resultado.

**Especificaciones Técnicas**
---------------------------

*   El programa está escrito en COBOL y utiliza la división `IDENTIFICATION`, `DATA` y `PROCEDURE`.
*   Se utilizan variables de tipo `PIC 9(4)` para almacenar los números enteros de cuatro dígitos.
*   Se utiliza la instrucción `ADD` para realizar la suma aritmética.
*   Se utiliza la instrucción `DISPLAY` para mostrar los mensajes y el resultado.

**Notas**
-------

*   El programa no realiza validaciones adicionales sobre los números ingresados, como verificar si son negativos o si contienen decimales.
*   El programa no maneja errores de forma explícita, por lo que si se produce un error, el programa se detendrá y mostrará un mensaje de error.