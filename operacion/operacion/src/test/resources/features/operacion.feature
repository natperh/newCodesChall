Aquí te dejo un ejemplo de un archivo `.feature` con escenarios Given/When/Then para el programa SUMA:
```
Característica: Programa SUMA
  Como usuario
  Quiero realizar una suma de dos números enteros
  Para obtener el resultado de la operación

Escenario: Suma de dos números positivos
  Dado que el usuario introduce el primer número 2
  Y el usuario introduce el segundo número 3
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es 5

Escenario: Suma de dos números negativos
  Dado que el usuario introduce el primer número -2
  Y el usuario introduce el segundo número -3
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es -5

Escenario: Suma de un número positivo y un número negativo
  Dado que el usuario introduce el primer número 2
  Y el usuario introduce el segundo número -3
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es -1

Escenario: Suma de dos números con decimales
  Dado que el usuario introduce el primer número 2.5
  Y el usuario introduce el segundo número 3.7
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es 6.2

Escenario: Suma de dos números con errores de entrada
  Dado que el usuario introduce el primer número "a"
  Y el usuario introduce el segundo número 3
  Cuando se ejecuta el programa SUMA
  Entonces se muestra un mensaje de error "Entrada no válida"
```
En este ejemplo, se definen cinco escenarios diferentes para probar el programa SUMA:

* Suma de dos números positivos
* Suma de dos números negativos
* Suma de un número positivo y un número negativo
* Suma de dos números con decimales
* Suma de dos números con errores de entrada

Cada escenario se define con una serie de pasos Given/When/Then, que describen la situación inicial, la acción que se ejecuta y el resultado esperado.