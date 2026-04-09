¡Genial! Ahora que tenemos el servicio implementado, vamos a escribir algunas pruebas unitarias utilizando JUnit 5 y Mockito.

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
    public void testSumar() {
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;

        when(sumaService.sumar(num1, num2)).thenReturn(resultadoEsperado);

        ResponseEntity<String> respuesta = sumaController.sumar(num1, num2);

        assertEquals("El resultado es " + resultadoEsperado, respuesta.getBody());
    }
}
```

En estas pruebas, estamos utilizando Mockito para mockear el comportamiento del servicio `SumaService` en la prueba del controlador `SumaController`. De esta manera, podemos aislar la lógica del controlador y probarla de manera independiente.

En la prueba del servicio `SumaService`, simplemente estamos verificando que la suma se realice correctamente.

Recuerda que es importante escribir pruebas unitarias para asegurarte de que tu código funcione correctamente y sea mantenible en el futuro. ¡Espero que esto te sea de ayuda!