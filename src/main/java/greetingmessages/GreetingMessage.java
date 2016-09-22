package greetingmessages;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;


public class GreetingMessage {
    private final String MESSAGES = "messages";
    private final String CUSTOMER = "customer";

    private Locale location(){
        return Locale.getDefault();
    }


    public String getWelcomeMessage() {
        GreetingMessageConstructor messageConstructor = new GreetingMessageConstructor();
        StringBuilder message = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);

        message.append(ResourceBundle.getBundle(MESSAGES, location()).getString(messageConstructor.messageCreator(hours)));
        message.append(", ");
        message.append(ResourceBundle.getBundle(MESSAGES, location()).getString(CUSTOMER));
        message.append("! ");

        return message.toString();
    }

}
