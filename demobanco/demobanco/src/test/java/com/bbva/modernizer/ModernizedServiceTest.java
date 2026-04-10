import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ModernizedServiceTest {
    @InjectMocks
    private DemoBanco demoBanco;
    @Test
    void testProcesarTransaccion() {
        // Arrange
        // Act
        String respuesta = demoBanco.procesarTransaccion(transaccion);
        // Assert
    }
    @Test
    void testProcesarTransaccionConMontoMayorAlLimite() {
        // Arrange
        // Act
        String respuesta = demoBanco.procesarTransaccion(transaccion);
        // Assert
    }
}