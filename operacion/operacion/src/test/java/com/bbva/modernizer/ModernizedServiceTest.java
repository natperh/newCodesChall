Aquí tienes el código del test JUnit 5 para el servicio `SumaService`:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaServiceTest {

    private final SumaService sumaService = new SumaService();

    @Test
    public void testSumar() {
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarCero() {
        int num1 = 0;
        int num2 = 0;
        int resultadoEsperado = 0;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarNegativos() {
        int num1 = -5;
        int num2 = -7;
        int resultadoEsperado = -12;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }
}
```

Este test utiliza JUnit 5 y cubre los siguientes escenarios:

*   `testSumar`: Verifica que la suma de dos números positivos sea correcta.
*   `testSumarCero`: Verifica que la suma de dos ceros sea cero.
*   `testSumarNegativos`: Verifica que la suma de dos números negativos sea correcta.

En cada test, se crea una instancia del servicio `SumaService` y se llama al método `sumar` con los números de prueba. Luego, se utiliza el método `assertEquals` para verificar que el resultado obtenido sea igual al resultado esperado.