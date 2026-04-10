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

Escenario: Ingresar monto de transacción que excede el límite diario
  Dado que el monto de la transacción es "10001.00"
  Cuando se ingresa el monto de la transacción
  Entonces el sistema debe rechazar la transacción

Escenario: Ingresar monto de transacción que no excede el límite diario
  Dado que el monto de la transacción es "500.00"
  Cuando se ingresa el monto de la transacción
  Entonces el sistema debe aprobar la transacción

Escenario: Mostrar resultado de la transacción
  Dado que la transacción ha sido aprobada o rechazada
  Cuando se muestra el resultado de la transacción
  Entonces el sistema debe mostrar el resultado de la transacción al usuario