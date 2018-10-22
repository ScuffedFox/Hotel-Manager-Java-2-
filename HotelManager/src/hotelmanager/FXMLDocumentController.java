
package hotelmanager;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML AnchorPane background;
    
    @FXML private VBox navBar; // Buttons are added through scene builder
    
    @FXML private Button exitApp;
    
    @FXML private Button createRoom;
    
    @FXML private Button searchRoom;
    
    @FXML private Button schedulePage;
    
    
    @FXML
    private void closeApplication(MouseEvent event) {
        Alert warnShutdown = new Alert(AlertType.CONFIRMATION);
        warnShutdown.setTitle("Manager Service");
        warnShutdown.setHeaderText("Shutdown");
        warnShutdown.setContentText("Do you wish to shutdown this application");
        
        Optional<ButtonType> result = warnShutdown.showAndWait();
        if (result.get() == ButtonType.OK){
            System.out.println("Shutdown Application");
            System.exit(0);
        } else {
            System.out.println("Shutdown Cancelled");
        }
    }
    
    @FXML
    private void openCreateRoom(MouseEvent event) throws IOException{
        Stage stage = (Stage) createRoom.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("CreateRoom.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH); // Stops esc popup on startup
        stage.setFullScreen(true); //Launches app in fullscreen
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        background.setStyle("-fx-background-color: #87CEEB;");
        createRoom.setStyle("-fx-font: 55 impact; -fx-base: #1E90FF;");
        exitApp.setStyle("-fx-font: 55 impact; -fx-base: #1E90FF;");
        schedulePage.setStyle("-fx-font: 55 impact; -fx-base: #1E90FF;");
        searchRoom.setStyle("-fx-font: 55 impact; -fx-base: #1E90FF;");
    }    
    
}
