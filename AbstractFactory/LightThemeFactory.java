package AbstractFactory;

public class LightThemeFactory implements GUIFactory {
    public Botao criarBotao() { return new BotaoLight(); }
    public Menu criarMenu() { return new MenuLight(); }
}