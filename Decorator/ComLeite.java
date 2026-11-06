package Decorator;

public class ComLeite extends CafeDecorator {
    public ComLeite(Cafe cafe) { super(cafe); }

    public double getCusto() { return cafeDecorado.getCusto() + 2.0; }
    public String getDescricao() { return cafeDecorado.getDescricao() + ", com Leite"; }
}