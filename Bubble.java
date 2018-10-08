import javafx.scene.canvas.GraphicsContext;

public class Bubble
{
    private double x;
    private double y;
    private double d;

    public Bubble(){
        x = Math.random()*400;
        y = Math.random()*400;
        d = 30;
        
    }
    
    public void zeichnen(GraphicsContext gc){
        gc.strokeOval(x,y,d,d);
        
    }

}
