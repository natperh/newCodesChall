¡Claro! A continuación, te proporciono un ejemplo de cómo podrías implementar Unit Tests con JUnit 5 y Mockito para el servicio `SumaService` y el controlador `SumaController`:

**SumaServiceTest.java**
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SumaServiceTest {

    @InjectMocks
    private SumaService sumaService;

    @Test
    public void testSumar() {
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;

        int resultado = sumaService.sumar(num1, num2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarConNumerosNegativos() {
        int num1 = -2;
        int num2 = -3;
        int resultadoEsperado = -5;

        int resultado = sumaService.sumar(num1, num2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarConCero() {
        int num1 = 0;
        int num2 = 3;
        int resultadoEsperado = 3;

        int resultado = sumaService.sumar(num1, num2);

        assertEquals(resultadoEsperado, resultado);
    }
}
```

En este ejemplo, creamos una clase de prueba `SumaServiceTest` que utiliza la anotación `@ExtendWith(MockitoExtension.class)` para habilitar la inyección de dependencias con Mockito. La anotación `@InjectMocks` se utiliza para inyectar la instancia del servicio `SumaService` en la clase de prueba.

Luego, definimos tres métodos de prueba:

* `testSumar`: prueba la suma de dos números positivos.
* `testSumarConNumerosNegativos`: prueba la suma de dos números negativos.
* `testSumarConCero`: prueba la suma de un número con cero.

En cada método de prueba, se definen los valores de entrada y el resultado esperado, y se utiliza el método `assertEquals` para verificar que el resultado obtenido sea igual al resultado esperado.

**SumaControllerTest.java**
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SumaControllerTest {

    @Mock
    private SumaService sumaService;

    @InjectMocks
    private SumaController sumaController;

    @Test
    public void testSumar() {
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;

        when(sumaService.sumar(num1, num2)).thenReturn(resultadoEsperado);

        ResponseEntity<String> respuesta = sumaController.sumar(num1, num2);

        assertEquals("El resultado es " + resultadoEsperado, respuesta.getBody());
    }

    @Test
    public void testSumarConNumerosNegativos() {
        int num1 = -2;
        int num2 = -3;
        int resultadoEsperado = -5;

        when(sumaService.sumar(num1, num2)).thenReturn(resultadoEsperado);

        ResponseEntity<String> respuesta = sumaController.sumar(num1, num2);

        assertEquals("El resultado es " + resultadoEsperado, respuesta.getBody());
    }

    @Test
    public void testSumarConCero() {
        int num1 = 0;
        int num2 = 3;
        int resultadoEsperado = 3;

        when(sumaService.sumar(num1, num2)).thenReturn(resultadoEsperado);

        ResponseEntity<String> respuesta = sumaController.sumar(num1, num2);

        assertEquals("El resultado es " + resultadoEsperado, respuesta.getBody());
    }
}
```

En este ejemplo, creamos una clase de prueba `SumaControllerTest` que utiliza la anotación `@ExtendWith(MockitoExtension.class)` para habilitar la inyección de dependencias con Mockito. La anotación `@Mock` se utiliza para crear un mock del servicio `SumaService`, y la anotación `@InjectMocks` se utiliza para inyectar la instancia del controlador `SumaController` en la clase de prueba.

Luego, definimos tres métodos de prueba:

* `testSumar`: prueba la suma de dos números positivos.
* `testSumarConNumerosNegativos`: prueba la suma de dos números negativos.
* `testSumarConCero`: prueba la suma de un número con cero.

En cada método de prueba, se definen los valores de entrada y el resultado esperado, y se utiliza el método `when` para configurar el comportamiento del mock del servicio `SumaService`. Luego, se llama al método `sumar` del controlador `SumaController` y se verifica que la respuesta sea igual al resultado esperado.

Espero que esto te ayude. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!