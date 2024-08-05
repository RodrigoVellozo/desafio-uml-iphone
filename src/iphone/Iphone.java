package iphone;

import browser.NavegadorInternet;
import reprodutor.musical.ReprodutorMusical;
import telefonia.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " via Iphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via Iphone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação via Iphone.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionei a música: " + musica + " via Iphone");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música via Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música via Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " via Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página via Iphone");
    }

}
