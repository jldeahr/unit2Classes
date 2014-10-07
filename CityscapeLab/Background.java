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
    
    private int leng;  //the length of the object
    private int wide;  //the width of the object

    /**
     * Class that creates a background object.
     * 
     * @author @jldeahr
     * @version 7 October 2014
     */
    public Background(int length, int width)
    {
        leng = length;  //length of the object
        wide = width;  //width of the object
    }

    /**
     *Draws the moon.
     *@param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //Hoping to do a little less hardcoding here...
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, leng, wide);
        Rectangle2D.Double grass = new Rectangle2D.Double(0, 500, leng, wide);
        
        g2.setColor(Color.BLUE);
        g2.draw(sky);
        g2.fill(sky);
        g2.setColor(Color.GREEN);
        g2.draw(grass);
        g2.fill(grass);
        
    }

}