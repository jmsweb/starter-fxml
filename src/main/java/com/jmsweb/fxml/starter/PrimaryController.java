package com.jmsweb.fxml.starter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class PrimaryController implements Initializable {
    @FXML
    public Label versionLabel;

    private String javaVersion = SystemInfo.javaVersion();
    private String javafxVersion = SystemInfo.javafxVersion();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        versionLabel.setText("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
    }
}
