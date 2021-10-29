package seedu.budgettracker.logic.commands;

import seedu.budgettracker.ui.TextUi;

public class DeleteSingleLoanCommand extends DeleteCommand {

    public static final String MESSAGE_USAGE = "Delete an loan record.\n"
            + "Parameters: l/INDEX_OF_LOAN m/MONTH";
    public final int index;
    public final int month;

    public DeleteSingleLoanCommand(int index, int month) {
        this.index = index;
        this.month = month;
    }

    /**
     * LocalDate.now().getMonthValue() is being used as a placeholder
     */
    @Override
    public void execute(boolean isLoadingStorage) {
        TextUi.showSingleLoanDeletedMessage(index + 1,
                allRecordList.getLoan(index, month));
        allRecordList.deleteLoan(index + 1, month);
    }
}