import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ModernizedServiceTest {
    @Mock
    private Scanner scanner;
    @InjectMocks
    private Suma suma;
    @Test
    void testSuma() {
        when(scanner.nextInt()).thenReturn(2, 3);
        int resultado = suma.num1() + suma.num2();
        assertEquals(5, resultado);
    }
}