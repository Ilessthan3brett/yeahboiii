
/**
 * Write a description of class Frank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Frank implements Drawable
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    
    public Frank(int xValue, int yValue)
    {
        x = xValue;
        y = yValue;
    }

  
    public void draw(Graphics2D g2)
    {
      g2.setColor(Color.RED);
      Rectangle Body = new Rectangle(x,y,30,30);
      
      Polygon logo = new Polygon();
      
      logo.addPoint(x + 7 , y + 25);
      logo.addPoint(x + 7 , y + 5);
      logo.addPoint(x + 22 , y + 5);
      logo.addPoint(x + 22 , y + 10);
      logo.addPoint(x + 15 , y + 10);
      logo.addPoint(x + 15, y +13 );
      logo.addPoint(x + 22 , y + 13 );
      logo.addPoint(x + 22 , y + 16 );
      logo.addPoint(x + 15 , y + 16 );
      logo.addPoint(x + 15, y + 25 );
     
      
      g2.setColor(Color.RED);
      g2.fill(Body);
      g2.setColor(Color.BLACK);
      g2.fill(logo);
    }
}
