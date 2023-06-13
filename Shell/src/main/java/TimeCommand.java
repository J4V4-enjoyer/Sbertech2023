import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeCommand implements Command {
    public void exec() {
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));
    }

    public String getName() {
        return "time";
    }

    public String help() {
        return "Displays the current time";
    }
}
