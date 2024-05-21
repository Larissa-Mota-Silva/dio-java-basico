package Excecoes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        
        try{ //Acompanha tudo que for positivo, se tudo for okay, beleza
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   
        }
        catch (InputMismatchException e){ //Se algo estiver errado, dispara esse catch
            //Exceção de input equivocado de dados
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}