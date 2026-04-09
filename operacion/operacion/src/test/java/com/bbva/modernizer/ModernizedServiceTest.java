Aquí tienes el código de la clase de prueba JUnit 5 para el servicio `SumaService`:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaServiceTest {

    @Test
    public void testSumaDosNumerosPositivos() {
        // Configuración
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        // Ejecución
        int resultado = SumaService.suma(num1, num2);

        // Verificación
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumaDosNumerosNegativos() {
        // Configuración
        int num1 = -5;
        int num2 = -7;
        int resultadoEsperado = -12;

        // Ejecución
        int resultado = SumaService.suma(num1, num2);

        // Verificación
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumaNumeroPositivoYNegativo() {
        // Configuración
        int num1 = 5;
        int num2 = -7;
        int resultadoEsperado = -2;

        // Ejecución
        int resultado = SumaService.suma(num1, num2);

        // Verificación
        assertEquals(resultadoEsperado, resultado);
    }
}
```

Para que la clase de prueba funcione correctamente, debes modificar la clase `SumaService` para que tenga un método `suma` que reciba dos números enteros y devuelva el resultado de la suma. Aquí tienes el código modificado de la clase `SumaService`:

```java
public class SumaService {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

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
        int resultado = suma(num1, num2);

        // Mostrar el resultado de la suma
        System.out.println("El resultado es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
```

Ahora puedes ejecutar las pruebas JUnit 5 para verificar que el servicio `SumaService` funcione correctamente.