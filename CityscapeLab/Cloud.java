import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


/**
 * Class that creates a cloud object.
 * 
 * @author @jldeahr
 * @version 16 October 2014
 */
public class Cloud
{
    private int xLeft;  //the beginning x value of the object
    private int yTop;   //the beginning y value of the object
    private int leng;   //the length of the object
    private int wide;   //the height of the object
    Color cloudColor = null;   //the color of the object

    /**
     * constructor for objects of class Cloud
     * 
     * @param
     * x = left x coordinate of cloud object
     * y = top y coordinate of cloud object
     * leng = length of cloud object
     * wide = height of cloud object
     * cc = color of cloud object
     * 
     */
    public Cloud(int x, int y, int length, int width, Color cc)
    {
        xLeft = x;
        yTop = y;
        leng = length;
        wide = width;
        cloudColor = cc;
    }

    /**
     * Draws the sun.
     * @param g2 the graphics context, xLeft, yTop, leng, wide
     * @return void
     * 
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double cloud = new Ellipse2D.Double(xLeft, yTop, leng, wide);
        
        g2.setColor(cloudColor);
        g2.fill(cloud);
    }
}