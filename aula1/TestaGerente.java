package aula1;

import java.util.Scanner;

public class TestaGerente {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        Gerente gerente01 = new Gerente();
        Funcionario funcionario = gerente01;

        Funcionario funcionarioDiretor = gerente01;

        Gerente ger = new Gerente();
        funcionarioDiretor = ger;
    }
}