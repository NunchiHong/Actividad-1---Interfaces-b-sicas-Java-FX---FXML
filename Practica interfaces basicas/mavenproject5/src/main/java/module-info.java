module com.mycompany.mavenproject5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject5 to javafx.fxml;
    exports com.mycompany.mavenproject5;
}
