package edu.paulinhoh.poo.fundamentos.construtor;

public class SistemaCadastro {
    public static void main(String[] args) {
        // Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos", "123456789");

        // Definimos o endereço de marcos
        marcos.setEndereco("Rua dos Alfeneiros, 10");

        System.out.println(marcos.getNome() +" - "+ marcos.getCpf() +" - "+ marcos.getEndereco());
    }
    
}
