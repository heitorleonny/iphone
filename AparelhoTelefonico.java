public interface AparelhoTelefonico {
    public default void ligar(){
        System.out.println("Iniciando ligação");
    }

    public default void atender(){
        System.out.println("Você atendeu o telefone");
    }

    public default void iniciarCorreioDeVoz(){
        System.out.println("O correio de voz foi iniciado");
    }

}
