public class iPhone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.tocar();

        aparelho.ligar("234876238");
        aparelho.atender();

        navegador.exibirPagina("web.dio.me");
    }
}