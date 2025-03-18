package aula1;

import java.util.Scanner;

public class TestaGerente {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        Gerente gerente01 = new Gerente();
        gerente01.setNome("Lucas");
        gerente01.setSenha(1234);
        gerente01.autenticar(2563);

    }
}