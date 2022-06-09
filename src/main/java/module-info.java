module com.example.lab_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.lab_4 to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab_4;
}