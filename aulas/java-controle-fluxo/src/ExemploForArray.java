public class ExemploForArray {
    
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x < alunos.length; x++) { //length quer dizer tamanho, então "enquanto esse indice for menor que o tamanho de alunos"
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        /*
         A gente também pode fazer assim: (for each)
            for(String aluno : alunos) {
                System.out.println("O nome do aluno é" + aluno);
            }
         */
    }
}
