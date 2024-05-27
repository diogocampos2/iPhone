public class ReprodutorMusical {
    private String musica;
    
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }
    
    private void selecionarMusica(String musica){
        System.out.println("Selecionando música:" + musica);
    }
}
