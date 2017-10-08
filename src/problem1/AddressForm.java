package problem1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddressForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Address Form");
     
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label lblName=new Label("Name");
        final TextField txtName=new TextField();
        VBox vName=new VBox(2);
        vName.getChildren().addAll(lblName,txtName);
         
        Label lblStreet=new Label("Street");
        final TextField txtStreet=new TextField();
        VBox vStreet=new VBox(2);
        vStreet.getChildren().addAll(lblStreet,txtStreet);

        Label lblCity = new Label("City");
        final TextField txtCity=new TextField();
        VBox vCity=new VBox(2);
        vCity.getChildren().addAll(lblCity,txtCity);
        
        HBox hbFirst=new HBox(5);
        hbFirst.setAlignment(Pos.CENTER);
        hbFirst.getChildren().addAll(vName,vStreet,vCity);
        
        Label lblState=new Label("State");
        final TextField txtState=new TextField();
        VBox vState=new VBox(2);
        vState.getChildren().addAll(lblState,txtState);
     
        Label zip=new Label("Zip");
        final TextField zipField=new TextField();
        VBox vZip=new VBox(2);
        vZip.getChildren().addAll(zip,zipField);
       
        HBox hbSecond=new HBox(5);
        hbSecond.setAlignment(Pos.CENTER);
        hbSecond.getChildren().addAll(vState,vZip);
        
        grid.add(hbFirst, 0, 1);
        grid.add(hbSecond, 0, 2);

        Button btnSubmit = new Button("Submit");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btnSubmit);        
        grid.add(hbBtn,0,3);
        
          btnSubmit.setOnAction(e->{System.out.println(txtName.getText()+ "\n" + txtStreet.getText()+"\n"+
        		txtCity.getText()+","+ txtState.getText()+"  "+zipField.getText());});
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}