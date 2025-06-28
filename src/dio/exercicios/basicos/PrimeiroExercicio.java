package dio.exercicios.basicos;

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args){
        /*Escreva um código que receba o nome e o ano de nascimento de alguém
         * e imprima na tela a seguinte mensagem: Olá {nome} você tem {idade}
         * anos.*/
        System.out.println("Informe seu nome");
        Scanner getName = new Scanner(System.in);
        var name = getName.next();

        System.out.println("Informe sua idade");
        Scanner getAge = new Scanner(System.in);
        var age = getAge.nextInt();

        System.out.printf("Olá, %s! Você tem %s anos", name, age);

    }
}
