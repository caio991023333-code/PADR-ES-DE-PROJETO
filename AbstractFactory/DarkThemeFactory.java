package AbstractFactory;

public class DarkThemeFactory implements GUIFactory {
    public Botao criarBotao() { return new BotaoDark(); }
    public Menu criarMenu() { return new MenuDark(); }
}