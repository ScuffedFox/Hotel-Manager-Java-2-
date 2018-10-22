
package hotelmanager;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.stage.Stage;




public class CreateRoomController implements Initializable {
    
    // progressBar required vars
    float totalProgress= 0; // Controls the value of progress bar
    final int infoSum = 4; // Influences the progress bar sum divison  
    
    @FXML AnchorPane background;    
    @FXML ProgressBar progressBar;
    @FXML ToolBar toolBar;
    @FXML ComboBox roomOptions, bathroomPick;
    @FXML Label numberofbeds;
    @FXML Slider BedCounter;
    @FXML ToggleButton hasKitchen, hasPrivacyBedding;
    @FXML Button shutdown, returnHome;
    
    
    @FXML
    private void closeApplication(MouseEvent event) {
        Alert warnShutdown = new Alert(Alert.AlertType.CONFIRMATION);
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
    private void homeReturn(MouseEvent event) throws IOException{
        Stage stage = (Stage) returnHome.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH); // Stops esc popup on startup
            stage.setFullScreen(true); //Launches app in fullscreen
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        background.setStyle("-fx-background-color: #87CEEB;");
        
        
        roomOptions.setStyle("-fx-font-size : 20pt");
        roomOptions.getItems().addAll(
                "Standard",
                "Penthouse",
                "Disability Support"
        );
        
        bathroomPick.setStyle("fx-font-size : 20pt");
        bathroomPick.getItems().addAll(
                "Tier 1",
                "Tier 2",
                "Tier 3"
        );
       
        
        hasKitchen.setOnMouseClicked(e ->{
           if(hasKitchen.isSelected() == true){
            System.out.println("This room has a kitchen");
            hasKitchen.setText("Has Kitchen");
        }else{
            System.out.println("This room has no kitchen");
            hasKitchen.setText("Doesn't Have Kitchen");
        }
           progressBar.setProgress(totalProgress += 1 / infoSum);
        });
       
        
        hasPrivacyBedding.setOnMouseClicked(e ->{
           if(hasPrivacyBedding.isSelected() == true){
            System.out.println("This room has private bedrooms");
            hasPrivacyBedding.setText("Has Private Bedrooms");
        }else{
            System.out.println("This room has no private bedrooms");
            hasPrivacyBedding.setText("Doesn't Have Private Bedroom");
        }
        });
    }    
    
}
