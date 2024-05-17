public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar (); //Estou chamando o método
        System.out.println("Novo status: Tv ligada? " + smartTv.ligada);

        smartTv.desligar (); 
        System.out.println("Novo status: Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume ();
        System.out.println("Novo status: Volume atual? " + smartTv.volume);

        smartTv.diminuirVolume ();
        smartTv.diminuirVolume (); //Diminui duas vezes
        System.out.println("Novo status: Volume atual? " + smartTv.volume);
    
        smartTv.mudarCanal(13); //Assim a gente ta atribuindo um valor, um canal
        System.out.println("Novo status: Canal atual? " + smartTv.canal);
    }
}
