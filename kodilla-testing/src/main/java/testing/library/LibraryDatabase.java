package testing.library;

import java.util.List;

public interface LibraryDatabase {

    List<Book> listBookWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);
}
