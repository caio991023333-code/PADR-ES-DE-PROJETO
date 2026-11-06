package FactoryMethod;

public class NotificacaoFactory {
    public static Notificacao criarNotificacao(String canal) {
        if (canal.equalsIgnoreCase("EMAIL")) {
            return new NotificacaoEmail();
        } else if (canal.equalsIgnoreCase("SMS")) {
            return new NotificacaoSMS();
        }
        throw new IllegalArgumentException("Canal inválido");
    }
}