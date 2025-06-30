package dio.desafios.explorandoSintaxe;

import java.util.Scanner;

public class NormalizadorUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a entrada do usuário
        String url = scanner.nextLine();

        // TODO: Normalize a URL: removendo espaços e convertendo para minúsculas
        var lowerCaseUrl = url.toLowerCase();
        var formatUrl = lowerCaseUrl.replaceAll("\\s+", "");

        // TODO: Exiba a URL normalizada
        System.out.println(formatUrl);


        scanner.close();
    }
}
