public class ComputadorFacade {
    private CPU cpu;
    private DiscoRigido discoRigido;
    private Memoria memoria;

    public ComputadorFacade(CPU cpu, DiscoRigido discoRigido, Memoria memoria) {
        this.cpu = cpu;
        this.discoRigido = discoRigido;
        this.memoria = memoria;
    }

    public void ligarComputador() {
        cpu.ligar();
        discoRigido.iniciar();
        memoria.carregar();
    }
}
