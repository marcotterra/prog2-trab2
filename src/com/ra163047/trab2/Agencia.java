package com.ra163047.trab2;

/**
 * Created by marco on 16/05/17.
 */
public class Agencia {
    private int noContas;
    private int id;
    private String nome;
    private String enrereco;

    public Agencia() {
        this.noContas += 1;
        this.id += 1;
    }

    public Agencia(String nome, String endereco){
        this.nome = nome;
        this.enrereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEnrereco(String enrereco) {
        this.enrereco = enrereco;
    }
    public String getEnrereco() {
        return enrereco;
    }

    public int getNoContas() {
        return noContas;
    }
    public void setNoContas(int noContas) {
        this.noContas = noContas;
    }
    public void sumNoContas() {
        this.noContas += 1;
    }

    public void novaAgencia() {
        this.noContas++;
        System.out.println("AG.0"+id);
        this.setNome(Input.readString("Nome da agencia: "));
        this.setEnrereco(Input.readString("Endereco da agencia: "));
    }



}
