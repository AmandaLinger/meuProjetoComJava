public class Produtos {
    public static void main(String[] args) {
        double precoProduto = 59.98;
        int quantidadeProduto = 7;

        double valorTotal = precoProduto * quantidadeProduto;

        System.out.println("Analisando o estoque, fizemos o levantamento da quantidade de ferros de passar roupa que temos." +
                "Foi identificado no estoque :" + quantidadeProduto + " ferros de passar no valor de R$" + precoProduto +
                ". Somando todos os produtos, temos um valor de R$" + valorTotal);
    }
}
