
package hotelmanager;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class HotelManager extends Application {
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH); // Stops esc popup on startup
        stage.setFullScreen(true); //Launches app in fullscreen
    }
    
    public static void main(String[] args) {
        launch(args);        
    }
    
}
