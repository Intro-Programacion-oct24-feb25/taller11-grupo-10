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
public class Problema6 {

    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media;
        double desviacion;

        media = obtenerMedia(informacion);
        desviacion = obtenerDesviacionEstandar(informacion, media);

        System.out.printf("La media aritmetica es de: %.2f\n", media);
        System.out.printf("La Desviacion Estandar es de: %.2f\n", desviacion);

    }

    public static double obtenerMedia(int[] a) {
        int suma = 0;
        double promedio;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        promedio = suma / a.length;
        return promedio;
    }

    public static double obtenerDesviacionEstandar(int[] a, double media) {
        double suma = 0;
        double desviacionEstandar;
        for (int i = 0; i < a.length; i++) {
            suma = suma + Math.pow(a[i] - media, 2);
        }
        desviacionEstandar = suma / a.length;
        return desviacionEstandar;

    }
}
