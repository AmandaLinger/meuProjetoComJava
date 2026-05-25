public class DescontoPorcentagem {
    public static void main(String[] args) {
        double precoOriginal = 100.0;
        double percentualDesconto = 0.10;
        double precoDesconto = precoOriginal - (precoOriginal * percentualDesconto);
        System.out.println("Ao realizar sua compra de R$"+precoOriginal + ", você ganha 10% de deconto." + "o valor a ser pago é " + precoDesconto);
    }
}