package singleton;

public class AppConfig {

    private static AppConfig instance;

    private String moeda = "BRL";

    private AppConfig() {}

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getMoeda() {
        return moeda;
    }
}
