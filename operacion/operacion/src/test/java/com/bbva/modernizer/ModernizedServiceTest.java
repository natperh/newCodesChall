Aquí te dejo la clase de prueba JUnit 5 para la clase `SumaController` utilizando Mockito y anotaciones `@Test`:


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class ModernizedServiceTest {

    @InjectMocks
    private SumaController sumaController;

    private MockMvc mockMvc;

    @Test
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(sumaController).build();
    }

    @Test
    public void testSuma() throws Exception {
        mockMvc.perform(get("/suma")
                .param("num1", "2")
                .param("num2", "3")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("El resultado es 5"));
    }

    @Test
    public void testSumaInvalidInput() throws Exception {
        mockMvc.perform(get("/suma")
                .param("num1", "a")
                .param("num2", "3")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testSumaMissingInput() throws Exception {
        mockMvc.perform(get("/suma")
                .param("num1", "2")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }
}


En esta clase de prueba, se utilizan las siguientes anotaciones:

* `@ExtendWith(MockitoExtension.class)`: Habilita el uso de Mockito en la clase de prueba.
* `@InjectMocks`: Inyecta la instancia de `SumaController` en la clase de prueba.
* `@Test`: Indica que el método es una prueba.

Se definen tres pruebas:

* `testSuma`: Verifica que la suma se realice correctamente con números válidos.
* `testSumaInvalidInput`: Verifica que se devuelva un error cuando se ingresa un valor no numérico.
* `testSumaMissingInput`: Verifica que se devuelva un error cuando falta un parámetro.

En cada prueba, se utiliza `MockMvc` para simular una solicitud GET a la URL `/suma` con los parámetros correspondientes. Luego, se verifica el estado de la respuesta y el contenido de la respuesta utilizando `andExpect`.