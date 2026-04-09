Aquí te dejo un ejemplo de un archivo `.feature` con escenarios Given/When/Then para el programa SUMA en COBOL:
```
Característica: Programa SUMA en COBOL
  Como usuario del programa SUMA
  Quiero realizar la suma de dos números enteros
  Para obtener el resultado de la suma

Escenario: Suma de dos números enteros
  Dado que el programa SUMA está ejecutándose
  Cuando el usuario introduce el primer número "2"
  Y el usuario introduce el segundo número "3"
  Entonces el programa muestra el resultado de la suma "5"

Escenario: Suma de dos números enteros con resultado negativo
  Dado que el programa SUMA está ejecutándose
  Cuando el usuario introduce el primer número "-2"
  Y el usuario introduce el segundo número "3"
  Entonces el programa muestra el resultado de la suma "1"

Escenario: Suma de dos números enteros con resultado cero
  Dado que el programa SUMA está ejecutándose
  Cuando el usuario introduce el primer número "0"
  Y el usuario introduce el segundo número "0"
  Entonces el programa muestra el resultado de la suma "0"

Escenario: Error al introducir un número no entero
  Dado que el programa SUMA está ejecutándose
  Cuando el usuario introduce el primer número "a"
  Entonces el programa muestra un mensaje de error "Error: el valor introducido no es un número entero"

Escenario: Error al introducir un número no entero en el segundo número
  Dado que el programa SUMA está ejecutándose
  Cuando el usuario introduce el primer número "2"
  Y el usuario introduce el segundo número "b"
  Entonces el programa muestra un mensaje de error "Error: el valor introducido no es un número entero"
```
En este archivo, se definen cuatro escenarios:

1. Suma de dos números enteros: se prueba que el programa SUMA realice correctamente la suma de dos números enteros.
2. Suma de dos números enteros con resultado negativo: se prueba que el programa SUMA realice correctamente la suma de dos números enteros con resultado negativo.
3. Suma de dos números enteros con resultado cero: se prueba que el programa SUMA realice correctamente la suma de dos números enteros con resultado cero.
4. Error al introducir un número no entero: se prueba que el programa SUMA muestre un mensaje de error cuando el usuario introduce un valor no entero.

Cada escenario se define con una serie de pasos Given/When/Then, que describen las condiciones iniciales, las acciones que se realizan y los resultados esperados.