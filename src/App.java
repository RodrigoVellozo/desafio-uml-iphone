import browser.NavegadorInternet;
import iphone.Iphone;
import reprodutor.musical.ReprodutorMusical;
import telefonia.AparelhoTelefonico;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        ReprodutorMusical rm = iphone;
        AparelhoTelefonico at = iphone;
        NavegadorInternet browser = iphone;

        System.out.println("----- MUSIC -----");
        rm.selecionarMusica("Chefe do crime perfeito");
        rm.tocarMusica();
        rm.pausar();

        System.out.println("----- TELEFONE-----");
        at.ligar("994296547");
        at.atender();
        at.iniciarCorreioVoz();

        System.out.println("----- SAFARI -----");
        browser.exibirPagina("https://www.google.com");
        browser.adicionarNovaAba();
        browser.atualizarPagina();

    }
}
