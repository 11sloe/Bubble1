import javafx.scene.canvas.GraphicsContext;

public class Animation
{
    private GraphicsContext gc;
    
    public Animation(GraphicsContext gc_)
    {
        gc = gc_;
    }
    
    public void neueBubble()
    {
        Bubble b = new Bubble();
        
        b.zeichnen(gc);
    }
    
    public void bubbleLoeschen()
    {
    }
}