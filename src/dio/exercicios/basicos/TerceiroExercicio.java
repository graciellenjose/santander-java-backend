package dio.exercicios.basicos;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args){
        /*3. Escreva um código que receba a base e a altura de um retângulo,
        * calcule sua área e exiba na tela.
        * fórmula: área = base x altura*/

        System.out.println("Informe a base do retângulo:");
        Scanner getBase = new Scanner(System.in);
        var base = getBase.nextDouble();

        System.out.println("Informe a altura do retângulo:");
        Scanner getHeight = new Scanner(System.in);
        var height = getHeight.nextDouble();

        var area = base * height;

        System.out.printf("A área do retângulo é de: %s", area);

    }
}
