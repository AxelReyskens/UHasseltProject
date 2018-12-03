package sidemenu;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLSideMenuController {

    SideMenu sideMenu = new SideMenu();

    @FXML
    private AnchorPane ap_main;

    @FXML
    private AnchorPane ap_gamefield;

    @FXML
    private Pane pnl_highscore;

    @FXML
    private Pane pnl_main;

    @FXML
    private Pane pnl_moeilijkheid;

    @FXML
    private VBox vbox_moeilijkheid;

    @FXML
    private JFXButton btn_easy;

    @FXML
    private JFXButton btn_medium;

    @FXML
    private JFXButton btn_hard;

    @FXML
    private Pane pnl_credits;

    @FXML
    private Pane pnl_spelers;

    @FXML
    private JFXButton btn_mraerts;

    @FXML
    private ImageView iview_mraerts;

    @FXML
    private JFXButton btn_mrlemmens;

    @FXML
    private ImageView iview_mrlemmens;

    @FXML
    private Pane pnl_thema;

    @FXML
    private VBox vbox_thema;

    @FXML
    private JFXButton btn_classic;

    @FXML
    private JFXButton btn_xmas;

    @FXML
    private AnchorPane ap_sidemenu;

    @FXML
    private AnchorPane ap_sidepane;

    @FXML
    private FontAwesomeIconView iview_home;

    @FXML
    private JFXButton btn_spelers;

    @FXML
    private JFXButton btn_moeilijkheid;

    @FXML
    private JFXButton btn_thema;

    @FXML
    private JFXButton btn_highscore;

    @FXML
    private JFXButton btn_credits;

    @FXML
    private FontAwesomeIconView iview_spelers;

    @FXML
    private FontAwesomeIconView iview_niveau;

    @FXML
    private FontAwesomeIconView iview_thema;

    @FXML
    private FontAwesomeIconView iview_highscore;

    @FXML
    private FontAwesomeIconView iview_credits;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btn_spelers) {
            pnl_spelers.toFront();
        } else if (event.getSource() == btn_moeilijkheid) {
            pnl_moeilijkheid.toFront();
        } else if (event.getSource() == btn_thema) {
            pnl_thema.toFront();
        } else if (event.getSource() == btn_highscore) {
            pnl_highscore.toFront();
        } else if (event.getSource() == btn_credits) {
            pnl_credits.toFront();
        }
    }

    @FXML
    private void changeToClassic() {
        Stage stage = SideMenu.getStage();
        stage.setTitle("PacMan Classic");
        stage.getScene().getStylesheets().clear();
        stage.getScene().setUserAgentStylesheet(null);
        stage.getScene().getStylesheets().add(sideMenu.getClassicTheme());
    }

    @FXML
    private void changeToXmas() {
        Stage stage = SideMenu.getStage();
        stage.setTitle("PacMan Christmas");
        stage.getScene().getStylesheets().clear();
        stage.getScene().setUserAgentStylesheet(null);
        stage.getScene().getStylesheets().add(sideMenu.getXmasTheme());
    }

    @FXML
    private void toMain(MouseEvent event) {
        if (event.getSource() == iview_home) {
            pnl_main.toFront();
        }
    }

    public void initialize() {
        pnl_main.toFront();
    }
}
