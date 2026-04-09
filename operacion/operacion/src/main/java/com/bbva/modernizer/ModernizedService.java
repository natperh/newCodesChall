Aquí te dejo el código Java 17 que realiza la misma función que el programa COBOL SUMA:

```java
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado es " + resultado);

        scanner.close();
    }
}
```

Este código utiliza la clase `Scanner` para leer la entrada del usuario y realizar la suma de los dos números introducidos. El resultado se muestra en pantalla utilizando `System.out.println`.