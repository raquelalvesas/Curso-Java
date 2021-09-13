package generics;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // Deseja-se fazer um programa que leia uma quantidade N, e depois N números inteiros.
        // Ao final, imprima esses números de forma organizada conforme exemplo.
        // Em seguida, informar qual foi o primeiro valor informado.

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
        String value = sc.next();
        ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
