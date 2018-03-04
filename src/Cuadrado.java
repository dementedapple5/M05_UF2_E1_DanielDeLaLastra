public class Cuadrado {


    public float getArea(float lado){
        if (lado < 0){
            System.out.println("No se aceptan numeros negativos");
            return 0;
        }
        return lado * lado;
    }

    public float getPerimetro(float lado){
        if (lado < 0){
            System.out.println("No se aceptan numeros negativos");
            return 0;
        }
        return lado * 4;
    }
}
