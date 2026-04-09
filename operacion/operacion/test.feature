Aquí te presento el Gherkin para el proceso de suma de dos números enteros:

**Característica:** Programa de Suma

**Escenario 1:** Ingreso de dos números válidos

* **Dado** que el usuario ingresa dos números enteros positivos de hasta 4 dígitos
* **Cuando** el programa verifica la validez de los números
* **Entonces** el programa calcula la suma de los dos números
* **Y** muestra el resultado de la suma en la pantalla con un máximo de 5 dígitos

**Escenario 2:** Ingreso de un número no válido

* **Dado** que el usuario ingresa un número no válido (negativo, decimal o alfanumérico)
* **Cuando** el programa verifica la validez del número
* **Entonces** el programa muestra un mensaje de error
* **Y** solicita que se ingrese nuevamente el número

**Escenario 3:** Ingreso de dos números que superan el límite de 4 dígitos

* **Dado** que el usuario ingresa dos números enteros que superan el límite de 4 dígitos
* **Cuando** el programa verifica la validez de los números
* **Entonces** el programa muestra un mensaje de error
* **Y** solicita que se ingresen nuevamente los números

**Escenario 4:** Cálculo de la suma con números válidos

* **Dado** que el usuario ingresa dos números enteros positivos de hasta 4 dígitos
* **Cuando** el programa calcula la suma de los dos números
* **Entonces** el resultado de la suma es correcto
* **Y** se muestra en la pantalla con un máximo de 5 dígitos

**Escenario 5:** Finalización del programa

* **Dado** que el programa ha finalizado su ejecución
* **Cuando** el usuario cierra el programa
* **Entonces** el programa se cierra correctamente

**Ejemplos:**

* Ingreso de dos números válidos: 2 y 3
* Ingreso de un número no válido: -1
* Ingreso de dos números que superan el límite de 4 dígitos: 12345 y 67890
* Cálculo de la suma con números válidos: 2 + 3 = 5
* Finalización del programa: el programa se cierra correctamente después de mostrar el resultado de la suma.