Aquí te dejo el servicio Java 17 puro que realiza la suma de dos números enteros introducidos por el usuario y muestra el resultado en pantalla:

```java
import java.util.Scanner;

public class SumaService {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar mensaje para introducir el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        // Mostrar mensaje para introducir el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar la suma de los números
        int resultado = num1 + num2;

        // Mostrar el resultado de la suma
        System.out.println("El resultado es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
```

Este servicio utiliza la clase `Scanner` para leer la entrada del usuario y realizar la suma de los números introducidos. El resultado se muestra en pantalla utilizando la clase `System.out`.