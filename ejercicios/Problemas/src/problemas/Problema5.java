/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        int[][] resultado = new int[3][3];

        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[i].length; j++) {
                resultado[i][j] = obtenerMultiplicacion(informacion[i][j],
                        informacion2[i][j]);
            }
        }

        obtenerReporte(informacion);
        obtenerReporte(informacion2);
        obtenerReporte(resultado);
    }

    public static void obtenerReporte(int[][] arreglo) {
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int suma;
        suma = a + b;
        return suma;
    }
}
