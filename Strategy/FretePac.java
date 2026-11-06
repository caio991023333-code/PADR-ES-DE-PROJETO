package Strategy;
public class FretePac implements EstrategiaFrete {
    public double calcular(double peso) {
        return peso * 0.8 + 5;
    }
}