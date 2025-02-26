package edu.paulinhoh.javabasico.excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeTerminal {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu 1° nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();
            
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

            scanner.close();

            System.out.println("Olá me chamo "+ nome +" "+ sobrenome);
            System.out.println("Tenho "+ idade +" anos");
            System.out.println("Minha altura é "+ altura +"cm");
        } catch(InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
    }
}
