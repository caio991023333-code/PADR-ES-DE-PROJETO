package Adapter;

public class FastPayAdapter implements ProcessadorPagamento {
    private FastPayLegacy fastPayLegacy;

    public FastPayAdapter(FastPayLegacy fastPayLegacy) {
        this.fastPayLegacy = fastPayLegacy;
    }

    public void processar(double valorEmReais) {
        double valorEmDolares = valorEmReais / 5.0;
        fastPayLegacy.executeTransaction(valorEmDolares);
    }
}