module starter {
    requires javafx.fxml;
    requires transitive javafx.controls;
    requires transitive javafx.graphics;

    opens com.jmsweb.fxml.starter to javafx.fxml;
    exports com.jmsweb.fxml.starter;
}
