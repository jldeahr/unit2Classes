import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;


/**
 * Class that creates a building object.
 * 
 * @author @jldeahr
 * @version 7 October 2014
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft; //the starting x value of the object
    private int yTop;  //the starting y value of the object

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y)
    {
        xLeft = x;  //the x value of the object
        yTop = y;   //the y value of the object
    }

    /**
     *Draws a building.
     *@param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //Creates the building
        Rectangle2D.Double mainBuilding = new Rectangle2D.Double(xLeft, yTop, 275, 425);
        
        //all window rows are counting from the top of the building
        //creates the first row of windows (for the building)
        Rectangle2D.Double window11 = new Rectangle2D.Double(xLeft + 15, yTop + 15, 50, 50);
        Rectangle2D.Double window12 = new Rectangle2D.Double(xLeft + 80, yTop + 15, 50, 50);
        Rectangle2D.Double window13 = new Rectangle2D.Double(xLeft + 145, yTop + 15, 50, 50);
        Rectangle2D.Double window14 = new Rectangle2D.Double(xLeft + 210, yTop + 15, 50, 50);
        
        //creates the second row of windows (for the building)
        Rectangle2D.Double window21 = new Rectangle2D.Double(xLeft + 15, yTop + 80, 50, 50);
        Rectangle2D.Double window22 = new Rectangle2D.Double(xLeft + 80, yTop + 80, 50, 50);
        Rectangle2D.Double window23 = new Rectangle2D.Double(xLeft + 145, yTop + 80, 50, 50);
        Rectangle2D.Double window24 = new Rectangle2D.Double(xLeft + 210, yTop + 80, 50, 50);
        
        //creates the third row of windows (for the building)
        Rectangle2D.Double window31 = new Rectangle2D.Double(xLeft + 15, yTop + 145, 50, 50);
        Rectangle2D.Double window32 = new Rectangle2D.Double(xLeft + 80, yTop + 145, 50, 50);
        Rectangle2D.Double window33 = new Rectangle2D.Double(xLeft + 145, yTop + 145, 50, 50);
        Rectangle2D.Double window34 = new Rectangle2D.Double(xLeft + 210, yTop + 145, 50, 50);
        
        //creates the fourth row of windows (for the building)
        Rectangle2D.Double window41 = new Rectangle2D.Double(xLeft + 15, yTop + 210, 50, 50);
        Rectangle2D.Double window42 = new Rectangle2D.Double(xLeft + 80, yTop + 210, 50, 50);
        Rectangle2D.Double window43 = new Rectangle2D.Double(xLeft + 145, yTop + 210, 50, 50);
        Rectangle2D.Double window44 = new Rectangle2D.Double(xLeft + 210, yTop + 210, 50, 50);
        
        //creates the fifth row of windows (for the building)
        Rectangle2D.Double window51 = new Rectangle2D.Double(xLeft + 15, yTop + 275, 50, 50);
        Rectangle2D.Double window52 = new Rectangle2D.Double(xLeft + 80, yTop + 275, 50, 50);
        Rectangle2D.Double window53 = new Rectangle2D.Double(xLeft + 145, yTop + 275, 50, 50);
        Rectangle2D.Double window54 = new Rectangle2D.Double(xLeft + 210, yTop + 275, 50, 50);
        
        //creates the sixth row of windows (for the building)
        Rectangle2D.Double window61 = new Rectangle2D.Double(xLeft + 15, yTop + 340, 50, 50);
        //window62 and window63 is where the door will go.
        Rectangle2D.Double window64 = new Rectangle2D.Double(xLeft + 210, yTop + 340, 50, 50);
        
        //door1 is the left door, door2 is the right door
        Rectangle2D.Double door1 = new Rectangle2D.Double(xLeft + 80, yTop + 340, 50, 80);
        Rectangle2D.Double door2 = new Rectangle2D.Double(xLeft + 145, yTop + 340, 50, 80);
        
        //sets the color of the building
        g2.setColor(Color.BLACK);
        
        //draws and colors the building
        g2.draw(mainBuilding);
        g2.fill(mainBuilding);
        
        //sets the color of the building and the doors
        g2.setColor(Color.WHITE);
        
        //draws the first row of windows (for the building)
        g2.draw(window11);
        g2.draw(window12);
        g2.draw(window13);
        g2.draw(window14);
        
        //draws the second row of windows (for the building)
        g2.draw(window21);
        g2.draw(window22);
        g2.draw(window23);
        g2.draw(window24);
        
        //draws the third row of windows (for the building)
        g2.draw(window31);
        g2.draw(window32);
        g2.draw(window33);
        g2.draw(window34);
        
        //draws the fourth row of windows (for the building)
        g2.draw(window41);
        g2.draw(window42);
        g2.draw(window43);
        g2.draw(window44);
        
        //draws the fifth row of windows (for the building)
        g2.draw(window51);
        g2.draw(window52);
        g2.draw(window53);
        g2.draw(window54);
        
        //draws the sixth row of windows (for the building)
        g2.draw(window61);
        g2.draw(window64);
        
        //draws the left and right doors (for the building)
        g2.draw(door1);
        g2.draw(door2);
                       
        //colors the first row of windows (for the building)
        //color already set to white
        g2.fill(window11);
        g2.fill(window12);
        g2.fill(window13);
        g2.fill(window14);
        
        //colors the second row of windows (for the building)
        //color already set to white
        g2.fill(window21);
        g2.fill(window22);
        g2.fill(window23);
        g2.fill(window24);
        
        //colors the third row of windows (for the building)
        //color already set to white
        g2.fill(window31);
        g2.fill(window32);
        g2.fill(window33);
        g2.fill(window34);
        
        //colors the fourth row of windows (for the building)
        //color already set to white
        g2.fill(window41);
        g2.fill(window42);
        g2.fill(window43);
        g2.fill(window44);
        
        //colors the fifth row of windows (for the building)
        //color already set to white
        g2.fill(window51);
        g2.fill(window52);
        g2.fill(window53);
        g2.fill(window54);
        
        //colors the sixth row of windows (for the building)
        //color already set to white
        g2.fill(window61);
        g2.fill(window64);
        
        //colors the left and right doors (for the building)
        //color already set to white
        g2.fill(door1);
        g2.fill(door2);
    }

}
