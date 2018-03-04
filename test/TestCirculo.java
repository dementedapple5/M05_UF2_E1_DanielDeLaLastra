import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCirculo {
    Circulo circuloTest = new Circulo();

    @Test
    public void expectedResultInCalcArea() {
        float result = circuloTest.getArea(5);
        float esperado = 78.5f; // 5 * 5 * 3,14 = 78,5
        assertEquals(esperado, result);
    }

    @Test
    public void expectedResultInCalcPerimetro() {
        float result = circuloTest.getPerimetro(5);
        float esperado = 15.700001f; // 5 * 3,14 = 15,700001
        assertEquals(esperado, result);
    }

    @Test
    public void CalcPerimetroOnlyAcceptsPositives() {
        float result = circuloTest.getPerimetro(-5);
        float esperado = 0;
        assertEquals(esperado, result);
    }

    @Test
    public void CalcAreaOnlyAcceptsPositives() {
        float result = circuloTest.getArea(-5);
        float esperado = 0;
        assertEquals(esperado, result);
    }
}
