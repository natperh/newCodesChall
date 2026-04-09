A continuación, te presento los escenarios Gherkin (.feature) para el programa de suma de dos números enteros:

**Suma.feature**
```gherkin
Característica: Suma de dos números enteros
  Como usuario
  Quiero introducir dos números enteros
  Para obtener el resultado de su suma

Escenario: Suma de dos números enteros válidos
  Dado que el usuario introduce el primer número 10
  Y el usuario introduce el segundo número 20
  Cuando se calcula la suma
  Entonces el resultado es 30

Escenario: Suma de dos números enteros con máximo de 4 dígitos
  Dado que el usuario introduce el primer número 9999
  Y el usuario introduce el segundo número 1
  Cuando se calcula la suma
  Entonces el resultado es 10000

Escenario: Suma de dos números enteros con resultado de máximo de 5 dígitos
  Dado que el usuario introduce el primer número 99999
  Y el usuario introduce el segundo número 1
  Cuando se calcula la suma
  Entonces el resultado es 100000

Escenario: Introducción de un valor no numérico
  Dado que el usuario introduce el primer número "a"
  Y el usuario introduce el segundo número 20
  Cuando se calcula la suma
  Entonces se muestra un mensaje de error "Valor no numérico"

Escenario: Introducción de un valor numérico con más de 4 dígitos
  Dado que el usuario introduce el primer número 100000
  Y el usuario introduce el segundo número 20
  Cuando se calcula la suma
  Entonces se muestra un mensaje de error "Valor demasiado grande"
```
Estos escenarios cubren los siguientes casos:

* Suma de dos números enteros válidos
* Suma de dos números enteros con máximo de 4 dígitos
* Suma de dos números enteros con resultado de máximo de 5 dígitos
* Introducción de un valor no numérico
* Introducción de un valor numérico con más de 4 dígitos

Es importante mencionar que, como se mencionó en el contexto, no se manejan excepciones explícitamente en este programa, por lo que los escenarios de error se limitan a mostrar un mensaje de error. En un programa real, se deberían manejar excepciones para evitar errores inesperados.