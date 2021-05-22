package application;
	

import javafx.application.Application;
import java.io.File;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			DirectoryChooser directoryChooser = new DirectoryChooser();
	        directoryChooser.setTitle( "ディレクトリ選択" );
	        directoryChooser.setInitialDirectory( new File("C:\\") );
	        File f = directoryChooser.showDialog( primaryStage );
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
