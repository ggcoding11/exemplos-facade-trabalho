public class PlayerFacade {
    private ArquivoAudio arquivoAudio;
    private SistemaAudio sistemaAudio;
    private Reprodutor reprodutor;

    public PlayerFacade(ArquivoAudio arquivoAudio, SistemaAudio sistemaAudio, Reprodutor reprodutor) {
        this.arquivoAudio = arquivoAudio;
        this.sistemaAudio = sistemaAudio;
        this.reprodutor = reprodutor;
    }

    public void tocarMusica(String musica) {
        arquivoAudio.carregar(musica);
        sistemaAudio.configurarAudio();
        reprodutor.reproduzir();
    }
}
