package dio.exercicios.estruturasControle;

import java.util.Scanner;

public class ListaParImpar {
    public static void main(String[] args){
        /* Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe
           entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a
           seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;*/

        Scanner getNumberA = new Scanner(System.in);
        Scanner getNumberB = new Scanner(System.in);

        System.out.println("Insira um número:");
        var numberA = getNumberA.nextInt();

        System.out.println("Insira um número maior que o inserido anteriormente:");
        var numberB = getNumberB.nextInt();

        if(numberA > numberB){
            System.out.println("O 2º número precisa ser maior que o 1º");
        }else{
            var i = numberA;
            while(i <= numberB){
                var oddOrEven = i % 2;

                if (oddOrEven > 0){
                    System.out.println("Número ímpar: " + i);
                } else{
                    System.out.println("Número par: " + i);
                }

                i++;
            }
        }
    }
}
