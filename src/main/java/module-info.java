module com.jmsweb.fxml.starter {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.jmsweb.fxml.starter to javafx.fxml;
    exports com.jmsweb.fxml.starter;
}
