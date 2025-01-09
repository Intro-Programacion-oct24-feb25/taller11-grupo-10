/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String opcion;
        
        System.out.println("Ingrese el procedimiento que desea usar");
        opcion = entrada.nextLine();
        
        switch (opcion){
            case ("1"):
               obtenerAreaCuadrado();
               break;
            case ("2"):
                obtenerAreaTriangulo();
                break;
            case ("3"):
                obtenerAreaRectangulo();
                break;
        }
    }
    
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner (System.in);
        double lado1;
        double area;
        System.out.println("Ingrese el valor del lado:");
        lado1 =  entrada.nextDouble();
        area = lado1 * lado1;
        System.out.printf("%.2f\n", area);
    }
    
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner (System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base:");
        base =  entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura:");
        altura = entrada.nextDouble();
        area = (base * altura)/2;
        System.out.printf("%.2f\n", area);
    }
    
    public static void obtenerAreaRectangulo(){
        Scanner entrada = new Scanner (System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base:");
        base =  entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura:");
        altura = entrada.nextDouble();
        area = (base * altura);
        System.out.printf("%.2f\n", area);
    }
}
