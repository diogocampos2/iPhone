public class AparelhoTelefonico {
    private String numero;

    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }
    
    public void atender() {
        System.out.println("Atendendo.");
    }

    private void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
