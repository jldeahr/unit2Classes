import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Component;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 * cityscape to these object.
 * 
 * @author @jldeahr
 * @version 16 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Default constructor for objects of class 
     * 
     * @pre     requires a JFrame
     * @post    all objects drawn
     * @param   Graphics g
     * @return  void
     * 
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;       
        
        int x = getWidth();
        int y = getHeight();
        
        Background daytime = new Background(x,y);
        Sun sun1 = new Sun(20, 20, 100, 100);
        Building building1 = new Building(110,110, Color.BLACK, Color.WHITE);
        Building building2 = new Building(410,110, Color.WHITE, Color.BLACK);        
        Cloud cloud1 = new Cloud(200, 20, 120, 50, Color.GRAY);
        Cloud cloud2 = new Cloud(350, 30, 130, 60, Color.GRAY);
        Cloud cloud3 = new Cloud(500, 25, 125, 55, Color.GRAY);        
        
        daytime.draw(g2);
        sun1.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        cloud1.draw(g2);
        cloud2.draw(g2);
        cloud3.draw(g2);        
    }
}
