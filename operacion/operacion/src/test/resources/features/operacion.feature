¡Excelente! Ahora que tenemos una buena comprensión del programa COBOL, podemos crear un archivo de características en Gherkin para describir el comportamiento del programa.

Aquí te dejo un ejemplo de cómo podríamos escribir el archivo de características en Gherkin:
```gherkin
Característica: Suma de dos números enteros
  Como usuario
  Quiero poder introducir dos números enteros
  Para obtener el resultado de su suma

Escenario: Suma de dos números enteros positivos
  Dado que el usuario introduce el primer número 2
  Y el usuario introduce el segundo número 3
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es 5

Escenario: Suma de dos números enteros negativos
  Dado que el usuario introduce el primer número -2
  Y el usuario introduce el segundo número -3
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es -5

Escenario: Suma de un número entero positivo y otro negativo
  Dado que el usuario introduce el primer número 2
  Y el usuario introduce el segundo número -3
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es -1

Escenario: Introducción de un valor no numérico
  Dado que el usuario introduce el primer número "a"
  Y el usuario introduce el segundo número 2
  Cuando se ejecuta el programa
  Entonces se produce un error
```
En este archivo de características, hemos definido cuatro escenarios diferentes para probar el comportamiento del programa:

1. Suma de dos números enteros positivos
2. Suma de dos números enteros negativos
3. Suma de un número entero positivo y otro negativo
4. Introducción de un valor no numérico

Cada escenario describe el comportamiento esperado del programa en función de las entradas del usuario. El archivo de características se puede utilizar como base para crear pruebas automatizadas que verifiquen el comportamiento del programa.