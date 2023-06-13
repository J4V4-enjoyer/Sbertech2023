import java.time.LocalTime;

public class TimeCommand implements Command {
    public void exec() {
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }

    public String getName() {
        return "time";
    }

    public String help() {
        return "Displays the current time";
    }
}
