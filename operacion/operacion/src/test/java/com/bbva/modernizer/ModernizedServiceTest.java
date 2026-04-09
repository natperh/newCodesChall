¡Claro! A continuación, te proporciono ejemplos de Unit Tests con JUnit 5 y Mockito para el código Java generado:

**SumaServiceTest.java**
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SumaServiceTest {

    @Test
    public void testSumar() {
        // Arrange
        SumaService sumaService = new SumaService();
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;

        // Act
        int result = sumaService.sumar(num1, num2);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumarConNegativos() {
        // Arrange
        SumaService sumaService = new SumaService();
        int num1 = -2;
        int num2 = -3;
        int expectedResult = -5;

        // Act
        int result = sumaService.sumar(num1, num2);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumarConCero() {
        // Arrange
        SumaService sumaService = new SumaService();
        int num1 = 0;
        int num2 = 3;
        int expectedResult = 3;

        // Act
        int result = sumaService.sumar(num1, num2);

        // Assert
        assertEquals(expectedResult, result);
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
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class SumaControllerTest {

    @Mock
    private SumaService sumaService;

    @InjectMocks
    private SumaController sumaController;

    private MockMvc mockMvc;

    @Test
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(sumaController);
    }

    @Test
    public void testSumar() throws Exception {
        // Arrange
        when(sumaService.sumar(2, 3)).thenReturn(5);

        // Act y Assert
        mockMvc.perform(get("/suma")
                .param("num1", "2")
                .param("num2", "3")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("El resultado es 5"));
    }

    @Test
    public void testSumarConNegativos() throws Exception {
        // Arrange
        when(sumaService.sumar(-2, -3)).thenReturn(-5);

        // Act y Assert
        mockMvc.perform(get("/suma")
                .param("num1", "-2")
                .param("num2", "-3")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("El resultado es -5"));
    }

    @Test
    public void testSumarConCero() throws Exception {
        // Arrange
        when(sumaService.sumar(0, 3)).thenReturn(3);

        // Act y Assert
        mockMvc.perform(get("/suma")
                .param("num1", "0")
                .param("num2", "3")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("El resultado es 3"));
    }
}
```
En estos ejemplos, se utilizan las siguientes características de JUnit 5 y Mockito:

*   `@ExtendWith(MockitoExtension.class)`: permite utilizar Mockito en los tests.
*   `@Mock`: crea un mock de la clase `SumaService` para simular su comportamiento en los tests.
*   `@InjectMocks`: inyecta el mock de `SumaService` en la clase `SumaController` para que se utilice en los tests.
*   `MockMvc`: crea un objeto de tipo `MockMvc` para simular peticiones HTTP a la clase `SumaController`.
*   `when()`: define el comportamiento del mock de `SumaService` para que devuelva un resultado específico cuando se invoque el método `sumar`.
*   `perform()`: simula una petición HTTP a la clase `SumaController`.
*   `andExpect()`: verifica que la respuesta de la petición HTTP sea la esperada.

Estos tests cubren diferentes escenarios, como la suma de números positivos, negativos y cero, y verifican que la respuesta de la petición HTTP sea la esperada en cada caso.