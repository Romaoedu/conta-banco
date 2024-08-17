package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Informe o número da agencia");
        String agencia = scanner.next();
        System.out.println("Informe o número da Conta");
        int numero = scanner.nextInt();
        System.out.println("Informe o nome do Titular da conta");
        String nomeDoCliente = scanner.next();
        System.out.println("Informe o saldo da Conta");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(numero, agencia,nomeDoCliente,saldo);

        System.out.println("Olá "+nomeDoCliente+", obrigado por criar uma conta em nosso banco, sua agencia é a "+ agencia +" conta "+numero+" e seu saldo é "+ saldo);

    }
}