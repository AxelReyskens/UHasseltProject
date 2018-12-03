/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidemenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author User
 */

public class SideMenu extends Application {
    private final String classicTheme = getClass().getResource("Resources/style.css").toExternalForm();
    private final String xmasTheme = getClass().getResource("Resources/xmas.css").toExternalForm();
    private static Stage stage;
    // Reden voor private stage:
    // De stage kan anders door iemand anders gebruikt worden indien public, hierdoor krijg je hetzelfde effect als een bankaccount vrij weggeven

    @Override
    public void start(Stage primaryStage) throws Exception {  
        stage = primaryStage;
        Font.loadFont(
        SideMenu.class.getResource("Resources/CrackMan.TTF").toExternalForm(), 
        10); // Load voor custom font
        Parent root = FXMLLoader.load(getClass().getResource("FXMLSideMenu.fxml"));
        
        stage.setTitle("PacMan Classic");
        stage.setScene(new Scene(root, 1280, 720));
        stage.getScene().getStylesheets().add(classicTheme);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public String getClassicTheme() {
        return classicTheme;
    }

    public String getXmasTheme() {
        return xmasTheme;
    }

    public static Stage getStage() {
        return stage;
    }
}
