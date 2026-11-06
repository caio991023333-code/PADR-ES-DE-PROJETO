package FactoryMethod;

public class NotificacaoSMS implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}