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
public class Problema7 {

    public static void main(String[] args) {

        String[] arregloCiudades = generarArreglo();
        imprimirCiudadesCortas(arregloCiudades);
    }

    public static String[] generarArreglo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos del arreglo:");
        int numeroElementos = scanner.nextInt();
        scanner.nextLine();

        String[] ciudades = new String[numeroElementos];

        for (int i = 0; i <= numeroElementos - 1; i++) {
            System.out.print("Ingrese el nombre de una ciudad del Ecuador:");
            ciudades[i] = scanner.nextLine();
        }

        return ciudades;
    }

    public static void imprimirCiudadesCortas(String[] arreglo) {
        System.out.println("Ciudades con 4 o 5 caracteres:");
        for (int i = 0; i <= arreglo.length - 1; i++) {
            if (arreglo[i].length() == 4 || arreglo[i].length() == 5) {
                System.out.println(arreglo[i]);
            }
        }
    }

}
