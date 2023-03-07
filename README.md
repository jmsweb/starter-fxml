## Building for Distribution

- Step 1: Set JAVA_HOME to 11, 17, or 19 SDK
    - `export JAVA_HOME=<path to sdk>`
- Step 2: Compile and Run JavaFX
    - `mvn clean compile javafx:run`
- Step 3: Generate runtime image
    - `mvn clean compile javafx:jlink`
- Step 4: Verify MacOS App Structure
    - `jpackage --type app-image --name StarterFXML --module starter/com.jmsweb.fxml.starter.App --runtime-image target/starter-fxml --dest target`
- Step 5: Build DMG or PKG to Distribute on MacOS
    - `jpackage --type pkg|dmg --name test --module starter/com.jmsweb.fxml.starter.App --runtime-image target/starter-fxml --dest target`
- Step 6: Or, a Default Build (On Mac)
    - `export M2_REPO=<path to maven local repository>`
    - `jpackage --module starter/com.jmsweb.fxml.starter.App --module-path target/classes:${M2_REPO}/org/openjfx/javafx-fxml/19/javafx-fxml-19-mac.jar:${M2_REPO}/org/openjfx/javafx-controls/19/javafx-controls-19-mac.jar:${M2_REPO}/org/openjfx/javafx-graphics/19/javafx-graphics-19-mac.jar:${M2_REPO}/org/openjfx/javafx-base/19/javafx-base-19-mac.jar`

