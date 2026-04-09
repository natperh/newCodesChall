import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaServiceTest {

    @Test
    public void testSumarDosNumerosPositivos() {
        SumaService sumaService = new SumaService();
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;
        int resultadoObtenido = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSumarDosNumerosNegativos() {
        SumaService sumaService = new SumaService();
        int num1 = -2;
        int num2 = -3;
        int resultadoEsperado = -5;
        int resultadoObtenido = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSumarUnNumeroPositivoYUnNumeroNegativo() {
        SumaService sumaService = new SumaService();
        int num1 = 2;
        int num2 = -3;
        int resultadoEsperado = -1;
        int resultadoObtenido = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSumarCeroYMismoNumero() {
        SumaService sumaService = new SumaService();
        int num1 = 0;
        int num2 = 5;
        int resultadoEsperado = 5;
        int resultadoObtenido = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}