import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCommand implements Command {
    public void exec(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    public String getName() {
        return "date";
    }

    public String help() {
        return "Displays the current date";
    }
}
