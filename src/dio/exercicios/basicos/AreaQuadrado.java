package dio.exercicios.basicos;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args){
        /*2. Escreva um código qe receba o tamanho do lado de um quadrado,
        * calcule sua área e exiba na tela.
        * fórmula: área = lado x lado */

        System.out.println("Informe o tamanho do lado do quadrado:");
        Scanner getSide = new Scanner(System.in);

        var side = getSide.nextDouble();

        var area = side * side;

        System.out.printf("A área do quadrado é: %s", area);
    }
}
