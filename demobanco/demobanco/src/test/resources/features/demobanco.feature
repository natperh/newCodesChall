Característica: Realizar transacciones bancarias

  Escenario: Ingresar información de tarjeta válida
    Dado que el número de tarjeta es "1234567890123456"
    Y la cuenta bancaria es "1234567890"
    Y el RFC del cliente es "ABC123456ABC1"
    Y el monto de la transacción es "1000.00"
    Y el límite diario es "10000.00"
    Cuando se realiza la transacción
    Entonces el resultado de la transacción es "Aprobada"

  Escenario: Ingresar información de tarjeta con monto que excede el límite diario
    Dado que el número de tarjeta es "1234567890123456"
    Y la cuenta bancaria es "1234567890"
    Y el RFC del cliente es "ABC123456ABC1"
    Y el monto de la transacción es "15000.00"
    Y el límite diario es "10000.00"
    Cuando se realiza la transacción
    Entonces el resultado de la transacción es "Rechazada"

  Escenario: Ingresar información de tarjeta con número de tarjeta inválido
    Dado que el número de tarjeta es "123456789012345"
    Y la cuenta bancaria es "1234567890"
    Y el RFC del cliente es "ABC123456ABC1"
    Y el monto de la transacción es "1000.00"
    Y el límite diario es "10000.00"
    Cuando se realiza la transacción
    Entonces se muestra un mensaje de error "Número de tarjeta inválido"

  Escenario: Ingresar información de tarjeta con cuenta bancaria inválida
    Dado que el número de tarjeta es "1234567890123456"
    Y la cuenta bancaria es "123456789"
    Y el RFC del cliente es "ABC123456ABC1"
    Y el monto de la transacción es "1000.00"
    Y el límite diario es "10000.00"
    Cuando se realiza la transacción
    Entonces se muestra un mensaje de error "Cuenta bancaria inválida"

  Escenario: Ingresar información de tarjeta con RFC inválido
    Dado que el número de tarjeta es "1234567890123456"
    Y la cuenta bancaria es "1234567890"
    Y el RFC del cliente es "ABC123456ABC"
    Y el monto de la transacción es "1000.00"
    Y el límite diario es "10000.00"
    Cuando se realiza la transacción
    Entonces se muestra un mensaje de error "RFC inválido"

  Escenario: Ingresar información de tarjeta con monto inválido
    Dado que el número de tarjeta es "1234567890123456"
    Y la cuenta bancaria es "1234567890"
    Y el RFC del cliente es "ABC123456ABC1"
    Y el monto de la transacción es "abc"
    Y el límite diario es "10000.00"
    Cuando se realiza la transacción
    Entonces se muestra un mensaje de error "Monto inválido"