package edu.paulinhoh.javabasico.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
    public static void main(String[] args) {
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
    }
}
