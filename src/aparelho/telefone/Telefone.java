package aparelho.telefone;

public class Telefone extends TelefoneAbstrat {
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
