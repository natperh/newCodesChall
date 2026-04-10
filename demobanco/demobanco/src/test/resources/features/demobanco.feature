Característica: Realizar transacciones bancarias

Escenario: Ingresar número de tarjeta válido
  Dado que el número de tarjeta es "1234567890123456"
  Cuando se ingresa el número de tarjeta
  Entonces el sistema debe aceptar el número de tarjeta

Escenario: Ingresar cuenta bancaria válida
  Dado que la cuenta bancaria es "1234567890"
  Cuando se ingresa la cuenta bancaria
  Entonces el sistema debe aceptar la cuenta bancaria

Escenario: Ingresar RFC válido
  Dado que el RFC es "ABC123456ABC1"
  Cuando se ingresa el RFC
  Entonces el sistema debe aceptar el RFC

Escenario: Ingresar monto de transacción válido
  Dado que el monto de la transacción es "1000.00"
  Cuando se ingresa el monto de la transacción
  Entonces el sistema debe aceptar el monto de la transacción

Escenario: Ingresar límite diario válido
  Dado que el límite diario es "10000.00"
  Cuando se ingresa el límite diario
  Entonces el sistema debe aceptar el límite diario

Escenario: Transacción rechazada por monto mayor al límite diario
  Dado que el monto de la transacción es "15000.00"
  Y el límite diario es "10000.00"
  Cuando se realiza la transacción
  Entonces el sistema debe rechazar la transacción
  Y mostrar el mensaje "Transacción rechazada: monto mayor al límite diario"

Escenario: Transacción aprobada por monto menor o igual al límite diario
  Dado que el monto de la transacción es "5000.00"
  Y el límite diario es "10000.00"
  Cuando se realiza la transacción
  Entonces el sistema debe aprobar la transacción
  Y mostrar el mensaje "Transacción aprobada"