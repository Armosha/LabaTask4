package by.training.notebook.service;

import by.training.notebook.bean.entity.Note;
import by.training.notebook.service.exception.ServiceException;

import java.util.Date;


public interface INoteBookService {

    void addNote(Date dateOfCreation, String content) throws ServiceException;
    void createNewNoteBook();
    Note[] showNotes();

    void loadFromFile() throws ServiceException;
    void writeInFile() throws ServiceException;

    Note[] searchNotesByContent(String content) throws ServiceException;
    Note[] searchNotesByDateOfCreation(Date date) throws ServiceException;

}
