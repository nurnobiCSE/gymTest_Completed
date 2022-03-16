    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gymtest;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author coder
 */
public class GymTest  extends Application{
@Override
public void start(Stage stage)throws Exception{
Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
Scene scene = new Scene(root);
stage.setScene(scene);
stage.centerOnScreen();
stage.show();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
