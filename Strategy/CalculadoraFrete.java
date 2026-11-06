package Strategy;
public class CalculadoraFrete {
    public double calcular(EstrategiaFrete estrategia, double peso) {
        return estrategia.calcular(peso);
    }
}