
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Controller {

    Animation animation;

    @FXML
    private Canvas canvas;

    GraphicsContext gc;


    @FXML
    void initialize() {
        gc = canvas.getGraphicsContext2D();
        animation = new Animation(gc);

    }

    
    @FXML
    public void neueBubble(Event event)
    {
        animation.neueBubble();
    }
    
     @FXML
    public void bubbleLoeschen(Event event)
    {
        animation.bubbleLoeschen();
    }

}