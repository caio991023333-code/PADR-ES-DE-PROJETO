package FactoryMethod;

public class ProcessadorNotificacao {
    public void enviar(String canal, String mensagem) {
        Notificacao notificacao = NotificacaoFactory.criarNotificacao(canal);
        notificacao.enviar(mensagem);
    }
}