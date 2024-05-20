import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite número da agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome +  ", obrigado por criar uma conta em nosso banco," +
                            "\nsua agência é " + agencia + ", conta " + numero + 
                            "\ne seu saldo de " + saldo + " já está disponível para saque");
    }
}
