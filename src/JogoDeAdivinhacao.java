import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("Bem vindo ao Jogo da Advinhação!");
        System.out.println("Você terá 5 tentativas para adivinhar o numero secreto");
        System.out.println("Vamos começar?!");

        for(int numeroTentativas = 1; numeroTentativas < 6; numeroTentativas++) {
            System.out.println("Tentativa " + numeroTentativas + " de 5");

            int palpite = scanner.nextInt();

            if(palpite == numeroAleatorio) {
                System.out.println("Parabéns ! o número é :" + numeroAleatorio + ", você usou "
                        + numeroTentativas + " tentativas");
                System.out.println("Você acertou o número secreto!");
                break;
            }

            if (palpite < numeroAleatorio) {
                System.out.println("o número secreto é maior que o número digitado");
            }

            if (palpite > numeroAleatorio) {
                System.out.println("O numero secreto é menor que o número digitado");
            }

            if(numeroTentativas == 5 ) {
                System.out.println("Você perdeu o jogo :( o número era " + numeroAleatorio);
            }
        }
    }
}
