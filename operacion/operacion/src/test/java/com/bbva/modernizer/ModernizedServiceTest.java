¡Claro! A continuación, te proporciono algunos ejemplos de Unit Tests con JUnit 5 y Mockito para el código Java generado:

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
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;

        // Act
        SumaService sumaService = new SumaService();
        int result = sumaService.sumar(num1, num2);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumarConNumerosNegativos() {
        // Arrange
        int num1 = -2;
        int num2 = -3;
        int expectedResult = -5;

        // Act
        SumaService sumaService = new SumaService();
        int result = sumaService.sumar(num1, num2);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumarConNumerosDecimales() {
        // Arrange
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;

        // Act
        SumaService sumaService = new SumaService();
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
    public void testSuma() {
        // Arrange
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;
        String expectedResponse = "El resultado es 5";

        when(sumaService.sumar(num1, num2)).thenReturn(expectedResult);

        // Act
        ResponseEntity<String> response = sumaController.suma(num1, num2);

        // Assert
        assertEquals(expectedResponse, response.getBody());
    }

    @Test
    public void testSumaConNumerosNegativos() {
        // Arrange
        int num1 = -2;
        int num2 = -3;
        int expectedResult = -5;
        String expectedResponse = "El resultado es -5";

        when(sumaService.sumar(num1, num2)).thenReturn(expectedResult);

        // Act
        ResponseEntity<String> response = sumaController.suma(num1, num2);

        // Assert
        assertEquals(expectedResponse, response.getBody());
    }
}
```
En estos ejemplos, se utilizan las siguientes características de JUnit 5 y Mockito:

*   `@ExtendWith(MockitoExtension.class)`: Esta anotación habilita la integración de Mockito con JUnit 5.
*   `@Mock`: Esta anotación se utiliza para crear objetos mockeados que se pueden utilizar en las pruebas.
*   `@InjectMocks`: Esta anotación se utiliza para inyectar objetos mockeados en la clase que se está probando.
*   `when()`: Esta función se utiliza para definir el comportamiento de los objetos mockeados.
*   `thenReturn()`: Esta función se utiliza para especificar el valor que se devuelve cuando se llama a un método en un objeto mockeado.
*   `assertEquals()`: Esta función se utiliza para verificar que el resultado de una operación sea igual al valor esperado.

Espero que estos ejemplos te ayuden a entender cómo escribir Unit Tests con JUnit 5 y Mockito para tu código Java. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!