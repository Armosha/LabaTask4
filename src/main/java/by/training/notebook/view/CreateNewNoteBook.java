package by.training.notebook.view;

import by.training.notebook.CommandEnum;
import by.training.notebook.bean.Request;
import by.training.notebook.view.exception.ViewException;

import java.util.Scanner;


public class CreateNewNoteBook extends View {

    @Override
    public Request createRequest(Scanner scanner) throws ViewException {
        return new Request(CommandEnum.CREATE_NEW_NOTEBOOK);
    }
}
