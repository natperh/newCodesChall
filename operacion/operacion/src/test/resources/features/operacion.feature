Archivo .feature:

Característica: Suma de dos números enteros

  Escenario: Validación de entrada
    Dado que el usuario introduce un valor no numérico
    Cuando se ejecuta el programa
    Entonces se muestra un mensaje de error "Valor no numérico"

  Escenario: Validación de entrada
    Dado que el usuario introduce un número con decimales
    Cuando se ejecuta el programa
    Entonces se muestra un mensaje de error "Valor no entero"

  Escenario: Rango de valores
    Dado que el usuario introduce un número mayor que 9999
    Cuando se ejecuta el programa
    Entonces se muestra un mensaje de error "Valor fuera de rango"

  Escenario: Suma y desbordamiento
    Dado que la suma de los dos números enteros supera el rango de valores permitidos
    Cuando se ejecuta el programa
    Entonces se muestra un mensaje de error "Desbordamiento"

  Escenario: Precisión y redondeo
    Dado que se requiere una precisión específica para el resultado
    Cuando se ejecuta el programa
    Entonces se redondea el resultado a un número determinado de decimales

  Escenario: Seguridad y autenticación
    Dado que se requiere una autenticación específica para utilizar el programa
    Cuando se ejecuta el programa sin autenticación
    Entonces se muestra un mensaje de error "Acceso denegado"