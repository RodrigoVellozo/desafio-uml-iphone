package browser;

public class Safari implements NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página em Safari: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba em Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página em Safari");
    }

}
