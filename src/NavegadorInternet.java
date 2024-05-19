public class NavegadorInternet extends Iphone{
    NavegadorInternet(double screenSize) {
        super(screenSize);
    }

    public void exibirPagina(String url){
        if (super.isConnected){
            println("Navegador aberto na página: " + url);
        } else {
            println("O IPhone não está conectado na internet");
        }
    }

    public void adicionarNovaAba(){
        println("Nova aba aberta");
    }

    public void atualizarPagina(){
        if (super.isConnected){
            println("Página atualizada");
        } else {
            println("Não foi possível atualizar a página, o IPhone não está conectado a internet");
        }
    }
}
