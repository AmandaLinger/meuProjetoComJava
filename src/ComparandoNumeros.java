import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("digite outro numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("os números são iguais");
        }
        else if(numero1 > numero2){
            System.out.println("o primeiro número é maior");
        }
        else{
            System.out.println("o segundo número é maior");
        }
    }
}
