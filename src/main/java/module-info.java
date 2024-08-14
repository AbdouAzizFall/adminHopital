module com.example.formulaire {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.formulaire to javafx.fxml;
    exports com.example.formulaire;
}