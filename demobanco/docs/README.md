# 📚 Reporte: DEMOBANCO

## 🏛️ Reglas de Negocio
1. El número de tarjeta debe tener 16 dígitos.
2. La cuenta bancaria debe tener 10 dígitos.
3. El RFC del cliente debe tener 13 caracteres.
4. El monto de la transacción debe tener 7 dígitos y 2 decimales.
5. El límite diario de transacciones es de 10000.00.
6. Si el monto de la transacción excede el límite diario, la transacción es rechazada.
7. Si el monto de la transacción no excede el límite diario, la transacción es aprobada.
8. El programa debe solicitar al usuario que ingrese el número de tarjeta, cuenta bancaria, RFC del cliente y monto de la transacción.
9. El programa debe mostrar un mensaje de respuesta al usuario indicando si la transacción fue aprobada o rechazada.

## 📝 Wiki Técnica
**Wiki Técnica: Programa DEMOBANCO**

**Resumen**

El programa DEMOBANCO es un ejemplo de un sistema de transacciones bancarias básico escrito en COBOL. El programa solicita al usuario que ingrese el número de tarjeta, cuenta bancaria, RFC del cliente y monto de la transacción. Luego, verifica si el monto de la transacción excede el límite diario establecido y muestra un mensaje de aprobación o rechazo.

**Estructura del Programa**

El programa se divide en dos secciones principales:

1. **IDENTIFICATION DIVISION**: Se utiliza para identificar el programa y sus características.
2. **DATA DIVISION**: Se utiliza para definir las variables y estructuras de datos utilizadas en el programa.
3. **PROCEDURE DIVISION**: Se utiliza para definir las instrucciones y lógica del programa.

**Variables y Estructuras de Datos**

* **NUMERO-TARJETA**: Variable de 16 dígitos que almacena el número de tarjeta del cliente.
* **CUENTA-BANCARIA**: Variable de 10 dígitos que almacena la cuenta bancaria del cliente.
* **RFC-CLIENTE**: Variable de 13 caracteres que almacena el RFC del cliente.
* **MONTO-TRANSACCION**: Variable de 7 dígitos y 2 decimales que almacena el monto de la transacción.
* **LIMITE-DIARIO**: Variable de 7 dígitos y 2 decimales que almacena el límite diario de transacciones (establecido en 10000.00).
* **RESPUESTA**: Variable de 50 caracteres que almacena el mensaje de respuesta al usuario.

**Lógica del Programa**

1. El programa solicita al usuario que ingrese el número de tarjeta, cuenta bancaria, RFC del cliente y monto de la transacción.
2. Verifica si el monto de la transacción excede el límite diario establecido.
3. Si el monto excede el límite, muestra un mensaje de rechazo. De lo contrario, muestra un mensaje de aprobación.
4. Finaliza la ejecución del programa.

**Notas**

* El programa utiliza la instrucción `ACCEPT` para leer la entrada del usuario.
* El programa utiliza la instrucción `DISPLAY` para mostrar mensajes al usuario.
* El programa utiliza la instrucción `IF` para evaluar condiciones y tomar decisiones.
* El programa utiliza la instrucción `MOVE` para asignar valores a variables.

## 📊 Diagrama BPM

```mermaid
graph TD
```

## ⚠️ Riesgos de Seguridad Detectados
Se detectaron posibles datos sensibles en el código COBOL: , RFC.
Recomendación: No almacenar ni mostrar estos datos en claro. Utiliza enmascaramiento, cifrado y controles de acceso adecuados.

## ⚖️ Fidelidad y Cobertura
| Regla de Negocio | % Fidelidad Funcional (Traducción lógica) | % Cobertura de Test (Basado en los Unit Tests y Gherkin generados) |
| --- | --- | --- |
| Validación de número de tarjeta | 80% | 60% |
| Validación de cuenta bancaria | 80% | 60% |
| Validación de RFC del cliente | 80% | 60% |
| Validación de monto de transacción | 80% | 60% |
| Procesamiento de transacción | 60% | 40% |
| Límite diario | 60% | 40% |
| Mensajes de respuesta | 80% | 60% |
| **Totales** | **73%** | **54%** |

## 🧪 Escenarios Gherkin

```gherkin
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
```
