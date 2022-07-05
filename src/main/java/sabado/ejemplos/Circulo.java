package sabado.ejemplos;

public class Circulo extends Figura{

    //---Atributo---
    double radio;

    //---Constructor---
    public Circulo(String color, double radio) {
        super(color); //super para referirse a una variable de la superclase
        this.radio = radio;
    }

    //---Métodos---
    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }

    
    
}
