import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Color;

public class Target
{
    private int xLeft = 100;
    private int yTop = 100;
    public Target(int x, int y)
    {
           
    }
    
    /**
     * Draws the target.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double outer = new Ellipse2D.Double(xLeft, yTop, 250, 250);
        Ellipse2D.Double oneIn = new Ellipse2D.Double(xLeft + 25, yTop + 25, 200, 200);
        Ellipse2D.Double twoIn = new Ellipse2D.Double(xLeft + 50, yTop + 50, 150, 150);
        Ellipse2D.Double threeIn = new Ellipse2D.Double(xLeft + 75, yTop + 75, 100, 100);
        Ellipse2D.Double center = new Ellipse2D.Double(xLeft + 100, yTop + 100, 50, 50);
        
        /**
        Ellipse2D.Double outer2 = new Ellipse2D.Double(xLeft + 15, yTop + 15, 225, 225);
        Ellipse2D.Double oneIn2 = new Ellipse2D.Double(xLeft + 35, yTop + 35, 175, 175);
        Ellipse2D.Double twoIn2 = new Ellipse2D.Double(xLeft + 65, yTop + 65, 125, 125);
        Ellipse2D.Double threeIn2 = new Ellipse2D.Double(xLeft + 85, yTop + 85,75, 75);
        Ellipse2D.Double center2 = new Ellipse2D.Double(xLeft + 105, yTop + 105, 25, 25);
        **/
                
        g2.draw(outer);
        g2.draw(oneIn);
        g2.draw(twoIn);
        g2.draw(threeIn);
        g2.draw(center);
        
        /**
        g2.draw(outer2);
        g2.draw(oneIn2);
        g2.draw(twoIn2);
        g2.draw(threeIn2);
        g2.draw(center2);
        **/
        
        g2.setColor(Color.BLACK);
        g2.fill(outer);
        g2.setColor(Color.WHITE);
        g2.fill(oneIn);
        g2.setColor(Color.BLACK);
        g2.fill(twoIn);
        g2.setColor(Color.WHITE);
        g2.fill(threeIn);
        g2.setColor(Color.BLACK);
        g2.fill(center);
    }
}
