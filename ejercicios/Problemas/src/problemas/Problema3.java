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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String mensaje;
        System.out.println("Ingrese el primer parametro");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo parametro");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese el tercero parametro");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese el cuarto parametro");
        nota4 = entrada.nextDouble();

        mensaje = obtenerPromedio(nota1, nota2, nota3, nota4);

        System.out.printf("El promedio de las notas: %.2f, %.2f, %.2f, %.2f es %s\n",
                nota1, nota2, nota3, nota4, mensaje);

    }

    public static String obtenerPromedio(double a, double b, double c, double d) {
        double suma;
        String promedioCualitativo = "";
        suma = (a + b + c + d) / 4;
        if (suma > 0 && suma <= 5) {
            promedioCualitativo = "Regular";
        } else {
            if (suma > 5 && suma <= 8) {
                promedioCualitativo = "Bueno";
            } else {
                if (suma > 8 && suma <= 9) {
                    promedioCualitativo = "Muy Bueno";
                } else {
                    if (suma > 9 && suma <= 10) {
                        promedioCualitativo = "Sobresaliente";
                    }

                }

            }
        }
        return promedioCualitativo;
    }
}
