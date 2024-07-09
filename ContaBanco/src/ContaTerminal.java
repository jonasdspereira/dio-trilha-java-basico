import java.util.Locale;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        // TODO: Exibir as mensagens para o nosso usuário
        // TODO: Obter pela classe scanner os valores digitados no terminal
        // TODO: Exibir a mensagem com a conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuário

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo "
                + saldo + " já está disponível para saque.");

    }
}
