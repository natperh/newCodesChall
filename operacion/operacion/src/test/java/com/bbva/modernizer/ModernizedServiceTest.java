¡Claro! Aquí te dejo un ejemplo de cómo podrías implementar el test JUnit 5 con Mockito para el servicio `SumaService` y el controlador `SumaController`:

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
    void testSumar() {
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;

        int resultado = sumaService.sumar(num1, num2);

        assertEquals(resultadoEsperado, resultado);
    }
}
```

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
    void testSumar() {
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;

        when(sumaService.sumar(num1, num2)).thenReturn(resultadoEsperado);

        ResponseEntity<String> respuesta = sumaController.sumar(num1, num2);

        assertEquals("El resultado es 5", respuesta.getBody());
    }
}
```

En el test del servicio `SumaService`, simplemente llamamos al método `sumar` y verificamos que el resultado sea el esperado.

En el test del controlador `SumaController`, utilizamos Mockito para simular la llamada al servicio `SumaService`. Configuramos el comportamiento del servicio para que devuelva el resultado esperado cuando se llame al método `sumar`. Luego, llamamos al método `sumar` del controlador y verificamos que la respuesta sea la esperada.

Recuerda que debes agregar las dependencias necesarias en el archivo `pom.xml` (si estás utilizando Maven) o `build.gradle` (si estás utilizando Gradle) para que JUnit 5 y Mockito funcionen correctamente.