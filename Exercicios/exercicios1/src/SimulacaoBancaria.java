import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Que operação deseja realizar? \n\n 1.Depositar \n2.Sacar \n3.Consultar Saldo \n4.Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double depositado = scanner.nextDouble();
                    saldo = saldo + depositado;
                    System.out.println("Com este deposito, o seu saldo atual é de: " + String.format("%.2f", saldo));
                    continuar = true;
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double sacar = scanner.nextDouble();
                    if(saldo >= sacar){
                      saldo = saldo - sacar;
                      System.out.println("Dinheiro retirado. Saldo atual: " + String.format("%.2f", saldo));
                    }
                    else{
                      System.out.println("Saldo insuficiente");
                    }
                    continuar = true;
                    break;
                case 3:
                    System.out.println("O seu saldo atual é de: " + String.format("%.2f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}