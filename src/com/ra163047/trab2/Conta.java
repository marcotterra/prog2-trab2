package com.ra163047.trab2;

/**
 * Created by marco on 16/05/17.
 */
public class Conta {
    private int numero;
    private Agencia agencia;
    private int cpf;

    public Conta(int numero, Agencia agencia, int cpf) {
        this.numero = numero;
        this.agencia = agencia;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
