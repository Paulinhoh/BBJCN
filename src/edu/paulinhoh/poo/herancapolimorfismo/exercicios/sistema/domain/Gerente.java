package edu.paulinhoh.poo.herancapolimorfismo.exercicios.sistema.domain;

public class Gerente {

    private String nome;
    private String email;
    private int senha;
    private boolean administrador;
    private boolean logado = false;

    public Gerente(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public void gerararRelatorioFinanceiro() {
        System.out.println("Relatório de vendas gerado com sucesso!");
    }

    public void cusultarVendas() {
        System.out.println("Vendas consultadas com sucesso!");
    }

    public void realizarLogin(String email, int senha) {
        if (email.equals(this.getEmail()) && senha == this.getSenha()) {
            System.out.println("Login realizado com sucesso!");
            this.logado = true;
            return;
        }

        System.out.println("Login inválido!");
        this.logado = false;
    }

    public void realizarLogout() {
        if (logado) {
            System.out.println("Logout realizado com sucesso!");
            this.logado = false;
            return;
        }

        System.out.println("Você ja não está logado!");
    }

}