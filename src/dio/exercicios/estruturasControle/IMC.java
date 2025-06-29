package dio.exercicios.estruturasControle;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        //Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu
        // IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

        Scanner getHeight = new Scanner(System.in);
        Scanner getWeight = new Scanner(System.in);

        System.out.println("Insira a altura:");
        var height = getHeight.nextDouble();

        System.out.println("Insira o peso:");
        var weight = getWeight.nextDouble();

        var imc = weight / (height * height);

        System.out.println("IMC: " + imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc == 18.6 || imc == 24.9) {
            System.out.println("Peso ideal");
        }else if (imc == 25 || imc == 29.9) {
            System.out.println("Levemente acima do peso");
        }else if (imc == 30 || imc == 34.9) {
            System.out.println("Obesidade Grau I");
        }else if (imc == 35 || imc == 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        }else{
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
