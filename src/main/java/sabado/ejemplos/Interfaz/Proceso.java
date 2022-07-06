package sabado.ejemplos.Interfaz;

// Las interfaces no tienen atributos. Si tienen atributos, estos son finales. 
//Lo único que tengo son métodos.
//Las interfaces se usan para poder heredar métodos desde diferentes clases. Son como un puente. 
public interface Proceso {

    int getSiguiente();
    void reiniciar();
    void setComenzar(int x);
    
}
