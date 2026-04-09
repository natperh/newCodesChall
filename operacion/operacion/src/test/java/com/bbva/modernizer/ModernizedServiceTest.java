Aquí tienes el código del test JUnit 5 para la clase `SumaService`:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaServiceTest {

    @Test
    public void testSumarDosNumerosPositivos() {
        SumaService sumaService = new SumaService();
        int resultado = sumaService.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSumarDosNumerosNegativos() {
        SumaService sumaService = new SumaService();
        int resultado = sumaService.sumar(-2, -3);
        assertEquals(-5, resultado);
    }

    @Test
    public void testSumarNumeroPositivoYNegativo() {
        SumaService sumaService = new SumaService();
        int resultado = sumaService.sumar(2, -3);
        assertEquals(-1, resultado);
    }

    @Test
    public void testSumarCero() {
        SumaService sumaService = new SumaService();
        int resultado = sumaService.sumar(0, 0);
        assertEquals(0, resultado);
    }
}
```

En este test, se cubren diferentes escenarios para la función `sumar` de la clase `SumaService`:

*   Sumar dos números positivos.
*   Sumar dos números negativos.
*   Sumar un número positivo y un número negativo.
*   Sumar cero.