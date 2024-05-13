public class MinhaClasse { 
    
    public static void main(String [] args) { //Tipo string com parametro array que se chamará args 
        
        String primeiroNome = "Larissa";
        String segundoNome = "Mota";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        //"System, me de uma saída cujo vai ser uma impressão"

    } 

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
        //Retorna o primeiro nome, concatenado (+ ou concat) com um espaço, e depois com o segundo nome
    }

}
