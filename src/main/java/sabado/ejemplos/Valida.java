package sabado.ejemplos;

import java.util.Scanner;

public class Valida {
    
    public static void main(String[] args) {

        //Declaración de variables
        String colorDelCuadrado, colorDelCirculo;
        double ladoDelCuadrado, radioDelCirculo;

        
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca el color del cuadrado: ");
        colorDelCuadrado=sc.nextLine();
        System.out.print("Introduzca el lado del cuadrado: ");
        ladoDelCuadrado=sc.nextDouble();
        Cuadrado c1=new Cuadrado(colorDelCuadrado, ladoDelCuadrado);
        System.out.printf("El área del cuadrado %s es: %f \n",c1.getColor(),c1.calcularArea());
        

        Scanner sc1=new Scanner(System.in);
        System.out.print("Introduzca el color del círculo: ");
        colorDelCirculo=sc1.nextLine();
        System.out.print("Introduzca el radio del círculo: ");
        radioDelCirculo=sc1.nextDouble();
        Circulo c2=new Circulo(colorDelCirculo, radioDelCirculo);
        System.out.printf("El área del círculo %s es: %f \n",c2.getColor(),c2.calcularArea());
        sc.close();
        sc1.close();
        
        
    }
}
