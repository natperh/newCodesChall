Aquí te dejo un ejemplo de un archivo `.feature` con escenarios Given/When/Then para el programa SUMA:
```
Característica: Programa SUMA
  Como usuario
  Quiero realizar la suma de dos números enteros
  Para obtener el resultado de la suma

Escenario: Suma de dos números enteros positivos
  Dado que el usuario introduce el número 1 como 2
  Y el usuario introduce el número 2 como 3
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es 5

Escenario: Suma de dos números enteros negativos
  Dado que el usuario introduce el número 1 como -2
  Y el usuario introduce el número 2 como -3
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es -5

Escenario: Suma de un número entero positivo y un número entero negativo
  Dado que el usuario introduce el número 1 como 2
  Y el usuario introduce el número 2 como -3
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es -1

Escenario: Suma de dos números enteros con más de 4 dígitos
  Dado que el usuario introduce el número 1 como 12345
  Y el usuario introduce el número 2 como 67890
  Cuando se ejecuta el programa SUMA
  Entonces el resultado de la suma es 80235

Escenario: Error al introducir un número no entero
  Dado que el usuario introduce el número 1 como "a"
  Y el usuario introduce el número 2 como 2
  Cuando se ejecuta el programa SUMA
  Entonces se muestra un mensaje de error "Error: el número introducido no es un número entero"
```
En este archivo, se definen cinco escenarios diferentes para probar el programa SUMA:

* La suma de dos números enteros positivos
* La suma de dos números enteros negativos
* La suma de un número entero positivo y un número entero negativo
* La suma de dos números enteros con más de 4 dígitos
* Error al introducir un número no entero

Cada escenario se define con una serie de pasos Given/When/Then, que describen las condiciones iniciales, las acciones que se realizan y los resultados esperados.