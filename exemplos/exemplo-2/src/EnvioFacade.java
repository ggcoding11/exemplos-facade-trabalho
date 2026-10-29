public class EnvioFacade {
    private Embalagem embalagem;
    private Etiqueta etiqueta;
    private Transportadora transportadora;

    public EnvioFacade(Embalagem embalagem, Etiqueta etiqueta, Transportadora transportadora) {
        this.embalagem = embalagem;
        this.etiqueta = etiqueta;
        this.transportadora = transportadora;
    }

    public void enviarPedido() {
        embalagem.embalarProduto();
        etiqueta.gerarEtiqueta();
        transportadora.solicitarColeta();
    }
}
