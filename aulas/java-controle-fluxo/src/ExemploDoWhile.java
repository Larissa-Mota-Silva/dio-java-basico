import java.util.Random; //Classe para gerar números aleatórios

public class ExemploDoWhile {
    
    /*
        O Do While testa o código depois de roda-lo ao menos uma vez
        O While testa no começo, antes de executar
    */

    public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando()); //O "do" executada até que o "tocando()" retorne false
		
		System.out.println("Alô!!!");
	}

	private static boolean tocando() { //Método que retorna um valor booleano
		boolean atendeu = new Random().nextInt(3)==1;
        //NextInt de 0 até o 2 (exclui o 3), se for igual a um, resulta em verdadeiro, se não, a falso, dai o resultado é guardado na variável "atendeu"
		System.out.println("Atendeu? " + atendeu);
		return ! atendeu; //Se atendeu for true, retorna false, e visse versa
	}

}
