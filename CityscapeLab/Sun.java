import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


/**
 * Class that creates a sun object.
 * 
 * @author @jldeahr
 * @version 16 October 2014
 */
public class Sun
{
    private int xLeft;  //the beginning x value of the object
    private int yTop;   //the beginning y value of the object
    private int leng;   //the length of the object
    private int wide;   //the height of the object

    /**
     * constructor for objects of class Sun
     * 
     * @param
     * x = left x coordinate of building object
     * y = top y coordinate of building object
     * length = length of the building
     * width = height of the building
     * 
     */
    public Sun(int x, int y, int length, int width)
    {
        xLeft = x;
        yTop = y;
        leng = length;
        wide = width;
    }

    /**
     * Draws the sun.
     * @param g2 the graphics context, xLeft, yTop, length, width
     * @return void
     *
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft, yTop, leng, wide);
        
        g2.draw(sun);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
    }
}