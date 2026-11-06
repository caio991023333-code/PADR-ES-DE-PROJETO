package AbstractFactory;

public class Aplicacao {
    public void renderizarTela(GUIFactory factory) {
        Botao botao = factory.criarBotao();
        Menu menu = factory.criarMenu();
        botao.desenhar();
        menu.desenhar();
    }
}