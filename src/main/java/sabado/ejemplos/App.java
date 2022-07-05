package sabado.ejemplos;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MiPrimeraClase persona1= new MiPrimeraClase(234, 1.75, "mujer", "Patricia");
        MiPrimeraClase persona2= new MiPrimeraClase();
        
        //Impresión de los datos inicializados desde el constructor parametrizado. Uso de getters.
        System.out.println("Datos de la primera persona: \n     Nombre: "+persona1.getNombrePersona()+".\n     Género: "+persona1.getGenero()+".\n     Estatura: "+persona1.getEstatura()+".\n     Id: "+persona1.getId()+".");
        
        //Ingreso por teclado de los datos del objeto creado con el constructor vacío. Uso de setters y getters.
        System.out.println("Ingrese los datos de la segunda persona: ");
        Scanner sc=new Scanner(System.in);

        System.out.print("     Nombre: ");
        String nombre2 = sc.next();
        persona2.setNombrePersona(nombre2);

        System.out.print("     Genero: ");
        String genero2 = sc.next();
        persona2.setGenero(genero2);
        
        System.out.print("     Estatura: ");
        Double estatura2 = sc.nextDouble();
        persona2.setEstatura(estatura2);
        
        System.out.print("     Id: ");
        int id2 = sc.nextInt();
        persona2.setId(id2);

        sc.close();

        System.out.println("Datos de la segunda persona: \n     Nombre: "+persona2.getNombrePersona()+".\n     Género: "+persona2.getGenero()+".\n     Estatura: "+persona2.getEstatura()+".\n     Id: "+persona2.getId()+".");

    }
}
