import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Datafactory {
    public Datafactory(){

    }
    public ObservableList<Tours> getTours(){
        ObservableList<Tours> tour = FXCollections.observableArrayList();
        return tour;
    }
}
