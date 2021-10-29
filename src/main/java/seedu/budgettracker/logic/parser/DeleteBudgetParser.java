package seedu.budgettracker.logic.parser;

import seedu.budgettracker.logic.commands.DeleteBudgetCommand;

import java.util.HashMap;

public class DeleteBudgetParser implements ParserPrefix {
    public static final String[] PREFIX_ARRAY = {PREFIX_MONTH};

    public static DeleteBudgetCommand parse(String args) throws NumberFormatException {
        HashMap<String, String> argumentMap = Parser.splitArguments(args, PREFIX_ARRAY);

        int month = ParserUtil.parseMonth(argumentMap.get(PREFIX_MONTH),IS_COMPULSORY);

        return new DeleteBudgetCommand(month);
    }
}