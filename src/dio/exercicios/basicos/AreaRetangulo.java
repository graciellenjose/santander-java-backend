package dio.exercicios.basicos;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args){
        /*3. Escreva um código que receba a base e a altura de um retângulo,
        * calcule sua área e exiba na tela.
        * fórmula: área = base x altura*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do retângulo:");
        var base = scanner.nextDouble();

        System.out.println("Informe a altura do retângulo:");
        var height = scanner.nextDouble();

        var area = base * height;

        System.out.printf("A área do retângulo é de: %s", area);

    }
}
