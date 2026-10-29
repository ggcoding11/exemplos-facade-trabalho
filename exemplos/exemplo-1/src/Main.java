public class Main {
    public static void main() {
        CPU cpu = new CPU();
        Memoria memoria = new Memoria();
        DiscoRigido disco = new DiscoRigido();

        ComputadorFacade facade = new ComputadorFacade(cpu, disco, memoria);

        facade.ligarComputador();
    }
}


