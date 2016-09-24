import greetingmessages.GreetingMessage;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Locale;


public class Runner {
    private static final Logger logger = Logger.getLogger(String.valueOf(Runner.class));

    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();
        logger.info("New request from "+ Locale.getDefault());
        GreetingMessage message = new GreetingMessage();
        System.out.println(message.getWelcomeMessage());
    }

}
