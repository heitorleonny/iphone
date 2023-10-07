public interface Navegador {
    public default void exibirPagina(){
        System.out.println("Exibindo página");
    }

    public default void adicionarNovaPagina(){
        System.out.println("Uma nova página foi adicionada");
    }

    public default void atualizarPagina(){
        System.out.println("Página atualizada");
    }
}
