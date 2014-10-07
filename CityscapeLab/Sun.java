import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


/**
 * Class that creates a sun object.
 * 
 * @author @jldeahr
 * @version 7 October 2014
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;  //the beginning x value of the object
    private int yTop;   //the beginning y value of the object
    private int leng;   //the length of the object
    private int wide;   //the height of the object

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x, int y, int length, int width)
    {
        xLeft = x; //the x value of the object
        yTop = y;  //the y value of the object
        leng = length;  //the length of the object
        wide = width;   //the height of the object
    }

    /**
     *Draws the sun.
     *@param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //Hoping to do a little less hardcoding here...
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft, yTop, leng, wide);
        
        g2.draw(sun);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        
    }

}