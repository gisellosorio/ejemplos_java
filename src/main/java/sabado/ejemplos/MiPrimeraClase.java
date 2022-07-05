package sabado.ejemplos;

public class MiPrimeraClase {
    
    //---------------Atributos---------------
    private int id;
    private double estatura;
    private String genero, nombrePersona;
    //---------------------------------------
    
    //---------------Constructores-----------
    //El constructor sirve para inicializar los objetos de la clase.
    public MiPrimeraClase() {
    }
    
    public MiPrimeraClase(int id, double estatura, String genero, String nombrePersona) {
        this.id = id;
        this.estatura = estatura;
        this.genero = genero;
        this.nombrePersona = nombrePersona;
    }
    //---------------------------------------

    //-----------Getters y setters-----------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    //---------------------------------------

    
    
}
