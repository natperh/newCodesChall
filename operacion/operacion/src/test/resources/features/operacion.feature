¡Excelente! Ahora que tenemos una buena comprensión del programa COBOL, podemos crear un archivo `.feature` para describir el comportamiento del programa de suma en COBOL utilizando la sintaxis de Gherkin.

Aquí te dejo un ejemplo de cómo podría ser el archivo `.feature`:
```gherkin
Característica: Programa de suma en COBOL
  Como usuario, quiero poder introducir dos números enteros y obtener el resultado de su suma.

Escenario: Suma de dos números enteros
  Dado que el usuario introduce el primer número 2
  Y el usuario introduce el segundo número 3
  Cuando se ejecuta el programa de suma
  Entonces el resultado de la suma es 5

Escenario: Suma de dos números enteros con resultado mayor a 9
  Dado que el usuario introduce el primer número 10
  Y el usuario introduce el segundo número 20
  Cuando se ejecuta el programa de suma
  Entonces el resultado de la suma es 30

Escenario: Introducción de un valor no numérico
  Dado que el usuario introduce el primer número "a"
  Y el usuario introduce el segundo número 2
  Cuando se ejecuta el programa de suma
  Entonces se produce un error de entrada no válida
```
En este archivo `.feature`, describimos tres escenarios diferentes:

1. La suma de dos números enteros con resultado menor a 10.
2. La suma de dos números enteros con resultado mayor a 9.
3. La introducción de un valor no numérico, lo que debería producir un error.

Cada escenario se describe utilizando la sintaxis de Gherkin, que incluye las siguientes partes:

* `Dado`: describe la condición inicial del escenario.
* `Y`: describe una condición adicional del escenario.
* `Cuando`: describe la acción que se ejecuta en el escenario.
* `Entonces`: describe el resultado esperado del escenario.

Este archivo `.feature` puede ser utilizado como base para crear pruebas automatizadas para el programa de suma en COBOL.