package greetingmessages;


import org.apache.log4j.Logger;

import java.util.Date;


class GreetingMessageConstructor implements MessageConstructor {
    private static Logger log = Logger.getLogger(GreetingMessageConstructor.class.getName());

    @Override
    public String messageCreator(int hours) {
        String result = "";
        if ((hours >= 6) && (hours < 9)){
            result = String.valueOf(TIME_OF_DAY.MORNING);
        }else if ((hours >= 9) && (hours < 19)){
            result = String.valueOf(TIME_OF_DAY.DAY);
        }else if ((hours >= 19) && (hours < 23)){
            result = String.valueOf(TIME_OF_DAY.EVENING);
        }else if ((hours == 23) || (hours >= 0) && (hours < 6)) {
            result = String.valueOf(TIME_OF_DAY.NIGHT);
        } else {
            log.info("Unexpected current time" + new Date().toString());
        }
        return result;
    }

}
