public class PlanoOperadora {
    
    public static void main(String[] args) {
        
        String plano = "M";

        switch (plano){ 
        //Nesse caso não usamos o break em cada case, pois queremos que vá acrescentando (continuidade) a cada nível, não que seja apenas um
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }

    }

}
