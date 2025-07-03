import configurations.Configuration;
import configurations.Configuration1;
import configurations.Configuration2;

public class Main {
    public static void main(String[] args) {
        Configuration conf1 = Configuration1.getInstance();
        Configuration conf2 = Configuration2.getInstance();

        System.out.println(conf1.getConfig());
        System.out.println(conf2.getConfig());
    }
}