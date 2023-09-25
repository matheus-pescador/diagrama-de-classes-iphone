package aparelho;

public class iPhone {
    public static void main(String[] args) {
        AparelhoMultiuso aparelho = new AparelhoMultiuso();

        System.out.println();
        aparelho.selecionarMusica("High Enough");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println("----------->");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(33008258);

        System.out.println("----------->");
        aparelho.adicionarNovaAba();
        aparelho.exibirPagina();
        aparelho.atualizarPagina();

    }

}