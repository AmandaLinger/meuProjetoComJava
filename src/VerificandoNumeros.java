import java.util.Scanner;

public class VerificandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        if(numeroDigitado >= 0){
            System.out.println("o número " + numeroDigitado + " é positivo!" );
        }
        else{
            System.out.println("o número " +  numeroDigitado + " é negativo!");
        }
    }
}
