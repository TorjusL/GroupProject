module eksamen.eksamen {
    requires javafx.controls;
    requires javafx.fxml;


    opens eksamen.eksamen to javafx.fxml;
    exports eksamen.eksamen;
}