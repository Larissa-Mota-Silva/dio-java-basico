public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Para manipular os estados da TV
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("*Aumentando o volume para:* " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("*Diminuindo o volume para:* " + volume);
    }

    public void mudarCanal(int novoCanal){ //Assim, ao invés de ir de um em um, o "usuário" pode digitar que canal deseja
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

}
