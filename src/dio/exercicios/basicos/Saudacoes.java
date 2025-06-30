package dio.exercicios.basicos;

import java.util.Scanner;

public class Saudacoes {
    public static void main(String[] args){
        /*Escreva um código que receba o nome e o ano de nascimento de alguém
         * e imprima na tela a seguinte mensagem: Olá {nome} você tem {idade}
         * anos.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome");
        var name = scanner.next();

        System.out.println("Informe sua idade");
        var age = scanner.nextInt();

        System.out.printf("Olá, %s! Você tem %s anos", name, age);

    }
}
