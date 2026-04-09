¡Excelente! Ahora que tenemos la documentación del programa COBOL, podemos crear un archivo de características (`.feature`) en Gherkin para describir el comportamiento del programa.

Aquí te dejo un ejemplo de cómo podría ser el archivo `.feature`:
```gherkin
Característica: Programa de suma en COBOL
  Como usuario, quiero que el programa realice la suma de dos números enteros
  y muestre el resultado en pantalla.

Escenario: Suma de dos números enteros
  Dado que el usuario introduce el primer número 2
  Y el usuario introduce el segundo número 3
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es 5

Escenario: Suma de dos números enteros con resultado mayor a 9
  Dado que el usuario introduce el primer número 10
  Y el usuario introduce el segundo número 5
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es 15

Escenario: Suma de dos números enteros con resultado negativo
  Dado que el usuario introduce el primer número -2
  Y el usuario introduce el segundo número 3
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es 1

Escenario: Suma de dos números enteros con resultado cero
  Dado que el usuario introduce el primer número 0
  Y el usuario introduce el segundo número 0
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es 0
```
En este archivo `.feature`, se describen cuatro escenarios diferentes para probar el comportamiento del programa:

1. Suma de dos números enteros con resultado positivo.
2. Suma de dos números enteros con resultado mayor a 9.
3. Suma de dos números enteros con resultado negativo.
4. Suma de dos números enteros con resultado cero.

Cada escenario se describe utilizando las palabras clave `Dado`, `Y`, `Cuando` y `Entonces`, que son las palabras clave estándar en Gherkin para describir un escenario.

Ahora, podemos utilizar este archivo `.feature` para generar pruebas automatizadas para el programa COBOL utilizando una herramienta de automatización de pruebas como Cucumber.