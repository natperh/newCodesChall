Aquí te dejo la traducción del código COBOL a Java, asegurando que se mantengan intactas las reglas de negocio:

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = pedirNumero(scanner, "Introduce el primer número:");
        int num2 = pedirNumero(scanner, "Introduce el segundo número:");

        int resultado = calcularSuma(num1, num2);

        if (resultado != -1) {
            System.out.println("El resultado es " + resultado);
        }
    }

    private static int pedirNumero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = scanner.nextInt();
                if (numero >= 0 && numero <= 9999) {
                    return numero;
                } else {
                    System.out.println("El número debe ser un entero positivo de cuatro dígitos o menos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un número.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }
    }

    private static int calcularSuma(int num1, int num2) {
        int resultado = num1 + num2;
        if (resultado > 99999) {
            System.out.println("El resultado excede los cinco dígitos.");
            return -1;
        }
        return resultado;
    }
}
```

En este código Java, se han mantenido las siguientes reglas de negocio:

*   Se validan los números ingresados para asegurarse de que sean enteros positivos de cuatro dígitos o menos.
*   Se realiza la suma aritmética utilizando la fórmula `RESULTADO = NUM1 + NUM2`.
*   Se muestra un error si el resultado de la suma excede los cinco dígitos.
*   Se manejan errores de forma explícita utilizando bloques `try-catch` para evitar que el programa se detenga en caso de errores.

Espero que esto te sea útil. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!