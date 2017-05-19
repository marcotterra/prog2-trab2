package com.prog2.trab2;

public class Main {
    private static char op; // seletor de opcao do menu
    private static int nAg = 1; // contador do numero de agencia
    private static int nCl; // contador do numero de clientes


    private static void menu() {
        System.out.println( "[a] Cadastrar agencia\n" +
                            "[b] Cadastrar cliente\n" +
                            "[c] Cadastrar conta\n" +
                            "[d] Listar contar por agencia\n" +
                            "[e] Listar contas por cliente\n" +
                            "[f] Listar clientes por agencia");
        op = Input.readChar("Escolha uma opcao: ");
    }

    public static void main(String[] args) {
        Agencia[] ag = new Agencia[nAg];

        while (true) {
            switch (op) {
                case 'a':
                    ag[nAg+1] = new Agencia();
                    ag[nAg+1].novaAgencia();
                    nAg++;
                    break;
            }
            menu();
        }


    }

}
