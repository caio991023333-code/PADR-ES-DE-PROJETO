package Singleton;

public class ConfiguracaoApp {
    private static ConfiguracaoApp instancia;
    private String urlBanco;

    private ConfiguracaoApp() {
        System.out.println("Lendo arquivo de configurações do disco...");
        this.urlBanco = "jdbc:mysql://localhost:3306/meubanco";
    }

    public static ConfiguracaoApp getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoApp();
        }
        return instancia;
    }

    public String getUrlBanco() {
        return urlBanco;
    }
}