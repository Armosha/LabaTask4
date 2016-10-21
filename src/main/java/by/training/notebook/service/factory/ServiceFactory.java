package by.training.notebook.service.factory;

import by.training.notebook.service.ICommandLineService;
import by.training.notebook.service.INoteBookService;
import by.training.notebook.service.impl.CommandLineService;
import by.training.notebook.service.impl.NoteBookService;


public class ServiceFactory {

    private static ServiceFactory instance = new ServiceFactory();

    private final INoteBookService noteBookService = new NoteBookService();
    private  final ICommandLineService commandLineService = new CommandLineService();


    public static ServiceFactory getInstance(){
        return instance;
    }


    public INoteBookService getNoteBookService(){
        return noteBookService;
    }

    public ICommandLineService getCommandLineService(){
        return commandLineService;
    }

}
