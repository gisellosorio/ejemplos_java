package sabado.ejemplos;

public class Cuadrado extends Figura {
    //---Atributo---
    double lado;

    //---Constructor---
    public Cuadrado(String color, double lado){
        super(color);
        this.lado=lado;
    }

    //---Métodos---
    public double calcularArea(){
        return lado*lado;
    }
    
}
