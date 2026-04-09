A continuación, te presento los escenarios Gherkin que validan cada regla de negocio descrita en la Wiki:

**Escenario 1: Validación de NUM1 y NUM2**

*   **Dado** que el usuario ingresa un valor numérico para NUM1 y NUM2
*   **Cuando** el usuario ejecuta el proceso de suma
*   **Entonces** el sistema verifica que NUM1 y NUM2 sean números enteros de cuatro dígitos
*   **Y** el sistema verifica que NUM1 y NUM2 sean enteros positivos
*   **Y** el sistema verifica que NUM1 y NUM2 no excedan los cuatro dígitos

**Escenario 2: Validación de NUM1 y NUM2 - Error**

*   **Dado** que el usuario ingresa un valor no numérico o un número con más de cuatro dígitos para NUM1 o NUM2
*   **Cuando** el usuario ejecuta el proceso de suma
*   **Entonces** el sistema muestra un error y no realiza la suma

**Escenario 3: Cálculo de la suma**

*   **Dado** que el usuario ingresa valores válidos para NUM1 y NUM2
*   **Cuando** el usuario ejecuta el proceso de suma
*   **Entonces** el sistema calcula la suma aritmética de NUM1 y NUM2 utilizando la fórmula RESULTADO = NUM1 + NUM2
*   **Y** el sistema muestra el resultado de la suma

**Escenario 4: Caso de excepción - Resultado excede los cinco dígitos**

*   **Dado** que el resultado de la suma excede los cinco dígitos
*   **Cuando** el usuario ejecuta el proceso de suma
*   **Entonces** el sistema muestra un error y no muestra el resultado

**Escenario 5: Caso de excepción - Error en la ejecución**

*   **Dado** que se produce un error durante la ejecución del proceso de suma
*   **Cuando** el usuario ejecuta el proceso de suma
*   **Entonces** el sistema se detiene y muestra un mensaje de error

Estos escenarios Gherkin cubren todas las reglas de negocio descritas en la Wiki, incluyendo la validación de los números ingresados, el cálculo de la suma y los casos de excepción.