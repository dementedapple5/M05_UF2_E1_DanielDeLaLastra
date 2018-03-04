public class Rectangulo {

    public float getArea(float base, float altura) {
        if (base < 0 || altura < 0) {
            System.out.println("Los valores insertados deben ser positivos");
            return 0;
        }
        return base * altura;
    }

    public float getPerimetro(float base, float altura) {
        if (base < 0 || altura < 0) {
            System.out.println("Los valores insertados deben ser positivos");
            return 0;
        }
        return base * 2 + altura * 2;
    }
}
