import message.SimpleMessage;
import message.decorators.Base64ToMessage;
import message.decorators.MessageToBase64;

public class Main {

    public static void main(String[] args){
        SimpleMessage ms = new SimpleMessage("Hello world!");
        MessageToBase64 decorators1 = new MessageToBase64(ms);
        System.out.println("Messagem em base64: " + decorators1.send());
        Base64ToMessage decorators2 = new Base64ToMessage(decorators1);
        System.out.println("Mensagem normal: " + decorators2.send());
    }

}
