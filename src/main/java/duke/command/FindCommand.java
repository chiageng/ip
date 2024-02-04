package duke.command;

import duke.exception.DukeException;
import duke.helpers.Storage;
import duke.helpers.Ui;
import duke.task.TaskList;

/**
 * FindCommand class
 */
public class FindCommand extends Command {
    private String[] commandArr;

    /**
     * Constructor of delete command.
     *
     * @param commandArr Array of commands.
     */
    public FindCommand(String[] commandArr) {
        this.commandArr = commandArr;
    }

    /**
     * Executes delete command.
     *
     * @param tasks List of tasks.
     * @param ui Ui of ai chatbot.
     * @param storage External storage in hard disk.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        try {
            tasks.findTask(commandArr.length > 1 ? commandArr[1] : "");
        } catch (DukeException e) {
            ui.displayToScreen(e.getMessage());
        }

    }

}
