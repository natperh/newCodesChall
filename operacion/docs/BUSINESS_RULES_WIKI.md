# 🏦 Wiki de Negocio: operacion

**Wiki de Reglas de Negocio: Programa de Suma**

**Introducción**

Este documento describe las reglas de negocio para el programa de suma, diseñado para calcular la suma de dos números enteros. El programa está escrito en lenguaje COBOL y se ejecuta en un entorno de procesamiento de datos.

**Reglas de Negocio**

1. **Entrada de Datos**
	* El programa solicita al usuario que ingrese dos números enteros, denominados NUM1 y NUM2.
	* Los números deben ser enteros positivos de hasta 4 dígitos.
	* El programa no admite números negativos, decimales ni caracteres alfanuméricos.
2. **Validación de Datos**
	* El programa verifica que los números ingresados sean válidos (enteros positivos de hasta 4 dígitos).
	* Si los números no son válidos, el programa muestra un mensaje de error y solicita que se ingresen nuevamente.
3. **Cálculo de la Suma**
	* El programa calcula la suma de los dos números ingresados utilizando la instrucción ADD.
	* El resultado se almacena en la variable RESULTADO.
4. **Salida de Datos**
	* El programa muestra el resultado de la suma en la pantalla.
	* El resultado se muestra con un máximo de 5 dígitos.
5. **Finalización del Programa**
	* El programa finaliza su ejecución después de mostrar el resultado de la suma.

**Especificaciones Técnicas**

* El programa está escrito en lenguaje COBOL.
* El programa utiliza las siguientes variables:
	+ NUM1: número entero de hasta 4 dígitos.
	+ NUM2: número entero de hasta 4 dígitos.
	+ RESULTADO: número entero de hasta 5 dígitos.
* El programa utiliza las siguientes instrucciones:
	+ DISPLAY: muestra un mensaje en la pantalla.
	+ ACCEPT: solicita al usuario que ingrese un valor.
	+ ADD: calcula la suma de dos números.
	+ STOP RUN: finaliza la ejecución del programa.

**Casos de Uso**

* El usuario ingresa dos números válidos y el programa muestra el resultado de la suma.
* El usuario ingresa un número no válido y el programa muestra un mensaje de error.
* El usuario ingresa dos números que superan el límite de 4 dígitos y el programa muestra un mensaje de error.

**Pruebas**

* Se deben realizar pruebas para verificar que el programa funcione correctamente con diferentes combinaciones de números válidos y no válidos.
* Se deben realizar pruebas para verificar que el programa muestre el resultado correcto para diferentes combinaciones de números.

**Mantenimiento y Actualización**

* El programa debe ser revisado y actualizado periódicamente para asegurarse de que siga funcionando correctamente.
* Se deben realizar pruebas después de cualquier actualización para asegurarse de que el programa siga funcionando correctamente.