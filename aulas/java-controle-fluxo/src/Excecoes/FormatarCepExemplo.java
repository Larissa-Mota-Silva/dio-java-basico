package Excecoes;

public class FormatarCepExemplo { //Lógica principal para formatar o CEP e tratas exceções
    
    public static void main(String[] args) {
        try { //O código aqui dentro pode lançar uma exceção
            String cepFormatado = formatarCep("23750694"); //Tenta formatar o CEP chamando o método formatarCep ali debaixo e armazena em cepFormatado
            System.out.println(cepFormatado); //Imprime o CEP formatado
        } 
        catch (CepInvalidoException e) { //"Captura" a exceção se ela aparecer no bloco try
            System.out.println("Cep inválido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8) //Se o comprimento do CEP não for igual a 8
          throw new CepInvalidoException(); //este método pode lançar uma exceção do tipo CepInvalidoException
        
          //simulando um cep formatado
          return "23.765-068"; //Agora se não houver exceção, ele retorna este cep formatado
                               //Como é só um teste, não tem porque realmente fazer o processo de formatação, é só um exemplo
    }
}
