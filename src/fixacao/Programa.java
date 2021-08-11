package fixacao;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();

        System.out.println("Digite a largura e a altura do retângulo:");
        rect.largura = sc.nextDouble();
        rect.altura = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rect.area());
        System.out.printf("Perimetro = %.2f%n", rect.perimetro());
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());
        sc.close();
    }
}
