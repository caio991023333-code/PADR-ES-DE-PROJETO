package Observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ObservadorPedido> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorPedido obs) {
        observadores.add(obs);
    }

    public void finalizar() {
        for (ObservadorPedido obs : observadores) {
            obs.aoFinalizarPedido();
        }
    }
}