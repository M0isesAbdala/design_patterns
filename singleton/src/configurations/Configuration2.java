package configurations;

public class Configuration2 implements Configuration{
    private static volatile Configuration instance = null;
    private String config = "Configuração 2";

    private Configuration2() {
    }

    public synchronized static Configuration getInstance() {
        if(instance == null){
            instance = new Configuration2();
        }
        return instance;
    }

    @Override
    public synchronized String getConfig() {
        return this.config;
    }
}
