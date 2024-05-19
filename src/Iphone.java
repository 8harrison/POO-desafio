public class Iphone {

    double screenSize;
    int volume = 0;
    boolean isPlaying = false;
    boolean hasSignal = true;
    boolean isConnected = true;

    Iphone(double screenSize) {
        this.screenSize = screenSize;
    }

    void aumentarVolume(){
        volume++;
    }

    void diminuirVolume(){
        volume--;
    }

    public static void println(Object object) {
        System.out.println(object);
    }
}
