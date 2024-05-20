public class AboutMe {
	public static void main(String[] args){ //Um array de argumentos (args)
		
        //Os argumentos começam com o indice 0
		String nome = args [0]; //Uma variavel que vai receber um elemento do nosso array
		String sobrenome = args [1];
		int idade = Integer.valueOf(args[2]); 
		double altura = Double.valueOf(args[3]);
		
		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Minha altura é " + altura + " cm");
	}

}
