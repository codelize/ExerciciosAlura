public class Exercicio5 {
    public static void main(String[] args) {
        double valorEmDolares = 100.0;
        double cotacaoDolar = 4.94;

        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.printf("O valor em reais é: R$ %.2f%n", valorEmReais);
    }
}
