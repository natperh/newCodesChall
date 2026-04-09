Aquí tienes los JUnit 5 con nombres de métodos que describen la regla de negocio que prueban:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {

    @Test
    public void testPedirNumero_DebeRetornarNumeroValido() {
        // Arrange
        Scanner scanner = new Scanner("1234");

        // Act
        int resultado = Suma.pedirNumero(scanner, "Introduce el primer número:");

        // Assert
        assertEquals(1234, resultado);
    }

    @Test
    public void testPedirNumero_DebeMostrarErrorSiNumeroNoEsValido() {
        // Arrange
        Scanner scanner = new Scanner("12345");

        // Act y Assert
        assertThrows(InputMismatchException.class, () -> Suma.pedirNumero(scanner, "Introduce el primer número:"));
    }

    @Test
    public void testCalcularSuma_DebeRetornarResultadoCorrecto() {
        // Arrange
        int num1 = 1234;
        int num2 = 5678;

        // Act
        int resultado = Suma.calcularSuma(num1, num2);

        // Assert
        assertEquals(6912, resultado);
    }

    @Test
    public void testCalcularSuma_DebeRetornarErrorSiResultadoExcedeCincoDigitos() {
        // Arrange
        int num1 = 99999;
        int num2 = 1;

        // Act y Assert
        assertEquals(-1, Suma.calcularSuma(num1, num2));
    }
}
```

En este código, se han creado cuatro pruebas unitarias para verificar las reglas de negocio:

*   `testPedirNumero_DebeRetornarNumeroValido`: Verifica que el método `pedirNumero` retorne un número válido cuando se ingresa un número entero positivo de cuatro dígitos o menos.
*   `testPedirNumero_DebeMostrarErrorSiNumeroNoEsValido`: Verifica que el método `pedirNumero` muestre un error cuando se ingresa un número que no es válido (por ejemplo, un número con más de cuatro dígitos).
*   `testCalcularSuma_DebeRetornarResultadoCorrecto`: Verifica que el método `calcularSuma` retorne el resultado correcto cuando se suman dos números enteros positivos.
*   `testCalcularSuma_DebeRetornarErrorSiResultadoExcedeCincoDigitos`: Verifica que el método `calcularSuma` retorne un error cuando el resultado de la suma excede los cinco dígitos.