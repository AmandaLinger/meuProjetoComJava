import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // informa que a variavel leitura vai guardar um input

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); //libera a próxima linha para inputar

        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = leitura.nextInt(); // informa que deve esperar um input do tipo inteiro

        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble(); //nforma que deve esperar um input para valores decimais

        System.out.println(filme); // imprimindo no terminal o valor da variavel
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}
