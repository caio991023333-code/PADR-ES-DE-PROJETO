package Observer;

public class LogService implements ObservadorPedido {
    public void aoFinalizarPedido() { System.out.println("Registrando log..."); }
}