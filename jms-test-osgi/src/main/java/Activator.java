import org.springframework.jms.listener.DefaultMessageListenerContainer;

public class Activator {
    private static final String destination = "test.queue";

    private DefaultMessageListenerContainer testListener;

    public static void main(String[] args) {
        System.out.println("Test");
        Factory f = new Factory();
        f.start();
    }
}
