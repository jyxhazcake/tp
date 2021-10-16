package seedu.duke.data;

import seedu.duke.data.records.Budget;
import seedu.duke.data.records.Expenditure;

import java.time.LocalDate;
import java.util.ArrayList;

public class AllRecordList {
    private final ArrayList<RecordList> allRecordList;

    /**
     * Constructor that creates 12 RecordLists upon construction.
     */
    public AllRecordList() {
        allRecordList = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            allRecordList.add(new RecordList());
        }
    }

    public void addBudget(double spendingLimit, int month) {
        allRecordList.get(month).addBudget(spendingLimit);
    }

    /**
     * Adds an expenditure record into the RecordList.
     *
     * @param description      description of the expenditure
     * @param amount           amount spent
     * @param isLoadingStorage indicate if this command is called during loading or runtime
     */
    public void addExpenditure(String description, double amount, LocalDate date, boolean isLoadingStorage) {
        int month = date.getMonthValue();
        allRecordList.get(month).addExpenditure(description, amount, date, isLoadingStorage);
    }

    public void deleteBudget(int month) {
        allRecordList.get(month).deleteBudget();
    }

    public void deleteExpenditure(int index, int month) {
        allRecordList.get(month).deleteExpenditure(index);
    }

    public ArrayList<Expenditure> getExpenditureRecords(int month) {
        return allRecordList.get(month).getExpenditureRecords();
    }

    public Budget getBudget(int month) {
        return allRecordList.get(month).getBudget();
    }

    public int getExpenditureListSize(int month) {
        return allRecordList.get(month).getExpenditureListSize();
    }

    public Expenditure getExpenditure(int index, int month) {
        return allRecordList.get(month).getExpenditure(index);
    }

    public int getAllSize() {
        int size = 0;
        for (RecordList monthList : allRecordList) {
            size += monthList.getSize();
        }
        return size;
    }

    public void printRecord(int i) {
    }

    public void addBudgetList(String description, double spendingLimit, int month) {
    }

}
