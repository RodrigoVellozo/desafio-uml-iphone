package telefonia;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero "+numero+"...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Correio de Voz");
    }

    @Override
    public void atender() {
      System.out.println("Atendendo ligação");
    }
}
