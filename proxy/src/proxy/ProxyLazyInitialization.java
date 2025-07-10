package proxy;

import file.File;
import file.FileImpl;

public class ProxyLazyInitialization implements File {
    private File file = null;
    private String path = null;

    public ProxyLazyInitialization(String path) {
        this.path = path;
    }

    private void initialization(){
        if(this.file == null){
            System.out.println("Inicialização tardia");
            this.file = new FileImpl(this.path);
        }
    }

    @Override
    public void readFile() {
        this.initialization();
        System.out.println("proxy lendo no file");
        this.file.readFile();
    }

    @Override
    public void writeFile(String file) {
        this.initialization();
        System.out.println("proxy escrevendo no file");
        this.file.writeFile(file);
    }
}
