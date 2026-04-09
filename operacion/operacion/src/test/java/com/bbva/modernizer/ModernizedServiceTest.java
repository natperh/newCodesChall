¡Excelente! Ahora que tenemos el servicio implementado, es hora de escribir algunas pruebas unitarias para asegurarnos de que funcione correctamente.

En JUnit 5, podemos crear pruebas unitarias utilizando la anotación `@Test`. Aquí te dejo un ejemplo de cómo podríamos escribir pruebas para el servicio `SumaService`:

**SumaServiceTest.java**
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaServiceTest {

    private SumaService sumaService = new SumaService();

    @Test
    public void testSumarDosNumerosPositivos() {
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarDosNumerosNegativos() {
        int num1 = -2;
        int num2 = -3;
        int resultadoEsperado = -5;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarUnNumeroPositivoYUnNumeroNegativo() {
        int num1 = 2;
        int num2 = -3;
        int resultadoEsperado = -1;
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
}
```

En este ejemplo, hemos creado cuatro pruebas unitarias para el servicio `SumaService`:

* `testSumarDosNumerosPositivos`: Verifica que la suma de dos números positivos sea correcta.
* `testSumarDosNumerosNegativos`: Verifica que la suma de dos números negativos sea correcta.
* `testSumarUnNumeroPositivoYUnNumeroNegativo`: Verifica que la suma de un número positivo y un número negativo sea correcta.
* `testSumarCero`: Verifica que la suma de cero sea correcta.

En cada prueba, creamos un objeto `SumaService` y llamamos al método `sumar` con los parámetros correspondientes. Luego, utilizamos la anotación `assertEquals` para verificar que el resultado sea el esperado.

Para ejecutar estas pruebas, simplemente debes ejecutar la clase `SumaServiceTest` como una prueba JUnit. Si todas las pruebas pasan, significa que el servicio `SumaService` funciona correctamente.

¿Quieres agregar más pruebas o hacer algo más?