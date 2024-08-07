/*
 * Luis Chavez CIS 166
 * Project Five, JavaFX GUI!
 * This app will roll a pair of dice upon user clicking 
 * with the button provided on the pop-up GUI.
 * 
 */

/* I wanted to use the Die.java file from Assignment Three but im scared that 
JavaFX will break and not run due to packaging issues so, I just stored randint range 6 +  1 in two seperate vars, 
Id rather it work and not make things harder for me.
also, I could not find the Dice images on blackboard so I used google for some PNG's.
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.control.Button;
import java.util.Random;
// Imports I googled and copied from the JavaFX TestGUI on Blackboard...

/*
 *  NOTE:  
 *  Im gonna reference this alot for my final project to hopefully create blackjack using a GUI, 
 *  gonna try to package multiple files in hopes JavaFX does not give me a headache...
 */

// Main class for file....
public class Main extends Application {

	// Creates instances for label of window and for the singular image of the dice to actually appear. File path was off by a quote, Had me stressing
    Label myLabel;
    ImageView imageView;

    // driver func
    public static void main(String[] args) {
        launch(args);
    }
    
    // method to start the stage, no static cause roll is ever changing
    public void start(Stage stage) {
    	
    	// Creates instance of button class and displays the text below
        Button rollButton = new Button("Click to Roll a pair of Dice!");

        
        // button press rolls does rand range 6 + 1, displays both then which ever one is higher, hopefully....
        rollButton.setOnAction(event -> {
        	
        	
        	// instance of Random class labeled random, couldve used diceroll too, 
            Random random = new Random();
            
            // rand vars simulating 2 dice rolls.
            int DiceOne = random.nextInt(6) + 1;
            int Dicetwo = random.nextInt(6) + 1;
            String result = "Dice 1: " + DiceOne + " Dice 2: " + Dicetwo;
            
            // conditional as requested on the specification on BB..
            if (DiceOne > Dicetwo) {
                result += "\nDice 1 rolled higher!";
            } else if (Dicetwo > DiceOne) {
                result += "\nDice 2 rolled higher!";
            } else {
                result += "\nBoth dice rolled the same!";
            }
            
            //label to spit out results.
            myLabel.setText(result);
        });

        // Label on run, before clicking the button..
        myLabel = new Label("Rolling Rolling Rolling....");
        
        // Hbox button to make the button horizontal and not take up too much space, Wonder if I can give it color...
        HBox buttonBox = new HBox(10, rollButton);
        buttonBox.setAlignment(Pos.CENTER);

        
        // used Vbox for aligning the dice image and the button to actually show up...
        VBox root = new VBox(20, myLabel, buttonBox);
        root.setAlignment(Pos.CENTER);

        // Defines size of the window that appears
        Scene scene = new Scene(root, 1000, 800);

        //sets scene for stage instance...
        stage.setScene(scene);
        
        //window title
        stage.setTitle("Dice Roll!");

        
        // Try catch block from assignment 4.. used for checking errors/ unexpected outputss for the dice picture...
        try {
        	
        	// makes instance of class dice, 
            Image diceImage = new Image(new FileInputStream("C:/Users/golde/Desktop/SchoolMain/SCHOOL-MAIN/CIS CLASSES/JAVA/ProjectFive/Dice.png"));
            imageView = new ImageView(diceImage);
            root.getChildren().add(imageView);
        } 
        
        // catch block for errors.
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Displays the stage...
        stage.show();
    }
}



