package configurations;

public class Configuration1 implements Configuration {
    private static volatile Configuration instance = null;
    private String config = "Configuração 1";

    private Configuration1() {
    }

    public synchronized static Configuration getInstance() {
        if(instance == null){
            instance = new Configuration1();
        }
        return instance;
    }

    @Override
    public synchronized String getConfig() {
        return this.config;
    }
}
