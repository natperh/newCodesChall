Archivo .feature

Característica: Validación de entrada y manejo de errores en el programa COBOL

  Escenario: Validación de entrada de números enteros positivos
    Dado que el usuario introduce un número entero positivo
    Cuando el programa verifica la entrada
    Entonces el programa debe aceptar el número y continuar con la ejecución

  Escenario: Validación de entrada de números no válidos
    Dado que el usuario introduce un número no válido (por ejemplo, un número negativo o un carácter no numérico)
    Cuando el programa verifica la entrada
    Entonces el programa debe mostrar un mensaje de error y solicitar al usuario que introduzca un número válido

  Escenario: Rango de números
    Dado que el usuario introduce un número mayor que 9999
    Cuando el programa verifica la entrada
    Entonces el programa debe mostrar un mensaje de error y solicitar al usuario que introduzca un número dentro del rango permitido

  Escenario: Suma de números
    Dado que el usuario introduce dos números enteros
    Cuando el programa realiza la suma de los dos números
    Entonces el programa debe mostrar el resultado de la suma

  Escenario: Manejo de errores durante la ejecución
    Dado que ocurre un error durante la ejecución del programa (por ejemplo, un error de división por cero)
    Cuando el programa maneja el error
    Entonces el programa debe mostrar un mensaje de error y continuar con la ejecución

  Escenario: Medidas de seguridad
    Dado que un usuario malintencionado intenta introducir un número que pueda causar un error o una vulnerabilidad en el sistema
    Cuando el programa verifica la entrada
    Entonces el programa debe detectar y bloquear la entrada no segura