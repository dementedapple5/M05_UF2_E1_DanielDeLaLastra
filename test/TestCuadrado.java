import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCuadrado {

    Cuadrado cuadradoTest = new Cuadrado();

    @Test
    public void expectedResultInCalcArea() {
        float result = cuadradoTest.getArea(5);
        float esperado = 25; // 5 * 5 = 25
        assertEquals(esperado, result);
    }

    @Test
    public void expectedResultInCalcPerimetro() {
        float result = cuadradoTest.getPerimetro(5);
        float esperado = 20; // 5 * 4 = 20
        assertEquals(esperado, result);
    }

    @Test
    public void CalcPerimetroOnlyAcceptsPositives() {
        float result = cuadradoTest.getPerimetro(-5);
        float esperado = 0;
        assertEquals(esperado, result );
    }

    @Test
    public void CalcAreaOnlyAcceptsPositives() {
        float result = cuadradoTest.getArea(-5);
        float esperado = 0;
        assertEquals(esperado, result);
    }
}
