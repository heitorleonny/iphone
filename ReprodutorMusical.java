public interface ReprodutorMusical {
    public default void tocar(){
        System.out.println("Tocando música");
    }

    public default void pausar(){
        System.out.println("A música foi pausada");
    }

    public default void selecionarMusica(){
        System.out.println("Selecionando música");
    }

}
