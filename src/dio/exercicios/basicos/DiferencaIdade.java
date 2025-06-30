package dio.exercicios.basicos;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args){
        /*4. Escreva um código que receba o nome e a idade de 2 pessoas
        * e imprima a diferença de idade entre elas.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da primeira pessoa:");
        var nameA = scanner.next();
        System.out.println("Informe a idade da primeira pessoa:");
        var ageA = scanner.nextInt();


        System.out.println("Informe o nome da segunda pessoa:");
        var nameB = scanner.next();
        System.out.println("Informe o idade da segunda pessoa:");
        var ageB = scanner.nextInt();

        //serve para deixar o número de positivo independentemente
        var ageDifference = Math.abs(ageA - ageB);

        System.out.printf("Considerando que %s possui %s anos e %s, %s anos; a diferença de idade entre os dois é de %s", nameA, ageA, nameB, ageB, ageDifference);
    }
}
