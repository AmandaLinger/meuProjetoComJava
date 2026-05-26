import java.util.Scanner;

//calculando fatorial
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular o fatorial!");
        System.out.println("Digite um número para fazermos a conta");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for(int i = numero; i > 0; i--){
            fatorial *= i;
        }
        System.out.println( "O fatorial de "+ numero + " é: " + fatorial);
    }
}
