module com.dmd.calcularedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dmd.calcularedad to javafx.fxml;
    exports com.dmd.calcularedad;
}
