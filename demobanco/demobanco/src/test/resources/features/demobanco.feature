Característica: Realizar transacciones bancarias

Escenario: Transacción aprobada
Dado que el número de tarjeta es "1234567890123456"
Y la cuenta bancaria es "1234567890"
Y el RFC del cliente es "ABC123456ABC"
Y el monto de la transacción es "1000.00"
Cuando se realiza la transacción
Entonces el mensaje de respuesta es "Transacción aprobada"

Escenario: Transacción rechazada por límite diario excedido
Dado que el número de tarjeta es "1234567890123456"
Y la cuenta bancaria es "1234567890"
Y el RFC del cliente es "ABC123456ABC"
Y el monto de la transacción es "15000.00"
Cuando se realiza la transacción
Entonces el mensaje de respuesta es "Transacción rechazada: límite diario excedido"

Escenario: Número de tarjeta inválido
Dado que el número de tarjeta es "123456789012345"
Y la cuenta bancaria es "1234567890"
Y el RFC del cliente es "ABC123456ABC"
Y el monto de la transacción es "1000.00"
Cuando se realiza la transacción
Entonces el mensaje de respuesta es "Número de tarjeta inválido"

Escenario: Cuenta bancaria inválida
Dado que el número de tarjeta es "1234567890123456"
Y la cuenta bancaria es "123456789"
Y el RFC del cliente es "ABC123456ABC"
Y el monto de la transacción es "1000.00"
Cuando se realiza la transacción
Entonces el mensaje de respuesta es "Cuenta bancaria inválida"

Escenario: RFC del cliente inválido
Dado que el número de tarjeta es "1234567890123456"
Y la cuenta bancaria es "1234567890"
Y el RFC del cliente es "ABC123456AB"
Y el monto de la transacción es "1000.00"
Cuando se realiza la transacción
Entonces el mensaje de respuesta es "RFC del cliente inválido"

Escenario: Monto de transacción inválido
Dado que el número de tarjeta es "1234567890123456"
Y la cuenta bancaria es "1234567890"
Y el RFC del cliente es "ABC123456ABC"
Y el monto de la transacción es "1000"
Cuando se realiza la transacción
Entonces el mensaje de respuesta es "Monto de transacción inválido"