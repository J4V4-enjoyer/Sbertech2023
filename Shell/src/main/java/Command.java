public interface Command {
    String getName();
    String help();
    void exec();
}
