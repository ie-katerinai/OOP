package calculator;

import java.util.Date;

public class LoggerCalc implements Loggable{
    @Override
    public void saveLog(String str) {
        Date sysdate = new Date();
        System.out.println(sysdate + ". System Log: " + str);
    }
}
