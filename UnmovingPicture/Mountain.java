import java.awt.*;
import java.awt.geom.*;

/**
 * This class will create a mountain and its picture.
 * 
 * @author Mark and Sarah
 * @version Crazy Mountain Backdrop
 */

public class Mountain
{
    private int width;
    private int length;

    /**
     * This will create a mountain backdrop that will adjust to the size of the background.
     * 
     * @param x This is the width of the frame.
     * @param y This is the length of the frame.
     */
    public Mountain(int x, int y)
    {
        width = x;
        length = y;
    }

    /**
     * The Instructions that will create your mountain backdrop.
     * 
     * @param mgs a graphics context 
     */
    public void draw(Graphics2D mgs)
    {
        Rectangle sky = new Rectangle(0,0,width,length); 
        Rectangle grass = new Rectangle(0,length - (length/6),width,length/6);

        int[] xPoints1 = {0,(width/4),(width/2)};
        int[] yPoints1 = {(length-(length/6)),length-((2*length)/3),length-(length/6)};
        Polygon mountain = new Polygon(xPoints1, yPoints1, 3);

        int[] xPoints2 = {width/2, 3*width/4, width};
        int[] yPoints2 = {(length-(length/6)), length-3*length/4, (length-(length/6))};
        Polygon mountain2 = new Polygon(xPoints2, yPoints2, 3);

        Ellipse2D.Double sun = new Ellipse2D.Double(width/10, length/10, width/5, length/5);

        mgs.setColor(Color.BLUE);
        mgs.draw(sky);
        mgs.fill(sky);
        mgs.setColor(Color.GREEN);
        mgs.draw(grass);
        mgs.fill(grass);
        mgs.setColor(Color.GRAY);
        mgs.draw(mountain);
        mgs.fill(mountain);
        mgs.draw(mountain2);
        mgs.fill(mountain2);
    }
}

        
    