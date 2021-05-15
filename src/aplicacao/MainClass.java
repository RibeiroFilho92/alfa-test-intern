package aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	private static Stage stageMain;
	private static Scene sceneone;
	private static Scene scenetwo;
	private static Scene scenethree;
	private static Scene scenefour;

	@Override
	public void start(Stage stage) throws Exception {
		
		stageMain = stage;
		
		Parent rootOne = FXMLLoader.load(getClass().getResource("/tela/tela.fxml"));
		sceneone = new Scene(rootOne);
		
		Parent rootTwo = FXMLLoader.load(getClass().getResource("/tela/tela2.fxml"));
		scenetwo = new Scene(rootTwo);
		
		Parent rootThree = FXMLLoader.load(getClass().getResource("/tela/tela3.fxml"));
		scenethree = new Scene(rootThree);
		
		Parent rootFour = FXMLLoader.load(getClass().getResource("/tela/tela4.fxml"));
		scenefour = new Scene(rootFour);
		
		stage.setTitle("Alfa");
		stage.setScene(sceneone);
		stage.show();
		
	}
	
	public static void changeScreen(String scr) {
		
		switch(scr) {
		case "main": stageMain.setScene(sceneone);
					 break;
		case "mat": stageMain.setScene(scenetwo);
		 			break;
		case "dep1": stageMain.setScene(scenethree);
					break;	
		case "dep2": stageMain.setScene(scenefour);
					break;
		}
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

	
}
