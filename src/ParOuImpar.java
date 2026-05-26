import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if(numero%2==0){
            System.out.println("o número digitado é par");
        } else {
            System.out.println("o número digitado é ímpar");
        }
    }
}
