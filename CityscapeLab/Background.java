import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;


/**
 * Class that creates a rectangle which will be the background color.
 * 
 * @author @jldeahr
 * @version 16 October 2014
 */
public class Background
{
    private int leng;  //the length of the object
    private int wide;  //the width of the object

    /**
     * constructor for a background object.
     * 
     * @param
     * leng = length of background object
     * wide = width of background object
     */
    public Background(int length, int width)
    {
        leng = length;
        wide = width;
    }

    /**
     * Draws the moon.
     * @param g2 the graphics context, leng, wide
     * @return void
     */
    public void draw(Graphics2D g2)
    {
        //Hoping to do a little less hardcoding here...
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, leng, wide);
        Rectangle2D.Double grass = new Rectangle2D.Double(0, 500, leng, wide);
        
        g2.setColor(Color.BLUE);
        g2.fill(sky);
        g2.setColor(Color.GREEN);
        g2.fill(grass);
    }
}