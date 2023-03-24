package com.example.assignment_4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataFactory {
    public DataFactory(){

    }
    public ObservableList<Tours> getTours(){
        ObservableList<Tours> tour = FXCollections.observableArrayList();
        return tour;
    }
}
