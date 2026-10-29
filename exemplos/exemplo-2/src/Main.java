public class Main {
    public static void main() {
        EnvioFacade facade = new EnvioFacade(new Embalagem(), new Etiqueta(), new Transportadora());

        facade.enviarPedido();
    }
}