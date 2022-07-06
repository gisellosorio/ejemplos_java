package sabado.ejemplos.Interfaz;

public class EleProceso implements Proceso{

    int iniciar;
    int valor;
    int anterior;

    EleProceso(){
        iniciar=0;
        valor=0;
    }

    public int getSiguiente(){
        anterior=valor;
        valor+=2;
        return valor;
    }

    public void reiniciar(){
        valor=iniciar;
        anterior=valor-2;
    }

    public void setComenzar(int x){
        iniciar=x;
        valor=x;
        anterior=x-2;
    }

    //Aquí se implementan los métodos de la interfaz y se pueden agregar otros

    int getAnterior(){
        return anterior;
    }
    
}
