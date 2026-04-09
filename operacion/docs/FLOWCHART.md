# 📊 Diagrama de Flujo Lógico

Este diagrama representa las decisiones de negocio del programa.

```mermaid
Aquí te presento el diagrama Mermaid (graph TD) que representa el proceso de suma de dos números según las reglas proporcionadas:
```mermaid
graph TD
    A[Inicio] -->|SÍ|> B[Ingresar NUM1]
    B -->|Cumple|> C[Validar NUM1]
    C -->|SÍ|> D[Ingresar NUM2]
    D -->|Cumple|> E[Validar NUM2]
    E -->|SÍ|> F[Realizar suma]
    F -->|Cumple|> G[Mostrar resultado]
    G -->|SÍ|> H[Fin]

    C -->|NO|> I[Error: NUM1 no válido]
    E -->|NO|> J[Error: NUM2 no válido]
    F -->|NO|> K[Error: Resultado excede 5 dígitos]

    I -->|NO|> H
    J -->|NO|> H
    K -->|NO|> H
```
En este diagrama, se representan los siguientes pasos:

1. Inicio (A): Se inicia el proceso.
2. Ingresar NUM1 (B): Se solicita al usuario que ingrese el primer número.
3. Validar NUM1 (C): Se verifica si NUM1 es un número entero de cuatro dígitos.
	* Si cumple, se pasa al siguiente paso.
	* Si no cumple, se muestra un error y se finaliza el proceso.
4. Ingresar NUM2 (D): Se solicita al usuario que ingrese el segundo número.
5. Validar NUM2 (E): Se verifica si NUM2 es un número entero de cuatro dígitos.
	* Si cumple, se pasa al siguiente paso.
	* Si no cumple, se muestra un error y se finaliza el proceso.
6. Realizar suma (F): Se realiza la suma de NUM1 y NUM2.
	* Si el resultado no excede los 5 dígitos, se pasa al siguiente paso.
	* Si el resultado excede los 5 dígitos, se muestra un error y se finaliza el proceso.
7. Mostrar resultado (G): Se muestra el resultado de la suma.
8. Fin (H): Se finaliza el proceso.

Espero que este diagrama sea fácil de entender para un perfil no técnico. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!
```