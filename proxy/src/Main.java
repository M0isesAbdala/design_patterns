import proxy.ProxySecurity;

public class Main {

    public static void main(String[] args){
        ProxySecurity proxy = new ProxySecurity("readme.txt", ProxySecurity.Security.WRITE_READ);
        proxy.readFile();
        proxy.writeFile("hello");
    }
}
