package message.decorators;

import message.Message;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class MessageToBase64 extends AbstractMessageDecorators{
    public MessageToBase64(Message message) {
        super(message);
    }

    @Override
    public String send() {
        return Base64.getEncoder().encodeToString(message.send().getBytes(StandardCharsets.UTF_8));
    }
}
