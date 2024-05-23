import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite o primeiro parametro: ");
            int parametro1 = scanner.nextInt();

            System.out.println("Digite o segundo parametro: ");
            int parametro2 = scanner.nextInt();

            contar(parametro1, parametro2);

        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

        static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
            if(parametro1 > parametro2){
                throw new ParametrosInvalidosException();
            }
            else{
                int contagem = parametro2 - parametro1;
                int i = 1;

                System.out.println("A subtração (a contagem) dos dois números deu " + contagem);

                for(i=1; i<=contagem; i++){
                    System.out.println("Imprimindo o número um: " + parametro1);
                    System.out.println("Imprimindo o número dois: " + parametro2 + "\n");
                
                }
            }
        }
}
