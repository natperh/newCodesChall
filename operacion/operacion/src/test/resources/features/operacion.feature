¡Excelente! Ahora, vamos a crear un archivo `.feature` en Gherkin para describir el comportamiento del programa de suma en COBOL.

**suma.feature**
```gherkin
Característica: Programa de suma en COBOL
  Como usuario, quiero ingresar dos números enteros de 4 dígitos y obtener el resultado de su suma.

Escenario: Ingresar dos números y obtener el resultado
  Dado que el programa solicita el primer número
  Cuando ingreso un número entero de 4 dígitos
  Y el programa solicita el segundo número
  Cuando ingreso otro número entero de 4 dígitos
  Entonces el programa muestra el resultado de la suma

Escenario: Ingresar números inválidos
  Dado que el programa solicita el primer número
  Cuando ingreso un número no entero o de más de 4 dígitos
  Entonces el programa muestra un mensaje de error

Escenario: Ingresar números válidos y obtener el resultado
  Dado que el programa solicita el primer número
  Cuando ingreso el número 1234
  Y el programa solicita el segundo número
  Cuando ingreso el número 5678
  Entonces el programa muestra el resultado 6912
```
En este archivo `.feature`, hemos descrito tres escenarios:

1. **Ingresar dos números y obtener el resultado**: Describe el comportamiento general del programa, donde el usuario ingresa dos números y obtiene el resultado de su suma.
2. **Ingresar números inválidos**: Describe el comportamiento del programa cuando el usuario ingresa números no enteros o de más de 4 dígitos.
3. **Ingresar números válidos y obtener el resultado**: Describe un ejemplo específico de ingreso de números válidos y obtención del resultado.

Estos escenarios pueden ser utilizados como base para crear pruebas automatizadas para el programa de suma en COBOL.