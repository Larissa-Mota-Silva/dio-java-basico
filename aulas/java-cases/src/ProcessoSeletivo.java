import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        /* analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0); */

        selecaoCandidatos();

        imprimirSelecionados();

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        //Definindo os nomes só pra ter uma ideia de como seria

        for(String candidato: candidatos){ // Uma simplificação para "for(int indice=0; indice < candidatos.length; indice++)"
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas ++;
            }
            else{
                System.out.println("\nContato realizado com sucesso!");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("\nConseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }
        else{
            System.out.println("\nNão conseguimos contato com " + candidato + " e o número máximo de tentativas foi atingido");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando  resultado dos demais candidatos");
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
    
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =  valorPretendido();

            System.out.println("\nO candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            else{
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
            }

            candidatoAtual ++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        //Definindo os nomes só pra ter uma ideia de como seria

        System.out.println("\nImprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
        }
    }
}
