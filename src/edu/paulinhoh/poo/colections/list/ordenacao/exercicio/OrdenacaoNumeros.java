package edu.paulinhoh.poo.colections.list.ordenacao.exercicio;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        numerosAscendente.sort((num1, num2) -> num1.compareTo(num2));
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        numerosDescendente.sort((num1, num2) -> num2.compareTo(num1));
        return numerosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(-25);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(-7);
        numeros.adicionarNumero(34);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

    }

}