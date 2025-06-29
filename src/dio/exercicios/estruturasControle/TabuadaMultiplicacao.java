package dio.exercicios.estruturasControle;

import java.util.Scanner;

public class TabuadaMultiplicacao {
    static public void main(String[] args){
        //Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número

        Scanner getNumber = new Scanner(System.in);
        System.out.println("Insira um número:");
        var number = getNumber.nextInt();

        for(var i = 1; i <= 10; i++){
            var multiplication = number * i;

            System.out.println(number + " * " + i + " = " + multiplication);
        }
    }
}
