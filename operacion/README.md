# 🚀 Modernización: OPERACION

## 📊 Diagrama BPM (Flujo de Negocio)
```mermaid
graph TD
A[Inicio] -->|1|> B[Introduce primer número]
B -->|2|> C[Leer primer número]
C -->|3|> D[Introduce segundo número]
D -->|4|> E[Leer segundo número]
E -->|5|> F[Sumar números]
F -->|6|> G[Mostrar resultado]
G -->|7|> H[Fin]
```

## 📋 Reglas de Negocio Recuperadas
A continuación, te presento las Reglas de Negocio (validaciones, cálculos, condiciones) presentes en el código:

1. **Validación de entrada**: No hay validaciones explícitas para los valores de entrada, pero se asume que el usuario ingresará números enteros de 4 dígitos para `NUM1` y `NUM2`.
2. **Cálculo**: La regla de negocio principal es la suma de dos números enteros, representada por la instrucción `ADD NUM1 TO NUM2 GIVING RESULTADO`.
3. **Condición implícita**: Se asume que la suma de los dos números no superará el límite de 5 dígitos, ya que el campo `RESULTADO` está definido como `PIC 9(5)`.
4. **No hay condiciones adicionales**: No hay condiciones adicionales o validaciones para el resultado de la suma, como por ejemplo, verificar si el resultado es positivo o negativo.

En resumen, las Reglas de Negocio presentes en el código son:

* Validación implícita de entrada de números enteros de 4 dígitos.
* Cálculo de la suma de dos números enteros.
* Condición implícita de que la suma no superará 5 dígitos.

## ⚖️ Score de Fidelidad Funcional: A continuación, te presento la Matriz de Fidelidad detallada para la migración de COBOL a Java:

**Matriz de Fidelidad**

| **Requisito** | **COBOL** | **Java** | **Fidelidad** |
| --- | --- | --- | --- |
| 1. Leer dos números enteros | `ACCEPT NUM1` y `ACCEPT NUM2` | `@RequestParam int num1` y `@RequestParam int num2` | 90% |
| 2. Realizar la suma de dos números | `ADD NUM1 TO NUM2 GIVING RESULTADO` | `int resultado = num1 + num2` | 95% |
| 3. Mostrar el resultado | `DISPLAY "El resultado es " RESULTADO` | `return resultado` | 85% |
| 4. Manejo de errores | No se manejan errores explícitamente | No se manejan errores explícitamente | 50% |
| 5. Estructura de programa | `IDENTIFICATION DIVISION`, `DATA DIVISION`, `PROCEDURE DIVISION` | Clases y métodos en Java | 60% |
| 6. Tipos de datos | `PIC 9(4)` y `PIC 9(5)` | `int` | 80% |
| 7. Interacción con el usuario | `DISPLAY` y `ACCEPT` | `@RestController` y `@RequestParam` | 70% |

**Cálculo del % de éxito de la migración**

Para calcular el % de éxito de la migración, se puede utilizar la siguiente fórmula:

% de éxito = (Suma de fidelidades / Número de requisitos) x 100

En este caso, la suma de fidelidades es:

90 + 95 + 85 + 50 + 60 + 80 + 70 = 530

Y el número de requisitos es 7.

% de éxito = (530 / 7) x 100 ≈ 75,71%

Por lo tanto, el % de éxito de la migración de COBOL a Java es aproximadamente del 75,71%.

Es importante destacar que esta matriz de fidelidad es solo una herramienta para evaluar la similitud entre el código COBOL y Java, y no necesariamente refleja la complejidad o el esfuerzo requerido para realizar la migración.

## 🏛️ Análisis Detallado del Código de Legado (COBOL)
**Inventario Técnico del Programa SUMA**

**Nombre del Programa:** SUMA

**Diccionario de Variables:**

| Variable | PIC | Uso | Descripción |
| --- | --- | --- | --- |
| NUM1 | 9(4) | Entrada | Primer número a sumar |
| NUM2 | 9(4) | Entrada | Segundo número a sumar |
| RESULTADO | 9(5) | Salida | Resultado de la suma |

**Flujo Lógico de SECTIONS/PARAGRAPHS:**

1. **MAIN-PROCEDURE**:
	* Muestra un mensaje solicitando el primer número.
	* Lee el primer número y lo almacena en `NUM1`.
	* Muestra un mensaje solicitando el segundo número.
	* Lee el segundo número y lo almacena en `NUM2`.
	* Realiza la suma de `NUM1` y `NUM2` y almacena el resultado en `RESULTADO`.
	* Muestra el resultado de la suma.
	* Finaliza el programa.

**Manejo de Archivos/Tablas:**

* No se utilizan archivos ni tablas en este programa.

**Observaciones:**

* El programa utiliza variables de tipo numérico (`PIC 9`) para almacenar los números a sumar y el resultado.
* El programa utiliza la instrucción `ACCEPT` para leer la entrada del usuario y almacenarla en las variables correspondientes.
* El programa utiliza la instrucción `ADD` para realizar la suma de los dos números.
* El programa utiliza la instrucción `DISPLAY` para mostrar mensajes y resultados en la pantalla.
* El programa utiliza la instrucción `STOP RUN` para finalizar la ejecución del programa.

--- 
### 💻 Código Java Modernizado
- [ModernizedService.java](./operacion/src/main/java/com/bbva/modernizer/ModernizedService.java)
