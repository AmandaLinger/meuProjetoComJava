//iniciando em loops no java

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for(int i = 0; i < 3; i++){ //iniciando um loop para perguntar a avaliação 3 vezes
            System.out.println("Diga sua avaliação para o filme: ");
            nota = scanner.nextDouble();

            media += nota; // a variavel media recebe ela mesma mais o  valor da nota inputado
        }

        System.out.println("Média de avaliações :" + media/3  );
    }
}
