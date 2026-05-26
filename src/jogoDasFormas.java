import java.util.Scanner;

public class jogoDasFormas {
    public static void main(String[] args) {
        float calculaAreaDoQuadrado;
        float calculaAreaDoCirculo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo das formas");
        System.out.println("""
                Escolha: 
                1- calcular a área do quadrado
                2- calcular a área do círculo
                """);

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("digite o tamanho do lado do quadrado");
                float tamanhoQuadrado = scanner.nextInt();
                System.out.println("A área do quadrado é " + tamanhoQuadrado*tamanhoQuadrado);
                break;

            case 2:
                System.out.println("digite o tamanho do raio da circulo");
                float raioCirculo = scanner.nextFloat();
                System.out.println("a área do círculo é " + 3.14*(raioCirculo*raioCirculo));
                break;
        }
    }
}
