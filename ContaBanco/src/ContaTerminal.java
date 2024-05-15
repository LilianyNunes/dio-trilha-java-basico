import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
