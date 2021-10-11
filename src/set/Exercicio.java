package set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        // Um site de internet registra um log de acessos dos usuários. Um registro de log consiste no nome de usuário
        //(apenas uma palavra) e o instante em que o usuário acessou o site no padrão ISO 8601, separados por espaço,
        //conforme exemplo. Fazer um programa que leia o log de acessos a partir de um arquivo, e daí informe quantos
        //usuários distintos acessaram o site.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
