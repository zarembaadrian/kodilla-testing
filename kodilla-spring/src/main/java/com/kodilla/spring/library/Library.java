package com.kodilla.spring.library;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private LibraryDbController libraryDbController;
    private List<String> books = new ArrayList<>();

    @Autowired
    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {

    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadToDb() {
        libraryDbController.loadData();
    }
}
