Archivo .feature

Característica: Suma de dos números enteros

Escenario: Validación de entrada

* Dado que el usuario introduce un valor no numérico
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que la entrada no es válida

Escenario: Rango de valores

* Dado que el usuario introduce un valor que excede el rango permitido (5 dígitos)
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que el valor está fuera del rango permitido

Escenario: Manejo de errores

* Dado que ocurre un error durante la ejecución del programa (división por cero)
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que ha ocurrido un error y se recupera el programa de manera adecuada

Escenario: Seguridad

* Dado que un usuario malintencionado intenta introducir un valor no numérico o un valor fuera del rango permitido
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que la entrada no es válida y se evita cualquier vulnerabilidad en el sistema

Escenario: Requisitos de precisión

* Dado que el resultado de la suma excede el rango permitido (6 dígitos)
* Cuando se ejecuta el programa
* Entonces se muestra el resultado con la precisión adecuada (redondeado o truncado según sea necesario)