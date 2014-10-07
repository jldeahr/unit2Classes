import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;


/**
 * Class that creates a rectangle which will be the background color.
 * 
 * @author @jldeahr
 * @version 7 October 2014
 */
public class Background
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft = 0;
    private int yTop = 0;

    /**
     * Default constructor for objects of class Background
     */
    public Background()
    {
        
    }

    /**
     *Draws the moon.
     *@param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //Hoping to do a little less hardcoding here...
        Rectangle2D.Double background = new Rectangle2D.Double(xLeft, yTop, 800, 600);
        
        g2.draw(background);
        g2.setColor(Color.BLUE);
        g2.fill(background);
        
    }

}