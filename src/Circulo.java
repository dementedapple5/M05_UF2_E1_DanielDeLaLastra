public class Circulo {

    public float getArea(float radio) {
        if (radio < 0){
            System.out.println("No se aceptan numeros negativos");
            return 0;
        }
        return radio * radio * 3.14f;
    }

    public float getPerimetro(float diametro) {
        if (diametro < 0){
            System.out.println("No se aceptan numeros negativos");
            return 0;
        }
        return diametro * 3.14f;
    }

}
