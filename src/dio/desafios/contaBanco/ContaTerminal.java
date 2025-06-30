package dio.desafios.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o número da conta");
        var number = scanner.nextInt();

        System.out.println("Por favor, insira a agência");
        var agency = scanner.next();

        System.out.println("Por favor, insira o nome");
        var clientName = scanner.next();

        System.out.println("Por favor, insira o saldo");
        var balance = scanner.nextDouble();

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo de R$%s já está disponível para saque.", clientName, agency, number, balance);

    }
}
