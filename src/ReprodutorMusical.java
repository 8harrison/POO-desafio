public class ReprodutorMusical extends Iphone{
    ReprodutorMusical(double screenSize) {
        super(screenSize);
    };

    void tocar(){
        super.isPlaying = true;
        println("Música tocando...");
    };

    void pausar(){
        super.isPlaying = false;
        println("Música pausada");
    };

    void selecionarMusica(String musica){
        println("Você escolheu a música " + musica);
    };
}
