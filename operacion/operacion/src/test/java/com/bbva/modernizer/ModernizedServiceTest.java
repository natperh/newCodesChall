Aquí tienes el código de las pruebas unitarias para la clase `Suma` utilizando JUnit 5:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {

    @Test
    public void testSumaPositivos() {
        // Arrange
        int num1 = 5;
        int num2 = 7;
        int esperado = 12;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSumaNegativos() {
        // Arrange
        int num1 = -5;
        int num2 = -7;
        int esperado = -12;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSumaMixtos() {
        // Arrange
        int num1 = 5;
        int num2 = -7;
        int esperado = -2;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSumaCero() {
        // Arrange
        int num1 = 0;
        int num2 = 0;
        int esperado = 0;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(esperado, resultado);
    }
}
```

Y aquí tienes el código modificado de la clase `Suma` para que sea testeable:

```java
public class Suma {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = suma(num1, num2);

        System.out.println("El resultado es " + resultado);

        scanner.close();
    }
}
```