import org.springframework.jms.listener.DefaultMessageListenerContainer;

public class Factory {
    private static final String destination = "test.queue";

    private DefaultMessageListenerContainer testListener;

    public Factory() {
    }

    public void start() {
        testListener = new DefaultMessageListenerContainer();
        testListener.setDestinationName(destination);
        testListener.setSessionTransacted(true);
    }
}
