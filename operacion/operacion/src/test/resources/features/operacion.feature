¡Excelente! Ahora que tenemos la documentación del programa COBOL, podemos crear un archivo de características (`.feature`) en Gherkin para describir el comportamiento del programa.

Aquí te dejo un ejemplo de cómo podría ser el archivo `.feature`:
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

Escenario: Suma de dos números enteros con más de 4 dígitos
  Dado que el usuario introduce el primer número 1234
  Y el usuario introduce el segundo número 5678
  Cuando se ejecuta el programa
  Entonces el resultado de la suma es 6912
```
En este archivo `.feature`, hemos definido cuatro escenarios que cubren diferentes casos de uso del programa:

1. Suma de dos números enteros positivos.
2. Suma de dos números enteros negativos.
3. Suma de un número entero positivo y otro negativo.
4. Suma de dos números enteros con más de 4 dígitos.

Cada escenario se compone de tres secciones:

* `Dado`: describe la situación inicial, es decir, los valores que se introducen como entrada.
* `Cuando`: describe la acción que se ejecuta, en este caso, la ejecución del programa.
* `Entonces`: describe el resultado esperado.

Estos escenarios pueden ser utilizados como base para crear pruebas automatizadas que verifiquen el comportamiento del programa COBOL.