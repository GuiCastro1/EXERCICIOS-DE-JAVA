package pacote_banco;

import java.util.Random;
import java.util.Scanner;

public class Conta {

    int numero_conta;
    String titular_conta;
    double saldo;


    Scanner scan = new Scanner(System.in);

    public Conta(String nome_titular, double saldo_inicial) {
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        numero_conta = gerador_numero.nextInt(1000);
    }

    public void VerSaldo() {
        System.out.println("O número da conta é: " + numero_conta);
        System.out.println("O nome doc titular é: " + titular_conta);
        System.out.println("O saldo da conta é: " + saldo);
    }

    public void Saque(double valor_saque) {
        if (saldo >= valor_saque) {
            saldo = saldo - valor_saque;
            System.out.println("Seu saldo atual é de: " + saldo);
        } else {
            System.out.println("Seu saldo é insuficiente");
        }
    }

    public void Depositar(double valor_deposito) {
        if (valor_deposito <= 0) {
            System.out.println("Deposito inválido, valor menor que 0!");
        } else {
            saldo += valor_deposito;
            System.out.println("Seu saldo atual é de: " + saldo);
        }
    }

    public void Emprestimo() {

        if (saldo > 1000) {
            System.out.println("Emprestimo APROVADO");
            System.out.println("Saldo:" + saldo);
            System.out.print("Informe o valor de emprestimo desejado: ");
            double x = scan.nextDouble();
            saldo += x;
            System.out.println("Seu saldo atual é de:" + saldo);
        } else {
            System.out.println("Emprestimo REPROVADO");
        }
    }

    public void Iniciar() {
        int opcao;
        do {
            Exibir_menu();
            opcao = scan.nextInt();
            Escolher_funcao(opcao);
        } while (opcao != 5);
    }


    public void Exibir_menu() {
        System.out.println("Bem vindo ao banco X");
        System.out.println("Escolha sua opção");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Emprestimo");
        System.out.println("5 - finalizar");
        System.out.print("========>");
    }

    public void Escolher_funcao(int opcao) {
        double saque;
        double deposito;
        switch (opcao) {
            case 1:
                VerSaldo();
                break;
            case 2:
                System.out.print("Digite o valor a ser sacado: ");
                saque = scan.nextDouble();
                Saque(saque);
                break;
            case 3:
                System.out.print("Digite valor a ser depositado: ");
                deposito = scan.nextDouble();
                Depositar(deposito);
                break;
            case 4:
                Emprestimo();
                break;
            case 5:
                System.out.println("Operação finalizada!");
                break;

            default:
                System.out.println("Opção inválida!");
//                break;
        }
    }
}
