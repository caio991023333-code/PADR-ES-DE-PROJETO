package Decorator;

public class ComChantilly extends CafeDecorator {
    public ComChantilly(Cafe cafe) { super(cafe); }

    public double getCusto() { return cafeDecorado.getCusto() + 3.0; }
    public String getDescricao() { return cafeDecorado.getDescricao() + ", com Chantilly"; }
}