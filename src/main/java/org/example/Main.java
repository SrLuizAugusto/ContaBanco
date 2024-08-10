package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da Conta: ");
        conta.numero = sc.nextInt();

        sc = new Scanner(System.in); //Limpando a variável pois estava pulando a etapa
        System.out.println("Digite o número do Agência: ");
        conta.agencia = sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        conta.nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo atual: ");
        conta.saldo = sc.nextFloat();
        sc.close();


        System.out.println("\n\n________________________________________________\n\n"+
                "Olá "+ conta.nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +
                conta.agencia+", conta " +conta.numero+ " e seu saldo: R$"+ conta.saldo +
                " já está disponível para saque");
    }
}
