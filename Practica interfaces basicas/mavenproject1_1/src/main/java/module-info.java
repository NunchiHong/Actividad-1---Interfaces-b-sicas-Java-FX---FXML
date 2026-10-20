module com.mycompany.mavenproject1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject1_1 to javafx.fxml;
    exports com.mycompany.mavenproject1_1;
}
