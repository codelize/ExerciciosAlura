public class Exercicio6 {
    public static void main(String[] args) {
        double precoOriginal = 200.0;
        double percentualDesconto = 10.0; // 10%

        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);
    }
}
