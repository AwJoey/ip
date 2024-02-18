package duke.command.bye;


import duke.command.Command;
import duke.command.CommandResult;

public class ByeCommand extends Command {

    public static final String COMMAND = "bye";
    private static final String MESSAGE_SUCCESS = "================================ \n" +
            "Bye. Hope to see you again soon! \n" +
            "================================ \n";

    public CommandResult execute() {
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
