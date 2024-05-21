public class CaixaEletronica {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo){ //Condicional simples
            saldo = saldo - valorSolicitado;
        }

        System.out.println("O saldo atual é de: " + saldo); 

    }
}