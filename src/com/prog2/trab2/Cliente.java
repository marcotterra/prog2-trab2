package com.prog2.trab2;

/**
 * Created by marco on 16/05/17.
 */
public class Cliente {
    private String nome;
    private int id;
    private int cpf;
    private int telefone;
    private int cfpIndicado;

    public Cliente() {
        this.nome = "";
        this.cpf = 0;
        this.telefone = 0;
        this.cfpIndicado = 0;
    }

    public Cliente(String nome, int cpf, int telefone, int cfpIndicado) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cfpIndicado = cfpIndicado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCfpIndicado() {
        return cfpIndicado;
    }

    public void setCfpIndicado(int cfpIndicado) {
        this.cfpIndicado = cfpIndicado;
    }

    public static void novoCliente(Cliente[] cliente, int i) {
        cliente[i] = new Cliente();
        cliente[i].setNome(Input.readString("Nome: "));
        cliente[i].setCpf(Input.readInt("CPF: "));
        cliente[i].setTelefone(Input.readInt("Tel.: "));
        cliente[i].setCfpIndicado(Input.readInt("CPF: "));

    }

}
