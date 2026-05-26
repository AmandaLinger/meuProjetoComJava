import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1){
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar:  ");
            nota = scanner.nextDouble();

            if(nota != -1){
                media += nota; // a variavel media recebe ela mesma + o  valor da nota inputado
                totalDeNotas ++; // incrementa +1 toda vez que o loop passar por essa linha
            }
        }

        System.out.println("Média de avaliações :" + media/3  );
    }
}
