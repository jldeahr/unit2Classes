import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Component;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Default constructor for objects of class 
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // create instances of classes and invoke the draw method on each
        // ...
        
        int x = getWidth();
        int y = getHeight();
        
        Building building1 = new Building(110,110);
        Building building2 = new Building(410,110);
        Sun sun1 = new Sun(20,20,100,100);
        Background daytime = new Background(x,y);
        Cloud cloud1 = new Cloud(200,20,120,50);
        Cloud cloud2 = new Cloud(350,30,130,60);
        Cloud cloud3 = new Cloud(500,25,125,55);
        
        
        daytime.draw(g2);
        sun1.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        cloud1.draw(g2);
        cloud2.draw(g2);
        cloud3.draw(g2);
        
        
    }

}
