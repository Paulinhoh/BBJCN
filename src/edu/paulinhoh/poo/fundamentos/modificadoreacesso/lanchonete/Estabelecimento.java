package edu.paulinhoh.poo.fundamentos.modificadoreacesso.lanchonete;

import edu.paulinhoh.poo.fundamentos.modificadoreacesso.lanchonete.area.cliente.Cliente;
import edu.paulinhoh.poo.fundamentos.modificadoreacesso.lanchonete.atendimento.Atendente;
import edu.paulinhoh.poo.fundamentos.modificadoreacesso.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // Ações que não precisam estarem disponiveis para toda a aplicação
        /* 
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararCombo();
        */

        // Ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();


        // Almoxarife almoxarife = new Almoxarife();
        // Ações que não precisam estarem disponiveis para toda a aplicação
        /* 
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        */

        // Ações que somente o seu pacote cozinha precisa conhecer (default)
        /* 
        almoxarife.entregrarIngredientes();
        almoxarife.trocarGas();
        */


        Atendente atendente = new Atendente();
        /* 
        atendente.pegarLancheCozinha();
        atendente.pegarPedidoBalcao();
        */
        atendente.receberPagamento();

        // Acóes que somente o seu pacote cozinha precisa conhecer (default)
        /*
        atendente.trocarGas();
        */

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // Não deveria, mas o estabelecimento ainda não definiu normas de atendimento
        /*
        cliente.pagarPedidoBalcao();
        */

        // Esta ação é muito sigilósa, que tal ser privada?
        /*
        cliente.consultarSaldoAplicativo();
        */

        // Já pensou os clientes ouvindo que o gás acabou?
        /* 
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
        */
    }
}
