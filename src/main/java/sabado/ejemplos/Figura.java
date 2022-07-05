package sabado.ejemplos;

//Ejemplo de clase abstracta

public abstract class Figura {

    //---Atributos---
    private String color;

    //---Constructor---
    public Figura(String color) {
        this.color = color;
    }

    //---Métodos---

    //Método vacío para ser implementado desde las clases hijas
    public abstract double calcularArea();

    //getter para acceder al color
    public String getColor() {
        return color;
    }

    
    

    
    

    
}
