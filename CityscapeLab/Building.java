import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;


/**
 * Class that creates a building object.
 * 
 * @author @jldeahr
 * @version 16 October 2014
 */
public class Building
{
    private int xLeft; //the starting x value of the object
    private int yTop;  //the starting y value of the object
    Color buildingColor = null; //the color of the building
    Color windowColor = null; //the color of the windows

    /**
     * constructor for objects of class Building
     * 
     * @param
     * x = left x coordinate of building object
     * y = top y coordinate of building object
     * bc = building color
     * wc = window color
     * 
     */
    public Building(int x, int y, Color bc, Color wc)
    {
        xLeft = x;
        yTop = y;
        buildingColor = bc;
        windowColor = wc;
    }

    /**
     * 
     * Draws a building.
     * @param g2 the graphics context, xLeft, yTop, buildingColor, windowColor
     * @return void
     * 
     */
    public void draw(Graphics2D g2)
    {
        //Creates the building
        Rectangle2D.Double mainBuilding = new Rectangle2D.Double(xLeft, yTop, 275, 425);
        
        //for each window, the first number corresponds to the row and the second number refers to the column
        //creates the first row of windows 
        Rectangle2D.Double window11 = new Rectangle2D.Double(xLeft + 15, yTop + 15, 50, 50);
        Rectangle2D.Double window12 = new Rectangle2D.Double(xLeft + 80, yTop + 15, 50, 50);
        Rectangle2D.Double window13 = new Rectangle2D.Double(xLeft + 145, yTop + 15, 50, 50);
        Rectangle2D.Double window14 = new Rectangle2D.Double(xLeft + 210, yTop + 15, 50, 50);
        
        //creates the second row of windows 
        Rectangle2D.Double window21 = new Rectangle2D.Double(xLeft + 15, yTop + 80, 50, 50);
        Rectangle2D.Double window22 = new Rectangle2D.Double(xLeft + 80, yTop + 80, 50, 50);
        Rectangle2D.Double window23 = new Rectangle2D.Double(xLeft + 145, yTop + 80, 50, 50);
        Rectangle2D.Double window24 = new Rectangle2D.Double(xLeft + 210, yTop + 80, 50, 50);
        
        //creates the third row of windows 
        Rectangle2D.Double window31 = new Rectangle2D.Double(xLeft + 15, yTop + 145, 50, 50);
        Rectangle2D.Double window32 = new Rectangle2D.Double(xLeft + 80, yTop + 145, 50, 50);
        Rectangle2D.Double window33 = new Rectangle2D.Double(xLeft + 145, yTop + 145, 50, 50);
        Rectangle2D.Double window34 = new Rectangle2D.Double(xLeft + 210, yTop + 145, 50, 50);
        
        //creates the fourth row of windows 
        Rectangle2D.Double window41 = new Rectangle2D.Double(xLeft + 15, yTop + 210, 50, 50);
        Rectangle2D.Double window42 = new Rectangle2D.Double(xLeft + 80, yTop + 210, 50, 50);
        Rectangle2D.Double window43 = new Rectangle2D.Double(xLeft + 145, yTop + 210, 50, 50);
        Rectangle2D.Double window44 = new Rectangle2D.Double(xLeft + 210, yTop + 210, 50, 50);
        
        //creates the fifth row of windows 
        Rectangle2D.Double window51 = new Rectangle2D.Double(xLeft + 15, yTop + 275, 50, 50);
        Rectangle2D.Double window52 = new Rectangle2D.Double(xLeft + 80, yTop + 275, 50, 50);
        Rectangle2D.Double window53 = new Rectangle2D.Double(xLeft + 145, yTop + 275, 50, 50);
        Rectangle2D.Double window54 = new Rectangle2D.Double(xLeft + 210, yTop + 275, 50, 50);
        
        //creates the sixth row of windows 
        Rectangle2D.Double window61 = new Rectangle2D.Double(xLeft + 15, yTop + 340, 50, 50);
        //where window62 and window63 would go, is where the door will go instead.
        Rectangle2D.Double window64 = new Rectangle2D.Double(xLeft + 210, yTop + 340, 50, 50);
        
        //door1 is the left door, door2 is the right door
        Rectangle2D.Double door1 = new Rectangle2D.Double(xLeft + 80, yTop + 340, 50, 80);
        Rectangle2D.Double door2 = new Rectangle2D.Double(xLeft + 145, yTop + 340, 50, 80);
        
        //sets the color of the building
        g2.setColor(buildingColor);
        
        //colors the building
        g2.fill(mainBuilding);
        
        //sets the color of the windows and the doors
        g2.setColor(windowColor);
                                     
        //colors the first row of windows          
        g2.fill(window11);
        g2.fill(window12);
        g2.fill(window13);
        g2.fill(window14);
        
        //colors the second row of windows 
        g2.fill(window21);
        g2.fill(window22);
        g2.fill(window23);
        g2.fill(window24);
        
        //colors the third row of windows          
        g2.fill(window31);
        g2.fill(window32);
        g2.fill(window33);
        g2.fill(window34);
        
        //colors the fourth row of windows          
        g2.fill(window41);
        g2.fill(window42);
        g2.fill(window43);
        g2.fill(window44);
        
        //colors the fifth row of windows          
        g2.fill(window51);
        g2.fill(window52);
        g2.fill(window53);
        g2.fill(window54);
        
        //colors the sixth row of windows          
        g2.fill(window61);
        g2.fill(window64);
        
        //colors the doors        
        g2.fill(door1);
        g2.fill(door2);
    }
}
