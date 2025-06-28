package dio.exercicios.basicos;

import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args){
        /*4. Escreva um código que receba o nome e a idade de 2 pessoas
        * e imprima a diferença de idade entre elas.*/

        System.out.println("Informe o nome da primeira pessoa:");
        Scanner getNameA = new Scanner(System.in);
        var nameA = getNameA.next();
        System.out.println("Informe a idade da primeira pessoa:");
        Scanner getAgeA = new Scanner(System.in);
        var ageA = getAgeA.nextInt();


        System.out.println("Informe o nome da segunda pessoa:");
        Scanner getNameB = new Scanner(System.in);
        var nameB = getNameB.next();
        System.out.println("Informe o idade da segunda pessoa:");
        Scanner getAgeB = new Scanner(System.in);
        var ageB = getAgeB.nextInt();

        //serve para deixar o número de positivo independentemente
        var ageDifference = Math.abs(ageA - ageB);

        System.out.printf("Considerando que %s possui %s anos e %s, %s anos; a diferença de idade entre os dois é de %s", nameA, ageA, nameB, ageB, ageDifference);
    }
}
