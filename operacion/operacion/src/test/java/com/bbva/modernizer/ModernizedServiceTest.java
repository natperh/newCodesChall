import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.annotation.RequestParam;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ModernizedServiceTest {
    @Mock
    private SumaController sumaController;
    @Test
    void testSuma() {
        String resultado = sumaController.suma(2, 3);
    }
    @Test
    void testSumaConValoresNegativos() {
        String resultado = sumaController.suma(-2, -3);
    }
    @Test
    void testSumaConValoresCero() {
        String resultado = sumaController.suma(0, 0);
    }
}