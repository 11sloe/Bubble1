import javafx.scene.canvas.GraphicsContext;


public class Knoten
{
    // Attribute
    private Knoten naechster;
    private Bubble inhalt;

    public Knoten(Bubble inhalt_)
    {
        inhalt = inhalt_;
    }


    public void hintenEinfuegen(Bubble p)
    {
        if (naechster == null)
        {
            naechster = new Knoten(p);
        }
        else
        {
            naechster.hintenEinfuegen(p);
        }
    }
    
    public void setNaechster(Knoten k)
    {
        naechster = k;
    }

    public Knoten getNaechster()
    {
        return naechster;
    }

    public Bubble getInhalt()
    {
        return inhalt;
    }

}