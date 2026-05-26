import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos treinar tabuada!");
        System.out.println("Qual numero vamos calcular hoje?");

        int numeroTabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(  i + " x " + numeroTabuada + " = " + i * numeroTabuada );
        }
    }
}
