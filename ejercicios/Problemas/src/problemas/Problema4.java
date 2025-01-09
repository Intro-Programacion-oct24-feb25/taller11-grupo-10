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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         String nombre;
         String cedula;
         String opcion;
         boolean bandera = true;
         
         do
         {
             System.out.println("Ingrese el nombre");
             nombre = entrada.nextLine();
             System.out.println("Ingrese el numero de cedula");
             cedula = entrada.nextLine();
             System.out.println("Ingrese la opcion que desea ejecutar");
             opcion = entrada.nextLine();
             if (opcion.equals("1")){
                 obtenerPlanilla(nombre, cedula);
             } else{
                 //obtenerPredio();
             }
             System.out.println("¿Desea terminar? Escriba 3");
             opcion = entrada.nextLine();
             if (opcion.equals("3")){
                 bandera = false;
             }
         }
         while (bandera);
        
   
                 
         

    }
    public static void obtenerPlanilla(String n, String c){
        Scanner entrada = new Scanner(System.in);
        double valorK;
        double numeroK;
        double totalMes;
        
        System.out.println("Ingrese el valor por Kilowatio");
        valorK = entrada.nextDouble();
        System.out.println("Ingrese el numero de Kilowatio consumido al mes");
        numeroK = entrada.nextDouble();
        
        totalMes = valorK * numeroK;
        
        System.out.printf("Clienta %s con cedula %s debe cancelar el valor de $%.2f", n, c, totalMes);
        
        
        
    }
    
}
