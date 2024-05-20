import java.util.Locale;
import java.util.Scanner;

public class AboutMeWithScanner {
	public static void main(String[] args){ //Um array de argumentos (args)
		
		//Criando o objeto scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
														   //Conversão americana
		System.out.println("Digite o seu nome:");
		String nome = scanner.next(); //Vou pegar o nome na proxima (next) execução

		System.out.println("Digite o seu sobrenome:");
		String sobrenome = scanner.next();

		System.out.println("Digite a sua idade:");
		int idade = scanner.nextInt();

		System.out.println("Digite a sua altura:");
		double altura = scanner.nextDouble();
		
		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Minha altura é " + altura + " cm");
	}

}
