import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


/**
 * Class that creates a cloud object.
 * 
 * @author @jldeahr
 * @version 7 October 2014
 */
public class Cloud
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int leng;
    private int wide;

    /**
     * Default constructor for objects of class Cloud
     */
    public Cloud(int x, int y, int length, int width)
    {
        xLeft = x;
        yTop = y;
        leng = length;
        wide = width;
    }

    /**
     *Draws the sun.
     *@param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //Hoping to do a little less hardcoding here...
        Ellipse2D.Double cloud = new Ellipse2D.Double(xLeft, yTop, leng, wide);
        
        g2.setColor(Color.GRAY);
        g2.draw(cloud);
        g2.fill(cloud);
        
    }

}