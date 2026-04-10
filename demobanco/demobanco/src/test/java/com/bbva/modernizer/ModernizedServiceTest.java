import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ModernizedServiceTest {
    @InjectMocks
    private DemoBanco demoBanco;
    @Test
    void testMask() {
        String resultado = demoBanco.mask(value);
        assertNotNull(resultado);
    }
    @Test
    void testProcesarTransaccion() {
        String resultado = demoBanco.procesarTransaccion(transaccion);
        assertNotNull(resultado);
    }
}