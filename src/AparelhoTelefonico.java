public class AparelhoTelefonico extends Iphone{


    AparelhoTelefonico(double screenSize) {
        super(screenSize);
    }

    public void ligar(String numero){
        if (super.hasSignal){
            println("Ligando para: " + numero);
        } else {
            println("IPhone sem sinal.");
        }
    }

    public void atender(){
        println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz(){
        println("Iniciando correio de voz...");
    }
}
