public class Main {
    public static void main(String[] args) {
       Iphone meuIphone = new Iphone();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();

        // Testando AparelhoTelefonico
        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}