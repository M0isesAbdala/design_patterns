package message.decorators;

import message.Message;

import java.util.Arrays;
import java.util.Base64;

public class Base64ToMessage extends AbstractMessageDecorators{

    public Base64ToMessage(Message message) {
        super(message);
    }

    @Override
    public String send() {
        return new String(Base64.getDecoder().decode(message.send()));
    }
}
