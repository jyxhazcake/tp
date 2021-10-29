package seedu.budgettracker.logic.commands;

import seedu.budgettracker.storage.Storage;

public class YearCommand extends Command {
    public static final String COMMAND_WORD = "year";
    public static String recordListDirectory;

    public YearCommand(String directoryOfRecordList) {
        this.recordListDirectory = directoryOfRecordList;
    }

    @Override
    public void execute(boolean isLoadingStorage) {
        Storage budgetStorage = new Storage();
        budgetStorage.makeStorageTextFile(recordListDirectory);
        allRecordList.clearAll();
        allRecordList.storageDirectory = budgetStorage.loadStorage(allRecordList, recordListDirectory);
    }
}