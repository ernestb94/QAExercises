import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class JavaFXFrame extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox v = new VBox(10);
		Button btn1 = new Button("Click me!");
		Button btn2 = new Button("Don't click!");
		StackPane root = new StackPane();
		// root.setAlignment(Pos.CENTER_LEFT);
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setTitle("JavaFXFrame");
		primaryStage.setScene(scene);
		primaryStage.show();

		// LABEL
		Label firstNameLabel = new Label("First Name");
		firstNameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		Label lastNameLabel = new Label("Last Name");
		lastNameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		Label emailLabel = new Label("Email ID");
		emailLabel.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
		Label passwordLabel = new Label("Password");
		emailLabel.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
		// v.getChildren().addAll(btn1, btn2, firstNameLabel, lastNameLabel, emailLabel,
		// passwordLabel);
		// root.getChildren().addAll(v);

		// TEXT FIELD
		TextField first = new TextField("");
		first.setMaxWidth(150);
		// root.getChildren().addAll(first);

		// RADIO BUTTON
		RadioButton insert = new RadioButton("Insert recored");
		RadioButton update = new RadioButton("Update record");
		RadioButton delete = new RadioButton("Delete record");
		RadioButton viewRecords = new RadioButton("View customer records");

		ToggleGroup transaction = new ToggleGroup();

		insert.setToggleGroup(transaction);
		update.setToggleGroup(transaction);
		delete.setToggleGroup(transaction);
		viewRecords.setToggleGroup(transaction);

		update.setSelected(true);

		// v.getChildren().addAll(insert, update, delete, viewRecords);
		// root.getChildren().addAll(v);

		// CHECKBOX

		CheckBox cb1 = new CheckBox("Cricket");
		CheckBox cb2 = new CheckBox("Football");
		CheckBox cb3 = new CheckBox("Rugby");
		CheckBox cb4 = new CheckBox("Tennis");

		CheckBox checkboxList[] = { cb1, cb2, cb3, cb4 };
		v.getChildren().addAll(cb1, cb2, cb3, cb4);
		root.getChildren().addAll(v);

		for (CheckBox cb : checkboxList) {
			cb.selectedProperty().addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> obervable, Boolean oldValue, Boolean newValue) {
					if (cb.isSelected()) {
						System.out.println(cb.getText());
					}
				}
			}
			
					
					);
		}

		// BUTTON BORDER

		Button top = new Button("Top");
		Button right = new Button("Right");
		Button bottom = new Button("Bottom");
		Button left = new Button("Left");
		Button center = new Button("Center");

		BorderPane border = new BorderPane();
		border.setPadding(new Insets(10, 20, 10, 20));

		border.setTop(top);
		border.setRight(right);
		border.setBottom(bottom);
		border.setLeft(left);
		border.setCenter(center);
		// root.getChildren().addAll(border);

		// root.getChildren().addAll(v);

	}

}
