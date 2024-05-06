//Vamos criar um exemplo de uma classe para representar uma SmartTV onde:.
//1.Ela tenha as características:ligada(boolean),canal(int) e volume(int)
//2.Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//3.Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
//4.Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

public class Usuario {
    public static void main(String[] args) throws Exception { //metodo que executa nossa aplicação
        
        SmartTv smartTv = new SmartTv(); //essa é a forma de criar uma classe pra ilustrar a interação dos metodos e atributos etc..

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}

//o que podemos observar com este projetinho
//- O nome dos metodos são legiveis
//- Nem todos os metodos precisam me dar retorno
//- Alguns metodos terão parametros
//- E esse metodos podem manipular as variaveis ou as caracteristicas do nosso objeto principal