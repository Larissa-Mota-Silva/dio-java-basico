import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
            while(mesada > 0) { //Até que mesada chega igual a 0
                Double valorDoce = valorAleatorio(); 

                if(valorDoce > mesada){
                    valorDoce = mesada;
                }

                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }

            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");
            
            //Vereremos sobre a formatação de valores mais pra frente
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); //Retorna pra gente um valor aleatório entre 2 e 8
    }
}
