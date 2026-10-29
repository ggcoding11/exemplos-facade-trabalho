public class Main {
    public static void main() {
        PlayerFacade facade = new PlayerFacade(new ArquivoAudio(), new SistemaAudio(), new Reprodutor());

        facade.tocarMusica("Back in Black");
    }
}