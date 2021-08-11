package membros;

import membros.util.Calculator;

import java.util.Scanner;

public class Estatico {


    public static void main(String[] args) {

        // fazer um programa para ler um valor numérico qualquer, e daí mostrar
        // quanto seria o valor de uma circunferência e do volume de uma esfera
        // para um raio daquele valor. Informar também o valor de PI em duas casas decimais.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }


}