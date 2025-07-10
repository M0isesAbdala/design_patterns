package proxy;

public class ProxySecurity extends ProxyLazyInitialization {

    public enum Security {
        WRITE,
        READ,
        WRITE_READ
    }

    private Security security;

    public ProxySecurity(String path, Security security) {
        super(path);
        this.security = security;
    }

    @Override
    public void readFile() {
        if(this.security == Security.READ || this.security == Security.WRITE_READ){
            System.out.println("É permitido leitura");
            super.readFile();
            return;
        }
        System.out.println("Não é permitido leitura");
    }

    @Override
    public void writeFile(String file) {
        if(this.security == Security.WRITE || this.security == Security.WRITE_READ){
            System.out.println("É permitido escrita");
            super.writeFile(file);
            return;
        }
        System.out.println("Não é permitido escrita");
    }
}
