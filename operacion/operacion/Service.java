Aquí te dejo la traducción del programa de suma de COBOL a Java:

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = pedirNumero(scanner, "Introduce el primer número:");
        int num2 = pedirNumero(scanner, "Introduce el segundo número:");

        int resultado = calcularSuma(num1, num2);

        System.out.println("El resultado es " + resultado);
    }

    private static int pedirNumero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = scanner.nextInt();
                if (numero < 0 || numero > 9999) {
                    System.out.println("El número debe ser un entero positivo de hasta 4 dígitos.");
                } else {
                    return numero;
                }
            } catch (InputMismatchException e) {
                System.out.println("El número debe ser un entero.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }
    }

    private static int calcularSuma(int num1, int num2) {
        return num1 + num2;
    }
}
```

En este código Java, se utiliza un `Scanner` para leer la entrada del usuario y se definen dos métodos: `pedirNumero` para solicitar un número al usuario y validar que sea un entero positivo de hasta 4 dígitos, y `calcularSuma` para calcular la suma de dos números.

El programa principal (`main`) utiliza estos métodos para solicitar dos números al usuario, calcular su suma y mostrar el resultado.

Es importante destacar que, al igual que en el programa COBOL, se realizan validaciones para asegurarse de que los números ingresados sean válidos. Si el usuario ingresa un número no válido, se muestra un mensaje de error y se solicita que ingrese el número nuevamente.