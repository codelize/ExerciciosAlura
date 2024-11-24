import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(101); // Gera um número aleatório entre 0 e 100 (inclusive)
        int tentativas = 0;
        int numeroDigitado = 0;

        // Apenas para depuração: Mostra o número gerado (remova essa linha em produção)
        System.out.println("DEBUG: Número gerado (não mostre isso ao jogador): " + numeroGerado);

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativa(s)!");
                break; // Interrompe o loop ao acertar o número
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: " + numeroGerado);
        }

        leitor.close(); // Fecha o Scanner
    }
}
