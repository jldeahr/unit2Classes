import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft = 100;
    private int yTop = 100;

    /**
     * Default constructor for objects of class Building
     */
    public Building()
    {
        
    }

    /**
     *Draws a building.
     *@param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double mainBuilding = new Rectangle2D.Double(xLeft, yTop, 250, 400);
        Rectangle2D.Double window1 = new Rectangle2D.Double(xLeft + 5, yTop + 5, 25, 25);
        
        
        g2.draw(mainBuilding);
        g2.draw(window1);
        
        g2.setColor(Color.BLACK);
        g2.fill(mainBuilding);
        g2.setColor(Color.WHITE);
        g2.fill(window1);
    }

}
