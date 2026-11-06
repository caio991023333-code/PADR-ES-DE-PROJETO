package Observer;

public class EmailService implements ObservadorPedido {
    public void aoFinalizarPedido() { System.out.println("Enviando e-mail..."); }
}