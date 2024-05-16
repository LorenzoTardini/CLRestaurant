module com.lorenzotardini.clrestaurant {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.lorenzotardini.clrestaurant to javafx.fxml;
    exports com.lorenzotardini.clrestaurant;
}