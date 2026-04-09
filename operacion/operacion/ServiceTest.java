Aquí tienes un ejemplo de cómo podrías escribir pruebas unitarias para el código Java utilizando JUnit 5:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumaTest {

    @Test
    public void testPedirNumeroValido() {
        // Configuración
        Scanner scanner = new Scanner("1234");

        // Ejecución
        int numero = Suma.pedirNumero(scanner, "Introduce un número:");

        // Verificación
        assertEquals(1234, numero);
    }

    @Test
    public void testPedirNumeroInvalido() {
        // Configuración
        Scanner scanner = new Scanner("abc");

        // Ejecución y verificación
        assertThrows(InputMismatchException.class, () -> Suma.pedirNumero(scanner, "Introduce un número:"));
    }

    @Test
    public void testPedirNumeroFueraDeRango() {
        // Configuración
        Scanner scanner = new Scanner("10000");

        // Ejecución y verificación
        assertThrows(InputMismatchException.class, () -> Suma.pedirNumero(scanner, "Introduce un número:"));
    }

    @Test
    public void testCalcularSuma() {
        // Configuración
        int num1 = 2;
        int num2 = 3;

        // Ejecución
        int resultado = Suma.calcularSuma(num1, num2);

        // Verificación
        assertEquals(5, resultado);
    }
}
```

En este ejemplo, se definen cuatro pruebas unitarias:

*   `testPedirNumeroValido`: Verifica que el método `pedirNumero` devuelva el número correcto cuando se ingresa un número válido.
*   `testPedirNumeroInvalido`: Verifica que el método `pedirNumero` lance una excepción `InputMismatchException` cuando se ingresa un número no válido.
*   `testPedirNumeroFueraDeRango`: Verifica que el método `pedirNumero` lance una excepción `InputMismatchException` cuando se ingresa un número fuera del rango permitido (mayor a 9999).
*   `testCalcularSuma`: Verifica que el método `calcularSuma` devuelva la suma correcta de dos números.

Cada prueba sigue el patrón AAA (Arrange-Act-Assert):

*   **Arrange**: Se configura el entorno de la prueba, incluyendo la creación de objetos y la configuración de variables.
*   **Act**: Se ejecuta el código que se está probando.
*   **Assert**: Se verifica que el resultado sea el esperado utilizando afirmaciones (en este caso, `assertEquals` y `assertThrows`).