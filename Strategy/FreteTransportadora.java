package Strategy;
public class FreteTransportadora implements EstrategiaFrete {
    public double calcular(double peso) {
        return peso * 2.0;
    }
}