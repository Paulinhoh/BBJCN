package edu.paulinhoh.poo.herancapolimorfismo.exercicios.sistema;

import edu.paulinhoh.poo.herancapolimorfismo.exercicios.sistema.domain.Atendente;
import edu.paulinhoh.poo.herancapolimorfismo.exercicios.sistema.domain.Gerente;
import edu.paulinhoh.poo.herancapolimorfismo.exercicios.sistema.domain.Vendedor;

public class Main {
    public static void main(String[] args) {

        System.out.println("");

        var gerente = new Gerente("Paulinho", "paulo@gmail.com", 1234);
        gerente.cusultarVendas();
        gerente.gerararRelatorioFinanceiro();
        gerente.realizarLogin("paulo@gmail.com", 1234);
        gerente.realizarLogout();

        System.out.println("");

        var vendedor = new Vendedor("João", "joao@gmail.com", 1234, 5);
        vendedor.cusultarVendas();
        vendedor.adicionarVenda();
        System.out.println(vendedor.getQuantidadeVendas());
        vendedor.realizarLogin("joao@gmail.com", 123456);
        vendedor.realizarLogout();

        System.out.println("");

        var atendente = new Atendente("Maria", "maria@gmail.com", 1234, 1000.0);
        atendente.gerararRelatorioFinanceiro();
        System.out.println(atendente.getValorEmCaixa());
        atendente.receberPagamento(520.0);
        System.out.println(atendente.getValorEmCaixa());
        atendente.realizarLogin("maria@gmail.com", 1234);
        atendente.realizarLogout();

        System.out.println("");
    }
}