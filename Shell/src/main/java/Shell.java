import java.util.*;

public class Shell {
    private Map<String, Command> commandMap = new HashMap<>();
    public Shell() {
        commandMap.put("date", new DateCommand());
        commandMap.put("time", new TimeCommand());
        }

    public void start() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String command = in.next();
//            String[] commands = command.trim().split("\\s+");
            Command comm = commandMap.get(command);
            if (comm != null) {
                comm.exec();
            }
            else {
                System.out.println("Invalid command");
            }
        }
    }
}