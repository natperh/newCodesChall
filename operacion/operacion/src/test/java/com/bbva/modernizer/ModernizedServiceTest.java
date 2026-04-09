Aquí te dejo el código para el JUnit 5:


package com.example.suma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaServiceTest {

    @Test
    public void testSumar() {
        SumaService sumaService = new SumaService();
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarCero() {
        SumaService sumaService = new SumaService();
        int num1 = 0;
        int num2 = 0;
        int resultadoEsperado = 0;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumarNegativos() {
        SumaService sumaService = new SumaService();
        int num1 = -2;
        int num2 = -3;
        int resultadoEsperado = -5;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultado);
    }
}


En este código, se crean tres tests para verificar el comportamiento de la función sumar en diferentes escenarios:

*   testSumar: Verifica que la función sume correctamente dos números positivos.
*   testSumarCero: Verifica que la función sume correctamente cuando ambos números son cero.
*   testSumarNegativos: Verifica que la función sume correctamente cuando ambos números son negativos.

En cada test, se crea una instancia de SumaService, se definen los números a sumar y el resultado esperado, y luego se llama a la función sumar y se verifica que el resultado sea igual al esperado utilizando el método assertEquals de JUnit 5.