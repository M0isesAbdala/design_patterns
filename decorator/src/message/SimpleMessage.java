package message;

public class SimpleMessage implements Message {
    private String message= null;

    public SimpleMessage(String message) {
        this.message = message;
    }

    @Override
    public String send() {
        return this.message;
    }
}
