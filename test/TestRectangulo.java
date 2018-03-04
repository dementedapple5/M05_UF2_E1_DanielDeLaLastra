import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangulo {

    Rectangulo rectanguloTest  = new Rectangulo();

    @Test
    public void expectedResultInCalcArea() {
        float result = rectanguloTest.getArea(5, 6);
        float esperado = 30; // 5 * 5 = 25
        assertEquals(esperado, result);
    }

    @Test
    public void expectedResultInCalcPerimetro() {
        float result = rectanguloTest.getPerimetro(5, 7);
        float esperado = 24; // 5 * 2 + 7 * 2
        assertEquals(esperado, result);
    }

    @Test
    public void CalcPerimetroOnlyAcceptsPositives() {
        float result = rectanguloTest.getPerimetro(-5, -3);
        float esperado = 0;
        assertEquals(esperado, result);
    }

    @Test
    public void CalcAreaOnlyAcceptsPositives() {
        float result = rectanguloTest.getArea(-5, 7);
        float esperado = 0;
        assertEquals(esperado, result);
    }
}
