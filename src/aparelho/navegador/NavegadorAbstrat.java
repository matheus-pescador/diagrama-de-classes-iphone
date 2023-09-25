package aparelho.navegador;

public abstract class NavegadorAbstrat implements NavegadorInterface{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
