package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerWelcome {
    //is me fxml ko (html body type tags) connect krne hain
    // Controller will then interact with like actual logic/backend

    @FXML
    Button SignIn;

    public void SignIn (ActionEvent event) throws IOException {



        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("ManagerOptions.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);

        System.out.println("Sign In");
    }

    public void openManageStaff(ActionEvent event) throws IOException{
        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("ManageStaff.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);


    }

    public void openManageFinances(ActionEvent event) throws IOException{
        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("ManageFinances.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);

    }

    public void openUpdateTables(ActionEvent event) throws IOException{

        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("UpdateTable.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);
    }

    public void openUpdateMenu(ActionEvent event) throws IOException{
        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("UpdateMenu.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);
    }

    public void openUpdateStock(ActionEvent event) throws IOException{
        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("UpdateStock.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);

    }

    public void goBack(ActionEvent event) throws IOException{
        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("WelcomeScreen.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);

    }

    public void backToManager(ActionEvent event) throws IOException{
        Parent mainPageParent = FXMLLoader.load(sample.uiContollers.FXMLFileLoader.loadResource("ManagerOptions.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage) SignIn.getScene().getWindow();
        window.setScene(mainPageScene);
    }
    public void SignUp (ActionEvent event) {
        System.out.println("Sign Up");
    }
    public void CreateAcc (ActionEvent event) {
        System.out.println("Account Created Successfully");
    }
    public void UpdateTable (ActionEvent event) {
        System.out.println("Redirect To Update Table Screen");
    }
    public void AddRemoveTable (ActionEvent event) {
        System.out.println("Table Add/Remove Successfully");
    }
}
