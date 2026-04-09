Característica: Validación de entrada y rango de valores

Escenario: Validación de entrada de números enteros

* Dado que el usuario introduce un valor no numérico para NUM1
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que el valor no es numérico

Escenario: Validación de entrada de números enteros con rango válido

* Dado que el usuario introduce un valor numérico para NUM1 dentro del rango permitido (por ejemplo, 1000-9999)
* Cuando se ejecuta el programa
* Entonces se realiza la suma correctamente

Escenario: Validación de entrada de números enteros con rango no válido

* Dado que el usuario introduce un valor numérico para NUM1 fuera del rango permitido (por ejemplo, 10000 o -1)
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que el valor está fuera del rango permitido

Escenario: Validación de entrada de números enteros con errores de formato

* Dado que el usuario introduce un valor con errores de formato (por ejemplo, "123abc")
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que el valor no es numérico

Característica: Manejo de errores

Escenario: Manejo de errores de división por cero

* Dado que el usuario introduce un valor de 0 para NUM2
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que no se puede dividir por cero

Escenario: Manejo de errores de entrada/salida

* Dado que ocurre un error de entrada/salida durante la ejecución del programa
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que ocurrió un error de entrada/salida

Característica: Seguridad

Escenario: Validación de entrada para evitar ataques de inyección de código

* Dado que el usuario introduce un valor con código malicioso (por ejemplo, "123; DROP TABLE usuarios;")
* Cuando se ejecuta el programa
* Entonces se muestra un mensaje de error indicando que el valor no es válido

Característica: Documentación

Escenario: Documentación del programa para el usuario

* Dado que el usuario necesita instrucciones sobre cómo utilizar el programa
* Cuando se ejecuta el programa
* Entonces se muestra una pantalla de ayuda con instrucciones claras sobre cómo utilizar el programa