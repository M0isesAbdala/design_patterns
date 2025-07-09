package message.decorators;

import message.Message;

public abstract class AbstractMessageDecorators implements Message{
    protected Message message;

    public AbstractMessageDecorators(Message message) {
        this.message = message;
    }
}
