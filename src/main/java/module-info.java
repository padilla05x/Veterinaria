module co.edu.uniquindio.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens co.edu.uniquindio.veterinaria to javafx.fxml;
    exports co.edu.uniquindio.veterinaria;
    exports co.edu.uniquindio.veterinaria.controller;
    opens co.edu.uniquindio.veterinaria.controller to javafx.fxml;
}