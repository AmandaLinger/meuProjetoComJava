public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String tipoPlano = "plus";


        //iniciando condicionais no java
        if(anoDeLancamento >= 2022){
            System.out.printf("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retro que compensa assistir");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){ //use o .equals para comparar strings
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a assinatura para acessar");
        }
    }
}
